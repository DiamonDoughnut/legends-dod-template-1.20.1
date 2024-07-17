package donut.legendsdod.net.block;

import donut.legendsdod.net.LegendsDoD;
import donut.legendsdod.net.block.custom.InfusionAltarBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block LEGEND_ORE = registerBlock("legend_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(5f), UniformIntProvider.create(5,10)));
    public static final Block LEGEND_SHARD_BLOCK = registerBlock("legend_shard_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block LEGEND_STAR_BLOCK = registerBlock("legend_star_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));

    public static final Block INFUSION_ALTAR_BLOCK = registerBlock("infusion_altar", new InfusionAltarBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(LegendsDoD.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(LegendsDoD.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        LegendsDoD.LOGGER.info("Registering ModBlocks for " + LegendsDoD.MOD_ID);
    }
}
