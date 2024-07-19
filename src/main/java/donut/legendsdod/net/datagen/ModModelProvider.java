package donut.legendsdod.net.datagen;

import donut.legendsdod.net.block.ModBlocks;
import donut.legendsdod.net.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEGEND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEGEND_SHARD_BLOCK);


        blockStateModelGenerator.registerSimpleState(ModBlocks.INFUSION_ALTAR_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //essence items
        itemModelGenerator.register(ModItems.ROCKESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WATERESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ELECTRICESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRASSESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.POISONESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PSYCHICESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIREESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GROUNDESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLYINGESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUGESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NORMALESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GHOSTESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIGHTINGESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEELESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ICEESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGONESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARKESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FAIRYESSENCE, Models.GENERATED);
        //legend crystals
        itemModelGenerator.register(ModItems.LEGENDSHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUBLEGENDBASE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEGENDBASE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHICBASE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEGENDSTAR, Models.GENERATED);
        //legend tools
        itemModelGenerator.register(ModItems.LEGEND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LEGEND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LEGEND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LEGEND_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LEGEND_SWORD, Models.HANDHELD);
        //legend armor
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LEGEND_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LEGEND_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LEGEND_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LEGEND_BOOTS));
        //summon items
        itemModelGenerator.register(ModItems.MEWTWOSUMMON, Models.GENERATED);
    }
}
