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
    public static final Item PASTPARADOXBASE = registerItem("pastparadox_base", new Item(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item FUTUREPARADOXBASE = registerItem("futureparadox_base", new Item(new FabricItemSettings().maxCount(1).fireproof()));

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
    public static final Item TAPUKOKOSUMMON = registerItem("tapukoko_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPULELESUMMON = registerItem("tapulele_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPUBULUSUMMON = registerItem("tapubulu_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPUFINISUMMON = registerItem("tapufini_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TYPENULLSUMMON = registerItem("typenull_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SYLVALLYSUMMON = registerItem("sylvally_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KUBFUSUMMON = registerItem("kubfu_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
//    public static final Item URSHIFUWATERSUMMON = registerItem("urshifu_water_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
//    public static final Item URSHIFUDARKSUMMON = registerItem("urshifu_dark_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIELEKISUMMON = registerItem("regieleki_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIDRAGOSUMMON = registerItem("regidrago_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GLASTRIERSUMMON = registerItem("glastrier_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SPECTRIERSUMMON = registerItem("spectrier_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ENAMORUSSUMMON = registerItem("enamorus_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item WOCHIENSUMMON = registerItem("wochien_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CHIENPAOSUMMON = registerItem("chienpao_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TINGLUSUMMON = registerItem("tinglu_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CHIYUSUMMON = registerItem("chiyu_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item OKIDOGISUMMON = registerItem("okidogi_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MUNKIDORISUMMON = registerItem("munkidori_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item FEZANDIPITISUMMON = registerItem("fezandipiti_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item OGERPONSUMMON = registerItem("ogerpon_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    //items for summoning legendary tier pokemon
    public static final Item MEWTWOSUMMON = registerItem("mewtwo_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LUGIASUMMON = registerItem("lugia_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item HOOHSUMMON = registerItem("hooh_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
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

    //items for summoning paradox pokemon
    public static final Item GREATTUSKSUMMON = registerItem("greattusk_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SCREAMTAILSUMMON = registerItem("screamtail_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item BRUTEBONNETSUMMON = registerItem("brutebonnet_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item FLUTTERMANESUMMON = registerItem("fluttermane_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SLITHERWINGSUMMON = registerItem("slitherwing_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SANDYSHOCKSSUMMON = registerItem("sandyshocks_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ROARINGMOONSUMMON = registerItem("roaringmoon_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item WALKINGWAKESUMMON = registerItem("walkingwake_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GOUGINGFIRESUMMON = registerItem("gougingfire_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item RAGINGBOLTSUMMON = registerItem("ragingbolt_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONTREADSSUMMON = registerItem("irontreads_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONBUNDLESUMMON = registerItem("ironbundle_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONHANDSSUMMON = registerItem("ironhands_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONJUGULISSUMMON = registerItem("ironjugulis_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONMOTHSUMMON = registerItem("ironmoth_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONTHORNSSUMMON = registerItem("ironthorns_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONVALIANTSUMMON = registerItem("ironvaliant_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONLEAVESSUMMON = registerItem("ironleaves_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONBOULDERSUMMON = registerItem("ironboulder_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONCROWNSUMMON = registerItem("ironcrown_summon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ARTICUNOSUMMONSHINY = registerItem("articuno_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZAPDOSSUMMONSHINY = registerItem("zapdos_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MOLTRESSUMMONSHINY = registerItem("moltres_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item RAIKOUSUMMONSHINY = registerItem("raikou_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ENTEISUMMONSHINY = registerItem("entei_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SUICUNESUMMONSHINY = registerItem("suicune_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIROCKSUMMONSHINY = registerItem("regirock_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGICESUMMONSHINY = registerItem("regice_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGISTEELSUMMONSHINY = registerItem("registeel_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LATIASSUMMONSHINY = registerItem("latias_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LATIOSSUMMONSHINY = registerItem("latios_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item UXIESUMMONSHINY = registerItem("uxie_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item AZELFSUMMONSHINY = registerItem("azelf_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MESPRITSUMMONSHINY = registerItem("mesprit_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CRESSELIASUMMONSHINY = registerItem("cresselia_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item HEATRANSUMMONSHINY = registerItem("heatran_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIGIGASSUMMONSHINY = registerItem("regigigas_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item COBALIONSUMMONSHINY = registerItem("cobalion_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TERRAKIONSUMMONSHINY = registerItem("terrakion_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item VIRIZIONSUMMONSHINY = registerItem("virizion_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TORNADUSSUMMONSHINY = registerItem("tornadus_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item THUNDURUSSUMMONSHINY = registerItem("thundurus_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LANDORUSSUMMONSHINY = registerItem("landorus_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPUKOKOSUMMONSHINY = registerItem("tapukoko_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPULELESUMMONSHINY = registerItem("tapulele_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPUBULUSUMMONSHINY = registerItem("tapubulu_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPUFINISUMMONSHINY = registerItem("tapufini_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TYPENULLSUMMONSHINY = registerItem("typenull_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SYLVALLYSUMMONSHINY = registerItem("sylvally_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KUBFUSUMMONSHINY = registerItem("kubfu_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
//    public static final Item URSHIFUWATERSUMMONSHINY = registerItem("urshifu_water_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
//    public static final Item URSHIFUDARKSUMMONSHINY = registerItem("urshifu_dark_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIELEKISUMMONSHINY = registerItem("regieleki_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIDRAGOSUMMONSHINY = registerItem("regidrago_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GLASTRIERSUMMONSHINY = registerItem("glastrier_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SPECTRIERSUMMONSHINY = registerItem("spectrier_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ENAMORUSSUMMONSHINY = registerItem("enamorus_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item WOCHIENSUMMONSHINY = registerItem("wochien_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CHIENPAOSUMMONSHINY = registerItem("chienpao_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TINGLUSUMMONSHINY = registerItem("tinglu_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CHIYUSUMMONSHINY = registerItem("chiyu_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item OKIDOGISUMMONSHINY = registerItem("okidogi_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MUNKIDORISUMMONSHINY = registerItem("munkidori_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item FEZANDIPITISUMMONSHINY = registerItem("fezandipiti_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item OGERPONSUMMONSHINY = registerItem("ogerpon_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    //items for summoning legendary tier pokemon
    public static final Item MEWTWOSUMMONSHINY = registerItem("mewtwo_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LUGIASUMMONSHINY = registerItem("lugia_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item HOOHSUMMONSHINY = registerItem("hooh_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KYOGRESUMMONSHINY = registerItem("kyogre_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GROUDONSUMMONSHINY = registerItem("groudon_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item RAYQUAZASUMMONSHINY = registerItem("rayquaza_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item DIALGASUMMONSHINY = registerItem("dialga_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item PALKIASUMMONSHINY = registerItem("palkia_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GIRATINASUMMONSHINY = registerItem("giratina_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item RESHIRAMSUMMONSHINY = registerItem("reshiram_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZEKROMSUMMONSHINY = registerItem("zekrom_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KYUREMSUMMONSHINY = registerItem("kyurem_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item XERNEASSUMMONSHINY = registerItem("xerneas_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item YVELTALSUMMONSHINY = registerItem("yveltal_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZYGARDESUMMONSHINY = registerItem("zygarde_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item COSMOGSUMMONSHINY = registerItem("cosmog_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item COSMOEMSUMMONSHINY = registerItem("cosmoem_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SOLGALEOSUMMONSHINY = registerItem("solgaleo_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LUNALASUMMONSHINY = registerItem("lunala_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item NECROZMASUMMONSHINY = registerItem("necrozma_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZACIANSUMMONSHINY = registerItem("zacian_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZAMAZENTASUMMONSHINY = registerItem("zamazenta_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ETERNATUSSUMMONSHINY = registerItem("eternatus_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CALYREXSUMMONSHINY = registerItem("calyrex_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KORAIDONSUMMONSHINY = registerItem("koraidon_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MIRAIDONSUMMONSHINY = registerItem("miraidon_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TERAPAGOSSUMMONSHINY = registerItem("terapagos_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    //items for summoning mythical tier pokemon
    public static final Item MEWSUMMONSHINY = registerItem("mew_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CELEBISUMMONSHINY = registerItem("celebi_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item JIRACHISUMMONSHINY = registerItem("jirachi_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item DEOXYSSUMMONSHINY = registerItem("deoxys_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item PHIONESUMMONSHINY = registerItem("phione_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MANAPHYSUMMONSHINY = registerItem("manaphy_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item DARKRAISUMMONSHINY = registerItem("darkrai_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SHAYMINSUMMONSHINY = registerItem("shaymin_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ARCEUSSUMMONSHINY = registerItem("arceus_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item VICTINISUMMONSHINY = registerItem("victini_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KELDEOSUMMONSHINY = registerItem("keldeo_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MELOETTASUMMONSHINY = registerItem("meloetta_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GENESECTSUMMONSHINY = registerItem("genesect_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item DIANCIESUMMONSHINY = registerItem("diancie_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item HOOPASUMMONSHINY = registerItem("hoopa_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item VOLCANIONSUMMONSHINY = registerItem("volcanion_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MAGEARNASUMMONSHINY = registerItem("magearna_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MARSHADOWSUMMONSHINY = registerItem("marshadow_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZERAORASUMMONSHINY = registerItem("zeraora_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MELTANSUMMONSHINY = registerItem("meltan_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MELMETALSUMMONSHINY = registerItem("melmetal_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZARUDESUMMONSHINY = registerItem("zarude_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item PECHARUNTSUMMONSHINY = registerItem("pecharunt_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    //items for summoning ultra beasts
    public static final Item NIHILEGOSUMMONSHINY = registerItem("nihilego_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item BUZZWOLESUMMONSHINY = registerItem("buzzwole_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item PHEROMOSASUMMONSHINY = registerItem("pheromosa_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item XURKITREESUMMONSHINY = registerItem("xurkitree_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CELESTEELASUMMONSHINY = registerItem("celesteela_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KARTANASUMMONSHINY = registerItem("kartana_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GUZZLORDSUMMONSHINY = registerItem("guzzlord_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item POIPOLESUMMONSHINY = registerItem("poipole_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item NAGANADELSUMMONSHINY = registerItem("naganadel_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item STAKATAKASUMMONSHINY = registerItem("stakataka_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item BLACEPHALONSUMMONSHINY = registerItem("blacephalon_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    //items for summoning paradox pokemon
    public static final Item GREATTUSKSUMMONSHINY = registerItem("greattusk_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SCREAMTAILSUMMONSHINY = registerItem("screamtail_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item BRUTEBONNETSUMMONSHINY = registerItem("brutebonnet_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item FLUTTERMANESUMMONSHINY = registerItem("fluttermane_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SLITHERWINGSUMMONSHINY = registerItem("slitherwing_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SANDYSHOCKSSUMMONSHINY = registerItem("sandyshocks_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ROARINGMOONSUMMONSHINY = registerItem("roaringmoon_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item WALKINGWAKESUMMONSHINY = registerItem("walkingwake_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GOUGINGFIRESUMMONSHINY = registerItem("gougingfire_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item RAGINGBOLTSUMMONSHINY = registerItem("ragingbolt_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONTREADSSUMMONSHINY = registerItem("irontreads_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONBUNDLESUMMONSHINY = registerItem("ironbundle_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONHANDSSUMMONSHINY = registerItem("ironhands_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONJUGULISSUMMONSHINY = registerItem("ironjugulis_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONMOTHSUMMONSHINY = registerItem("ironmoth_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONTHORNSSUMMONSHINY = registerItem("ironthorns_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONVALIANTSUMMONSHINY = registerItem("ironvaliant_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONLEAVESSUMMONSHINY = registerItem("ironleaves_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONBOULDERSUMMONSHINY = registerItem("ironboulder_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONCROWNSUMMONSHINY = registerItem("ironcrown_summon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LegendsDoD.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LegendsDoD.LOGGER.info("Registering items for " + LegendsDoD.MOD_ID);
    }

}
