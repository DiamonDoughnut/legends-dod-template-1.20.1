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
    public static final Item LEGENDSTAR = registerItem("legend_star", new Item(new FabricItemSettings().maxCount(1)));

    //final result of catalysts - different recipes for each type of summon base
    public static final Item SUBLEGENDBASE = registerItem("sub_legend_base", new Item(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item LEGENDBASE = registerItem("legend_base", new Item(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item MYTHICBASE = registerItem("mythic_base", new Item(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item ULTRABEASTBASE = registerItem("ultra_beast_base", new Item(new FabricItemSettings().maxCount(1).fireproof()));

    //items for summoning sub-legendary tier pokemon
    public static final Item ARTICUNOSUMMON = registerItem("articuno_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZAPDOSSUMMON = registerItem("zapdos_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MOLTRESSUMMON = registerItem("moltres_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item RAIKOUSUMMON = registerItem("raikou_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ENTEISUMMON = registerItem("entei_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SUICUNESUMMON = registerItem("suicune_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIROCKSUMMON = registerItem("regirock_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGICESUMMON = registerItem("regice_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGISTEELSUMMON = registerItem("registeel_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LATIASSUMMON = registerItem("latias_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LATIOSSUMMON = registerItem("latios_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item UXIESUMMON = registerItem("uxie_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item AZELFSUMMON = registerItem("azelf_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MESPRITSUMMON = registerItem("mesprit_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CRESSELIASUMMON = registerItem("cresselia_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item HEATRANSUMMON = registerItem("heatran_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIGIGASSUMMON = registerItem("regigigas_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item COBALIONSUMMON = registerItem("cobalion_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TERRAKIONSUMMON = registerItem("terrakion_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item VIRIZIONSUMMON = registerItem("virizion_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TORNADUSSUMMON = registerItem("tornadus_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item THUNDURUSSUMMON = registerItem("thundurus_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LANDORUSSUMMON = registerItem("landorus_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPUKOKOSUMMON = registerItem("tapu_koko_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPULELESUMMON = registerItem("tapu_lele_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPUBULUSUMMON = registerItem("tapu_bulu_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPUFINISUMMON = registerItem("tapu_fini_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TYPENULLSUMMON = registerItem("type:null_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SYLVALLYSUMMON = registerItem("sylvally_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KUBFUSUMMON = registerItem("kubfu_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item URSHIFUWATERSUMMON = registerItem("urshifu_water_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item URSHIFUDARKSUMMON = registerItem("urshifu_dark_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIELEKISUMMON = registerItem("regieleki_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIDRAGOSUMMON = registerItem("regidrago_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GLASTRIERSUMMON = registerItem("glastrier_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SPECTRIERSUMMON = registerItem("spectrier_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ENAMORUSSUMMON = registerItem("enamorus_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item WOCHIENSUMMON = registerItem("wo-chien_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CHIENPAOSUMMON = registerItem("chien-pao_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TINGLUSUMMON = registerItem("ting-lu_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CHIYUSUMMON = registerItem("chi-yu_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item OKIDOGISUMMON = registerItem("okidogi_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MUNKIDORISUMMON = registerItem("munkidori_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item FEZANDIPITISUMMON = registerItem("fezandipiti_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item OGERPONSUMMON = registerItem("ogerpon_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    //items for summoning legendary tier pokemon
    public static final Item MEWTWOSUMMON = registerItem("mewtwo_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LUGIASUMMON = registerItem("lugia_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item HOOHSUMMON = registerItem("ho-oh_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KYOGRESUMMON = registerItem("kyogre_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GROUDONSUMMON = registerItem("groudon_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item RAYQUAZASUMMON = registerItem("rayquaza_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item DIALGASUMMON = registerItem("dialga_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item PALKIASUMMON = registerItem("palkia_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GIRATINASUMMON = registerItem("giratina_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item RESHIRAMSUMMON = registerItem("reshiram_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZEKROMSUMMON = registerItem("zekrom_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KYUREMSUMMON = registerItem("kyurem_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item XERNEASSUMMON = registerItem("xerneas_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item YVELTALSUMMON = registerItem("yveltal_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZYGARDESUMMON = registerItem("zygarde_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item COSMOGSUMMON = registerItem("cosmog_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item COSMOEMSUMMON = registerItem("cosmoem_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SOLGALEOSUMMON = registerItem("solgaleo_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LUNALASUMMON = registerItem("lunala_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item NECROZMASUMMON = registerItem("necrozma_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZACIANSUMMON = registerItem("zacian_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZAMAZENTASUMMON = registerItem("zamazenta_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ETERNATUSSUMMON = registerItem("eternatus_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CALYREXSUMMON = registerItem("calyrex_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KORAIDONSUMMON = registerItem("koraidon_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MIRAIDONSUMMON = registerItem("miraidon_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TERAPAGOSSUMMON = registerItem("terapagos_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    //items for summoning mythical tier pokemon
    public static final Item MEWSUMMON = registerItem("mew_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CELEBISUMMON = registerItem("celebi_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item JIRACHISUMMON = registerItem("jirachi_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item DEOXYSSUMMON = registerItem("deoxys_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item PHIONESUMMON = registerItem("phione_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MANAPHYSUMMON = registerItem("manaphy_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item DARKRAISUMMON = registerItem("darkrai_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SHAYMINSUMMON = registerItem("shaymin_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ARCEUSSUMMON = registerItem("arceus_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item VICTINISUMMON = registerItem("victini_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KELDEOSUMMON = registerItem("keldeo_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MELOETTASUMMON = registerItem("meloetta_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GENESECTSUMMON = registerItem("genesect_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item DIANCIESUMMON = registerItem("diancie_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item HOOPASUMMON = registerItem("hoopa_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item VOLCANIONSUMMON = registerItem("volcanion_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MAGEARNASUMMON = registerItem("magearna_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MARSHADOWSUMMON = registerItem("marshadow_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZERAORASUMMON = registerItem("zeraora_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MELTANSUMMON = registerItem("meltan_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MELMETALSUMMON = registerItem("melmetal_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZARUDESUMMON = registerItem("zarude_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item PECHARUNTSUMMON = registerItem("pecharunt_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    //items for summoning ultra beasts
    public static final Item NIHILEGOSUMMON = registerItem("nihilego_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item BUZZWOLESUMMON = registerItem("buzzwole_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item PHEROMOSASUMMON = registerItem("pheromosa_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item XURKITREESUMMON = registerItem("xurkitree_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CELESTEELASUMMON = registerItem("celesteela_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KARTANASUMMON = registerItem("kartana_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GUZZLORDSUMMON = registerItem("guzzlord_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item POIPOLESUMMON = registerItem("poipole_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item NAGANADELSUMMON = registerItem("naganadel_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item STAKATAKASUMMON = registerItem("stakataka_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item BLACEPHALONSUMMON = registerItem("blacephalon_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LegendsDoD.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LegendsDoD.LOGGER.info("Registering items for " + LegendsDoD.MOD_ID);
    }

}
