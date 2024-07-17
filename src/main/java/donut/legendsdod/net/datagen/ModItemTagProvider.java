package donut.legendsdod.net.datagen;

import donut.legendsdod.net.item.ModItems;
import donut.legendsdod.net.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        //Essence Items
        getOrCreateTagBuilder(ModTags.Items.ESSENCE_ITEMS)
                .add(ModItems.ROCKESSENCE)
                .add(ModItems.WATERESSENCE)
                .add(ModItems.ELECTRICESSENCE)
                .add(ModItems.GRASSESSENCE)
                .add(ModItems.POISONESSENCE)
                .add(ModItems.PSYCHICESSENCE)
                .add(ModItems.FIREESSENCE)
                .add(ModItems.GROUNDESSENCE)
                .add(ModItems.FLYINGESSENCE)
                .add(ModItems.BUGESSENCE)
                .add(ModItems.NORMALESSENCE)
                .add(ModItems.GHOSTESSENCE)
                .add(ModItems.FIGHTINGESSENCE)
                .add(ModItems.STEELESSENCE)
                .add(ModItems.ICEESSENCE)
                .add(ModItems.DRAGONESSENCE)
                .add(ModItems.DARKESSENCE)
                .add(ModItems.FAIRYESSENCE);
        //Legend Crystals
        getOrCreateTagBuilder(ModTags.Items.LEGEND_CRYSTALS)
                .add(ModItems.LEGENDSHARD)
                .add(ModItems.SUBLEGENDBASE)
                .add(ModItems.LEGENDBASE)
                .add(ModItems.LEGENDSTAR)
                .add(ModItems.MYTHICBASE);
        //make armor trimmable
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.LEGEND_HELMET, ModItems.LEGEND_CHESTPLATE, ModItems.LEGEND_LEGGINGS, ModItems.LEGEND_BOOTS);
        //summon items
        getOrCreateTagBuilder(ModTags.Items.LEGEND_SUMMON)
                .add(ModItems.LEGENDSUMMON);

    }
}
