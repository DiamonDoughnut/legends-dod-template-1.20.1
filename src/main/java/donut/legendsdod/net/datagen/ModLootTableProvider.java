package donut.legendsdod.net.datagen;

import donut.legendsdod.net.block.ModBlocks;
import donut.legendsdod.net.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //blocks that drop themselves
        addDrop(ModBlocks.LEGEND_SHARD_BLOCK);

        addDrop(ModBlocks.INFUSION_ALTAR_BLOCK);

        addDrop(ModBlocks.LEGEND_ORE, legendOreDrops(ModBlocks.LEGEND_ORE, ModItems.LEGENDSHARD));



    }
    //function for ore drops - new function needed for each different acting ore
    public LootTable.Builder legendOreDrops(Block drop, Item item) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        drop,((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))


                )


        );
    }
}
