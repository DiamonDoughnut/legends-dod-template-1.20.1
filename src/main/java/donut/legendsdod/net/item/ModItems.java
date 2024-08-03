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
    public static final Item UNSTABLEPARADOX = registerItem("unstable_paradox", new Item(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item PASTPARADOXBASE = registerItem("pastparadox_base", new Item(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item FUTUREPARADOXBASE = registerItem("futureparadox_base", new Item(new FabricItemSettings().maxCount(1).fireproof()));

    //items for summoning sub-legendary tier pokemon
    public static final Item ARTICUNOSUMMON = registerItem("articuno", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ARTICUNOGALARSUMMON = registerItem("articuno_galar", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZAPDOSSUMMON = registerItem("zapdos", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZAPDOSGALARSUMMON = registerItem("zapdos_galar", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MOLTRESSUMMON = registerItem("moltres", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MOLTRESGALARSUMMON = registerItem("moltres_galar", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item RAIKOUSUMMON = registerItem("raikou", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ENTEISUMMON = registerItem("entei", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SUICUNESUMMON = registerItem("suicune", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIROCKSUMMON = registerItem("regirock", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGICESUMMON = registerItem("regice", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGISTEELSUMMON = registerItem("registeel", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LATIASSUMMON = registerItem("latias", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LATIOSSUMMON = registerItem("latios", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item UXIESUMMON = registerItem("uxie", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item AZELFSUMMON = registerItem("azelf", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MESPRITSUMMON = registerItem("mesprit", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CRESSELIASUMMON = registerItem("cresselia", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item HEATRANSUMMON = registerItem("heatran", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIGIGASSUMMON = registerItem("regigigas", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item COBALIONSUMMON = registerItem("cobalion", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TERRAKIONSUMMON = registerItem("terrakion", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item VIRIZIONSUMMON = registerItem("virizion", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TORNADUSSUMMON = registerItem("tornadus", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item THUNDURUSSUMMON = registerItem("thundurus", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LANDORUSSUMMON = registerItem("landorus", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPUKOKOSUMMON = registerItem("tapukoko", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPULELESUMMON = registerItem("tapulele", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPUBULUSUMMON = registerItem("tapubulu", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPUFINISUMMON = registerItem("tapufini", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TYPENULLSUMMON = registerItem("typenull", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SILVALLYSUMMON = registerItem("silvally", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KUBFUSUMMON = registerItem("kubfu", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
//    public static final Item URSHIFUWATERSUMMON = registerItem("urshifu_water", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
//    public static final Item URSHIFUDARKSUMMON = registerItem("urshifu_dark", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIELEKISUMMON = registerItem("regieleki", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIDRAGOSUMMON = registerItem("regidrago", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GLASTRIERSUMMON = registerItem("glastrier", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SPECTRIERSUMMON = registerItem("spectrier", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ENAMORUSSUMMON = registerItem("enamorus", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item WOCHIENSUMMON = registerItem("wochien", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CHIENPAOSUMMON = registerItem("chienpao", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TINGLUSUMMON = registerItem("tinglu", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CHIYUSUMMON = registerItem("chiyu", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item OKIDOGISUMMON = registerItem("okidogi", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MUNKIDORISUMMON = registerItem("munkidori", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item FEZANDIPITISUMMON = registerItem("fezandipiti", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item OGERPONSUMMON = registerItem("ogerpon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    //items for summoning legendary tier pokemon
    public static final Item MEWTWOSUMMON = registerItem("mewtwo", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LUGIASUMMON = registerItem("lugia", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item HOOHSUMMON = registerItem("hooh", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KYOGRESUMMON = registerItem("kyogre", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GROUDONSUMMON = registerItem("groudon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item RAYQUAZASUMMON = registerItem("rayquaza", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item DIALGASUMMON = registerItem("dialga", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item PALKIASUMMON = registerItem("palkia", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GIRATINASUMMON = registerItem("giratina", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item RESHIRAMSUMMON = registerItem("reshiram", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZEKROMSUMMON = registerItem("zekrom", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KYUREMSUMMON = registerItem("kyurem", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item XERNEASSUMMON = registerItem("xerneas", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item YVELTALSUMMON = registerItem("yveltal", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZYGARDESUMMON = registerItem("zygarde", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item COSMOGSUMMON = registerItem("cosmog", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item COSMOEMSUMMON = registerItem("cosmoem", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SOLGALEOSUMMON = registerItem("solgaleo", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LUNALASUMMON = registerItem("lunala", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item NECROZMASUMMON = registerItem("necrozma", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZACIANSUMMON = registerItem("zacian", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZAMAZENTASUMMON = registerItem("zamazenta", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ETERNATUSSUMMON = registerItem("eternatus", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CALYREXSUMMON = registerItem("calyrex", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KORAIDONSUMMON = registerItem("koraidon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MIRAIDONSUMMON = registerItem("miraidon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TERAPAGOSSUMMON = registerItem("terapagos", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    //items for summoning mythical tier pokemon
    public static final Item MEWSUMMON = registerItem("mew", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CELEBISUMMON = registerItem("celebi", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item JIRACHISUMMON = registerItem("jirachi", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item DEOXYSSUMMON = registerItem("deoxys", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item PHIONESUMMON = registerItem("phione", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MANAPHYSUMMON = registerItem("manaphy", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item DARKRAISUMMON = registerItem("darkrai", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SHAYMINSUMMON = registerItem("shaymin", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ARCEUSSUMMON = registerItem("arceus", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item VICTINISUMMON = registerItem("victini", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KELDEOSUMMON = registerItem("keldeo", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MELOETTASUMMON = registerItem("meloetta", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GENESECTSUMMON = registerItem("genesect", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item DIANCIESUMMON = registerItem("diancie", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item HOOPASUMMON = registerItem("hoopa", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item VOLCANIONSUMMON = registerItem("volcanion", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MAGEARNASUMMON = registerItem("magearna", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MARSHADOWSUMMON = registerItem("marshadow", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZERAORASUMMON = registerItem("zeraora", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MELTANSUMMON = registerItem("meltan", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MELMETALSUMMON = registerItem("melmetal", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZARUDESUMMON = registerItem("zarude", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item PECHARUNTSUMMON = registerItem("pecharunt", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    //items for summoning ultra beasts
    public static final Item NIHILEGOSUMMON = registerItem("nihilego", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item BUZZWOLESUMMON = registerItem("buzzwole", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item PHEROMOSASUMMON = registerItem("pheromosa", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item XURKITREESUMMON = registerItem("xurkitree", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CELESTEELASUMMON = registerItem("celesteela", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KARTANASUMMON = registerItem("kartana", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GUZZLORDSUMMON = registerItem("guzzlord", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item POIPOLESUMMON = registerItem("poipole", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item NAGANADELSUMMON = registerItem("naganadel", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item STAKATAKASUMMON = registerItem("stakataka", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item BLACEPHALONSUMMON = registerItem("blacephalon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    //items for summoning past paradox pokemon
    public static final Item GREATTUSKSUMMON = registerItem("greattusk", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SCREAMTAILSUMMON = registerItem("screamtail", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item BRUTEBONNETSUMMON = registerItem("brutebonnet", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item FLUTTERMANESUMMON = registerItem("fluttermane", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SLITHERWINGSUMMON = registerItem("slitherwing", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SANDYSHOCKSSUMMON = registerItem("sandyshocks", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ROARINGMOONSUMMON = registerItem("roaringmoon", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item WALKINGWAKESUMMON = registerItem("walkingwake", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GOUGINGFIRESUMMON = registerItem("gougingfire", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item RAGINGBOLTSUMMON = registerItem("ragingbolt", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    //items for summoning future paradox pokemon
    public static final Item IRONTREADSSUMMON = registerItem("irontreads", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONBUNDLESUMMON = registerItem("ironbundle", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONHANDSSUMMON = registerItem("ironhands", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONJUGULISSUMMON = registerItem("ironjugulis", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONMOTHSUMMON = registerItem("ironmoth", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONTHORNSSUMMON = registerItem("ironthorns", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONVALIANTSUMMON = registerItem("ironvaliant", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONLEAVESSUMMON = registerItem("ironleaves", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONBOULDERSUMMON = registerItem("ironboulder", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONCROWNSUMMON = registerItem("ironcrown", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    //Shiny Summon items are meant for event givaways, etc. and so won't have recipes
    //items for summoning shiny variants of sub-legends
    public static final Item ARTICUNOSUMMONSHINY = registerItem("articuno_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ARTICUNOGALARSUMMONSHINY = registerItem("articuno_galar_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZAPDOSSUMMONSHINY = registerItem("zapdos_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZAPDOSGALARSUMMONSHINY = registerItem("zapdos_galar_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MOLTRESSUMMONSHINY = registerItem("moltres_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MOLTRESGALARSUMMONSHINY = registerItem("moltres_galar_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item RAIKOUSUMMONSHINY = registerItem("raikou_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ENTEISUMMONSHINY = registerItem("entei_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SUICUNESUMMONSHINY = registerItem("suicune_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIROCKSUMMONSHINY = registerItem("regirock_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGICESUMMONSHINY = registerItem("regice_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGISTEELSUMMONSHINY = registerItem("registeel_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LATIASSUMMONSHINY = registerItem("latias_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LATIOSSUMMONSHINY = registerItem("latios_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item UXIESUMMONSHINY = registerItem("uxie_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item AZELFSUMMONSHINY = registerItem("azelf_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MESPRITSUMMONSHINY = registerItem("mesprit_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CRESSELIASUMMONSHINY = registerItem("cresselia_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item HEATRANSUMMONSHINY = registerItem("heatran_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIGIGASSUMMONSHINY = registerItem("regigigas_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item COBALIONSUMMONSHINY = registerItem("cobalion_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TERRAKIONSUMMONSHINY = registerItem("terrakion_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item VIRIZIONSUMMONSHINY = registerItem("virizion_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TORNADUSSUMMONSHINY = registerItem("tornadus_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item THUNDURUSSUMMONSHINY = registerItem("thundurus_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LANDORUSSUMMONSHINY = registerItem("landorus_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPUKOKOSUMMONSHINY = registerItem("tapukoko_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPULELESUMMONSHINY = registerItem("tapulele_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPUBULUSUMMONSHINY = registerItem("tapubulu_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TAPUFINISUMMONSHINY = registerItem("tapufini_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TYPENULLSUMMONSHINY = registerItem("typenull_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SILVALLYSUMMONSHINY = registerItem("silvally_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KUBFUSUMMONSHINY = registerItem("kubfu_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
//    public static final Item URSHIFUWATERSUMMONSHINY = registerItem("urshifu_water_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
//    public static final Item URSHIFUDARKSUMMONSHINY = registerItem("urshifu_dark_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIELEKISUMMONSHINY = registerItem("regieleki_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item REGIDRAGOSUMMONSHINY = registerItem("regidrago_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GLASTRIERSUMMONSHINY = registerItem("glastrier_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SPECTRIERSUMMONSHINY = registerItem("spectrier_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ENAMORUSSUMMONSHINY = registerItem("enamorus_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item WOCHIENSUMMONSHINY = registerItem("wochien_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CHIENPAOSUMMONSHINY = registerItem("chienpao_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TINGLUSUMMONSHINY = registerItem("tinglu_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CHIYUSUMMONSHINY = registerItem("chiyu_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item OKIDOGISUMMONSHINY = registerItem("okidogi_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MUNKIDORISUMMONSHINY = registerItem("munkidori_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item FEZANDIPITISUMMONSHINY = registerItem("fezandipiti_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item OGERPONSUMMONSHINY = registerItem("ogerpon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    //items for summoning shiny legendary tier pokemon
    public static final Item MEWTWOSUMMONSHINY = registerItem("mewtwo_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LUGIASUMMONSHINY = registerItem("lugia_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item HOOHSUMMONSHINY = registerItem("hooh_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KYOGRESUMMONSHINY = registerItem("kyogre_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GROUDONSUMMONSHINY = registerItem("groudon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item RAYQUAZASUMMONSHINY = registerItem("rayquaza_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item DIALGASUMMONSHINY = registerItem("dialga_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item PALKIASUMMONSHINY = registerItem("palkia_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GIRATINASUMMONSHINY = registerItem("giratina_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item RESHIRAMSUMMONSHINY = registerItem("reshiram_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZEKROMSUMMONSHINY = registerItem("zekrom_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KYUREMSUMMONSHINY = registerItem("kyurem_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item XERNEASSUMMONSHINY = registerItem("xerneas_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item YVELTALSUMMONSHINY = registerItem("yveltal_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZYGARDESUMMONSHINY = registerItem("zygarde_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item COSMOGSUMMONSHINY = registerItem("cosmog_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item COSMOEMSUMMONSHINY = registerItem("cosmoem_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SOLGALEOSUMMONSHINY = registerItem("solgaleo_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item LUNALASUMMONSHINY = registerItem("lunala_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item NECROZMASUMMONSHINY = registerItem("necrozma_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZACIANSUMMONSHINY = registerItem("zacian_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZAMAZENTASUMMONSHINY = registerItem("zamazenta_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ETERNATUSSUMMONSHINY = registerItem("eternatus_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CALYREXSUMMONSHINY = registerItem("calyrex_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KORAIDONSUMMONSHINY = registerItem("koraidon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MIRAIDONSUMMONSHINY = registerItem("miraidon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item TERAPAGOSSUMMONSHINY = registerItem("terapagos_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    //items for summoning shiny mythical tier pokemon
    public static final Item MEWSUMMONSHINY = registerItem("mew_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CELEBISUMMONSHINY = registerItem("celebi_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item JIRACHISUMMONSHINY = registerItem("jirachi_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item DEOXYSSUMMONSHINY = registerItem("deoxys_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item PHIONESUMMONSHINY = registerItem("phione_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MANAPHYSUMMONSHINY = registerItem("manaphy_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item DARKRAISUMMONSHINY = registerItem("darkrai_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SHAYMINSUMMONSHINY = registerItem("shaymin_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ARCEUSSUMMONSHINY = registerItem("arceus_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item VICTINISUMMONSHINY = registerItem("victini_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KELDEOSUMMONSHINY = registerItem("keldeo_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MELOETTASUMMONSHINY = registerItem("meloetta_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GENESECTSUMMONSHINY = registerItem("genesect_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item DIANCIESUMMONSHINY = registerItem("diancie_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item HOOPASUMMONSHINY = registerItem("hoopa_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item VOLCANIONSUMMONSHINY = registerItem("volcanion_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MAGEARNASUMMONSHINY = registerItem("magearna_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MARSHADOWSUMMONSHINY = registerItem("marshadow_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZERAORASUMMONSHINY = registerItem("zeraora_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MELTANSUMMONSHINY = registerItem("meltan_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item MELMETALSUMMONSHINY = registerItem("melmetal_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ZARUDESUMMONSHINY = registerItem("zarude_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item PECHARUNTSUMMONSHINY = registerItem("pecharunt_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    //items for summoning shiny ultra beasts
    public static final Item NIHILEGOSUMMONSHINY = registerItem("nihilego_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item BUZZWOLESUMMONSHINY = registerItem("buzzwole_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item PHEROMOSASUMMONSHINY = registerItem("pheromosa_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item XURKITREESUMMONSHINY = registerItem("xurkitree_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item CELESTEELASUMMONSHINY = registerItem("celesteela_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item KARTANASUMMONSHINY = registerItem("kartana_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GUZZLORDSUMMONSHINY = registerItem("guzzlord_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item POIPOLESUMMONSHINY = registerItem("poipole_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item NAGANADELSUMMONSHINY = registerItem("naganadel_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item STAKATAKASUMMONSHINY = registerItem("stakataka_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item BLACEPHALONSUMMONSHINY = registerItem("blacephalon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    //items for summoning shiny paradox pokemon
    public static final Item GREATTUSKSUMMONSHINY = registerItem("greattusk_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SCREAMTAILSUMMONSHINY = registerItem("screamtail_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item BRUTEBONNETSUMMONSHINY = registerItem("brutebonnet_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item FLUTTERMANESUMMONSHINY = registerItem("fluttermane_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SLITHERWINGSUMMONSHINY = registerItem("slitherwing_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item SANDYSHOCKSSUMMONSHINY = registerItem("sandyshocks_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item ROARINGMOONSUMMONSHINY = registerItem("roaringmoon_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item WALKINGWAKESUMMONSHINY = registerItem("walkingwake_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item GOUGINGFIRESUMMONSHINY = registerItem("gougingfire_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item RAGINGBOLTSUMMONSHINY = registerItem("ragingbolt_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONTREADSSUMMONSHINY = registerItem("irontreads_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONBUNDLESUMMONSHINY = registerItem("ironbundle_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONHANDSSUMMONSHINY = registerItem("ironhands_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONJUGULISSUMMONSHINY = registerItem("ironjugulis_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONMOTHSUMMONSHINY = registerItem("ironmoth_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONTHORNSSUMMONSHINY = registerItem("ironthorns_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONVALIANTSUMMONSHINY = registerItem("ironvaliant_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONLEAVESSUMMONSHINY = registerItem("ironleaves_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONBOULDERSUMMONSHINY = registerItem("ironboulder_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));
    public static final Item IRONCROWNSUMMONSHINY = registerItem("ironcrown_shiny", new LegendSummonItem(new FabricItemSettings().maxCount(1).fireproof().maxDamage(1)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LegendsDoD.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LegendsDoD.LOGGER.info("Registering items for " + LegendsDoD.MOD_ID);
    }

}
