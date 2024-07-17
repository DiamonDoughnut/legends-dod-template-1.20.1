package donut.legendsdod.net.item;

import donut.legendsdod.net.LegendsDoD;
import donut.legendsdod.net.item.custom.LegendSummonItem;
import donut.legendsdod.net.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //type essences to be gained in repeatable manner
    public static final Item ROCKESSENCE = registerItem("rock_essence", new Item(new FabricItemSettings()));
    public static final Item WATERESSENCE = registerItem("water_essence", new Item(new FabricItemSettings()));
    public static final Item ELECTRICESSENCE = registerItem("electric_essence", new Item(new FabricItemSettings()));
    public static final Item GRASSESSENCE = registerItem("grass_essence", new Item(new FabricItemSettings()));
    public static final Item POISONESSENCE = registerItem("poison_essence", new Item(new FabricItemSettings()));
    public static final Item PSYCHICESSENCE = registerItem("psychic_essence", new Item(new FabricItemSettings()));
    public static final Item FIREESSENCE = registerItem("fire_essence", new Item(new FabricItemSettings()));
    public static final Item GROUNDESSENCE = registerItem("ground_essence", new Item(new FabricItemSettings()));
    public static final Item FLYINGESSENCE = registerItem("flying_essence", new Item(new FabricItemSettings()));
    public static final Item BUGESSENCE = registerItem("bug_essence", new Item(new FabricItemSettings()));
    public static final Item NORMALESSENCE = registerItem("normal_essence", new Item(new FabricItemSettings()));
    public static final Item GHOSTESSENCE = registerItem("ghost_essence", new Item(new FabricItemSettings()));
    public static final Item FIGHTINGESSENCE = registerItem("fighting_essence", new Item(new FabricItemSettings()));
    public static final Item STEELESSENCE = registerItem("steel_essence", new Item(new FabricItemSettings()));
    public static final Item ICEESSENCE = registerItem("ice_essence", new Item(new FabricItemSettings()));
    public static final Item DRAGONESSENCE = registerItem("dragon_essence", new Item(new FabricItemSettings()));
    public static final Item DARKESSENCE = registerItem("dark_essence", new Item(new FabricItemSettings()));
    public static final Item FAIRYESSENCE = registerItem("fairy_essence", new Item(new FabricItemSettings()));

    public static final Item LEGEND_PICKAXE = registerItem("legend_pickaxe", new PickaxeItem(ModToolMaterial.LEGEND, 1, -1f, new FabricItemSettings()));
    public static final Item LEGEND_AXE = registerItem("legend_axe", new AxeItem(ModToolMaterial.LEGEND, 5, -5f, new FabricItemSettings()));
    public static final Item LEGEND_SHOVEL = registerItem("legend_shovel", new ShovelItem(ModToolMaterial.LEGEND, 1.5f, 0, new FabricItemSettings()));
    public static final Item LEGEND_HOE = registerItem("legend_hoe", new HoeItem(ModToolMaterial.LEGEND, -4, -0.5f, new FabricItemSettings()));
    public static final Item LEGEND_SWORD = registerItem("legend_sword", new SwordItem(ModToolMaterial.LEGEND, 3, -3, new FabricItemSettings()));
    public static final Item LEGEND_HELMET = registerItem("legend_helmet", new ArmorItem(ModArmorMaterials.LEGEND, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item LEGEND_CHESTPLATE = registerItem("legend_chestplate", new ArmorItem(ModArmorMaterials.LEGEND, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item LEGEND_LEGGINGS = registerItem("legend_leggings", new ArmorItem(ModArmorMaterials.LEGEND, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item LEGEND_BOOTS = registerItem("legend_boots", new ModArmorItem(ModArmorMaterials.LEGEND, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    //crystal shards - rare End ore distribution, rare in End loot chests
    public static final Item LEGENDSHARD = registerItem("legend_shard", new Item(new FabricItemSettings()));

    //catalyst item - Extremely rare drop from LegendShard Ore, Extremely rare in End loot chests
    public static final Item LEGENDSTAR = registerItem("legend_star", new Item(new FabricItemSettings()));

    //final result of catalysts - different recipes for each type of summon base
    public static final Item SUBLEGENDBASE = registerItem("sub_legend_base", new Item(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item LEGENDBASE = registerItem("legend_base", new Item(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item MYTHICBASE = registerItem("mythic_base", new Item(new FabricItemSettings().maxCount(1).fireproof()));

    //item that will be used to summon the Legendary wanted - will have GUI to accept a base and multiple essences
    public static final Item LEGENDSUMMON = registerItem("legend_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LegendsDoD.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LegendsDoD.LOGGER.info("Registering items for " + LegendsDoD.MOD_ID);
    }

}
