package donut.legendsdod.net.item;

import donut.legendsdod.net.LegendsDoD;
import donut.legendsdod.net.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static donut.legendsdod.net.item.ModItems.*;

public class ModItemGroups {
    //no need for multiple item groups unless decided to have separate item for every summon
    public static final ItemGroup LEGEND_REWORK = Registry.register(Registries.ITEM_GROUP, new Identifier(LegendsDoD.MOD_ID, "legends_rework"), FabricItemGroup.builder().displayName(Text.of("Legend Rework")).icon(() -> new ItemStack(LEGENDSHARD)).entries((displayContext, entries) -> {
        //essences for type based legend selection
        entries.add(ROCKESSENCE);
        entries.add(WATERESSENCE);
        entries.add(ELECTRICESSENCE);
        entries.add(GRASSESSENCE);
        entries.add(POISONESSENCE);
        entries.add(PSYCHICESSENCE);
        entries.add(FIREESSENCE);
        entries.add(GROUNDESSENCE);
        entries.add(FLYINGESSENCE);
        entries.add(BUGESSENCE);
        entries.add(NORMALESSENCE);
        entries.add(GHOSTESSENCE);
        entries.add(FIGHTINGESSENCE);
        entries.add(STEELESSENCE);
        entries.add(ICEESSENCE);
        entries.add(DRAGONESSENCE);
        entries.add(DARKESSENCE);
        entries.add(FAIRYESSENCE);
        //crystals and catalysts
        entries.add(LEGENDSHARD);
        entries.add(SUBLEGENDBASE);
        entries.add(LEGENDBASE);
        entries.add(MYTHICBASE);
        entries.add(LEGENDSTAR);
        entries.add(ModBlocks.INFUSION_ALTAR_BLOCK);
        //legend summon
        entries.add(LEGENDSUMMON);

        //add blocks
        entries.add(ModBlocks.LEGEND_ORE);
        entries.add(ModBlocks.LEGEND_SHARD_BLOCK);
        entries.add(ModBlocks.LEGEND_STAR_BLOCK);
    }).build());

    public static final ItemGroup LEGEND_TOOLS = Registry.register(Registries.ITEM_GROUP, new Identifier(LegendsDoD.MOD_ID, "legend_tools"), FabricItemGroup.builder().displayName(Text.of("Legend Tools")).icon(()-> new ItemStack(LEGEND_PICKAXE)).entries((displayContext, entries) -> {
        entries.add(LEGEND_PICKAXE);
        entries.add(LEGEND_AXE);
        entries.add(LEGEND_HOE);
        entries.add(LEGEND_SHOVEL);
        entries.add(LEGEND_SWORD);

        entries.add(LEGEND_HELMET);
        entries.add(LEGEND_CHESTPLATE);
        entries.add(LEGEND_LEGGINGS);
        entries.add(LEGEND_BOOTS);
    }).build());

    public static void registerItemGroups() {
        LegendsDoD.LOGGER.info("Registering Item Groups for " + LegendsDoD.MOD_ID);
    }
}
