package donut.legendsdod.net.block.entity;

import donut.legendsdod.net.item.ModItems;
import donut.legendsdod.net.screen.InfusionAltarScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class InfusionAltarBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(9, ItemStack.EMPTY);

    private static final int CENTER_SLOT = 0;
    private static final int INPUT_SLOT1 = 1;
    private static final int INPUT_SLOT2 = 2;
    private static final int INPUT_SLOT3 = 3;
    private static final int INPUT_SLOT4 = 4;
    private static final int INPUT_SLOT5 = 5;
    private static final int INPUT_SLOT6 = 6;
    private static final int INPUT_SLOT7 = 7;
    private static final int INPUT_SLOT8 = 8;
    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 72;

    public InfusionAltarBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.INFUSION_ALTAR_BLOCK_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> InfusionAltarBlockEntity.this.progress;
                    case 1 -> InfusionAltarBlockEntity.this.maxProgress;
                    default -> 0;
                };

            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> InfusionAltarBlockEntity.this.progress = value;
                    case 1 -> InfusionAltarBlockEntity.this.maxProgress = value;
                }

            }

            @Override
            public int size() {
                return 2;
            }
        };
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new InfusionAltarScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {

        buf.writeBlockPos(this.pos);

    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("infusion_altar.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
        progress = nbt.getInt("infusion_altar.progress");
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("infusion_altar");
    }

    public void tick(World world, BlockPos pos, BlockState state) {
        if(world.isClient()) {
            return;
        }

        if(isOutputSlotEmptyOrReceivable()) {
            if(this.hasRecipe()) {
                this.increaseCraftProgress();
                markDirty(world, pos, state);


                if (hasCraftingFinished()) {
                    this.craftItem();
                    this.resetProgress();
                }
            }
            else {
                this.resetProgress();
            }
        } else {
            this.resetProgress();
            markDirty(world, pos, state);

        }

    }

    private void resetProgress() {
        this.progress = 0;
    }

    private void craftItem() {
        this.removeStack(CENTER_SLOT, 1);
        this.removeStack(INPUT_SLOT1, 1);
        this.removeStack(INPUT_SLOT2, 1);
        this.removeStack(INPUT_SLOT3, 1);
        this.removeStack(INPUT_SLOT4, 1);
        this.removeStack(INPUT_SLOT5, 1);
        this.removeStack(INPUT_SLOT6, 1);
        this.removeStack(INPUT_SLOT7, 1);
        this.removeStack(INPUT_SLOT8, 1);
        ItemStack result = new ItemStack(ModItems.SUBLEGENDBASE);

        this.setStack(CENTER_SLOT, new ItemStack(result.getItem(), getStack(CENTER_SLOT).getCount() + result.getCount()));
    }

    private boolean hasCraftingFinished() {
        return progress >= maxProgress;
    }


    private void increaseCraftProgress() {
        progress++;
    }

    private boolean hasRecipe() {
        ItemStack result = new ItemStack(ModItems.SUBLEGENDBASE);
        boolean hasInput0 = getStack(CENTER_SLOT).getItem() == ModItems.LEGENDSTAR;
        boolean hasInput1 = getStack(INPUT_SLOT1).getItem() == ModItems.LEGENDSHARD;
        boolean hasInput2 = getStack(INPUT_SLOT2).getItem() == ModItems.LEGENDSHARD;
        boolean hasInput3 = getStack(INPUT_SLOT3).getItem() == ModItems.LEGENDSHARD;
        boolean hasInput4 = getStack(INPUT_SLOT4).getItem() == ModItems.LEGENDSHARD;
        boolean hasInput5 = getStack(INPUT_SLOT5).getItem() == ModItems.LEGENDSHARD;
        boolean hasInput6 = getStack(INPUT_SLOT6).getItem() == ModItems.LEGENDSHARD;
        boolean hasInput7 = getStack(INPUT_SLOT7).getItem() == ModItems.LEGENDSHARD;
        boolean hasInput8 = getStack(INPUT_SLOT8).getItem() == ModItems.LEGENDSHARD;
        boolean hasInputAll = hasInput0 && hasInput1 && hasInput2 && hasInput3 && hasInput4 && hasInput5 && hasInput6 && hasInput7 && hasInput8;
        return hasInputAll && canInsertAmountIntoOutputSlot(result) && canInsertItemIntoOutputSlot(result.getItem());
    }

    private boolean canInsertItemIntoOutputSlot(Item item) {
        return this.getStack(CENTER_SLOT).isOf(ModItems.LEGENDSTAR);
    }

    private boolean canInsertAmountIntoOutputSlot(ItemStack result) {
        return this.getStack(CENTER_SLOT).getCount() <= 1;
    }

    private boolean isOutputSlotEmptyOrReceivable() {
        return this.getStack(CENTER_SLOT).isEmpty() || this.getStack(CENTER_SLOT).isOf(ModItems.LEGENDSTAR);
    }
}
