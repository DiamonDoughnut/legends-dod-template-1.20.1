package donut.legendsdod.net.item;

import donut.legendsdod.net.LegendsDoD;
import donut.legendsdod.net.block.ModBlocks;
import donut.legendsdod.net.block.custom.InfusionAltarBlock;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static donut.legendsdod.net.item.ModItems.*;

public class ModItemGroups {
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
        //crystals, catalysts, and related blocks
        entries.add(ModBlocks.LEGEND_ORE);
        entries.add(LEGENDSHARD);
        entries.add(ModBlocks.LEGEND_SHARD_BLOCK);
        entries.add(LEGENDSTAR);
        entries.add(ModBlocks.INFUSION_ALTAR_BLOCK);
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

    public static final ItemGroup SUB_LEGEND_SUMMONS = Registry.register(Registries.ITEM_GROUP, new Identifier(LegendsDoD.MOD_ID, "sub_legend_summons"), FabricItemGroup.builder().displayName(Text.of("Sub-Legend Summons")).icon(()-> new ItemStack(SUBLEGENDBASE)).entries((displayContext, entries) -> {
        entries.add(SUBLEGENDBASE);
        entries.add(ARTICUNOSUMMON);
        entries.add(ZAPDOSSUMMON);
        entries.add(MOLTRESSUMMON);
        entries.add(RAIKOUSUMMON);
        entries.add(ENTEISUMMON);
        entries.add(SUICUNESUMMON);
        entries.add(REGIROCKSUMMON);
        entries.add(REGICESUMMON);
        entries.add(REGISTEELSUMMON);
        entries.add(LATIASSUMMON);
        entries.add(LATIOSSUMMON);
        entries.add(UXIESUMMON);
        entries.add(AZELFSUMMON);
        entries.add(MESPRITSUMMON);
        entries.add(CRESSELIASUMMON);
        entries.add(HEATRANSUMMON);
        entries.add(REGIGIGASSUMMON);
        entries.add(COBALIONSUMMON);
        entries.add(TERRAKIONSUMMON);
        entries.add(VIRIZIONSUMMON);
        entries.add(TORNADUSSUMMON);
        entries.add(THUNDURUSSUMMON);
        entries.add(LANDORUSSUMMON);
        entries.add(TAPUKOKOSUMMON);
        entries.add(TAPULELESUMMON);
        entries.add(TAPUBULUSUMMON);
        entries.add(TAPUFINISUMMON);
        entries.add(TYPENULLSUMMON);
        entries.add(SYLVALLYSUMMON);
        entries.add(KUBFUSUMMON);
        entries.add(URSHIFUDARKSUMMON);
        entries.add(URSHIFUWATERSUMMON);
        entries.add(REGIELEKISUMMON);
        entries.add(REGIDRAGOSUMMON);
        entries.add(GLASTRIERSUMMON);
        entries.add(SPECTRIERSUMMON);
        entries.add(ENAMORUSSUMMON);
        entries.add(WOCHIENSUMMON);
        entries.add(CHIENPAOSUMMON);
        entries.add(TINGLUSUMMON);
        entries.add(CHIYUSUMMON);
        entries.add(OKIDOGISUMMON);
        entries.add(MUNKIDORISUMMON);
        entries.add(FEZANDIPITISUMMON);
        entries.add(OGERPONSUMMON);
    }).build());

    public static final ItemGroup LEGEND_SUMMONS = Registry.register(Registries.ITEM_GROUP, new Identifier(LegendsDoD.MOD_ID, "legend_summons"), FabricItemGroup.builder().displayName(Text.of("Legend Summons")).icon(()-> new ItemStack(LEGENDBASE)).entries((displayContext, entries) -> {
        entries.add(LEGENDBASE);
        entries.add(MEWTWOSUMMON);
        entries.add(LUGIASUMMON);
        entries.add(HOOHSUMMON);
        entries.add(KYOGRESUMMON);
        entries.add(GROUDONSUMMON);
        entries.add(RAYQUAZASUMMON);
        entries.add(DIALGASUMMON);
        entries.add(PALKIASUMMON);
        entries.add(GIRATINASUMMON);
        entries.add(RESHIRAMSUMMON);
        entries.add(ZEKROMSUMMON);
        entries.add(KYUREMSUMMON);
        entries.add(XERNEASSUMMON);
        entries.add(YVELTALSUMMON);
        entries.add(ZYGARDESUMMON);
        entries.add(COSMOGSUMMON);
        entries.add(COSMOEMSUMMON);
        entries.add(SOLGALEOSUMMON);
        entries.add(LUNALASUMMON);
        entries.add(NECROZMASUMMON);
        entries.add(ZACIANSUMMON);
        entries.add(ZAMAZENTASUMMON);
        entries.add(ETERNATUSSUMMON);
        entries.add(CALYREXSUMMON);
        entries.add(KORAIDONSUMMON);
        entries.add(MIRAIDONSUMMON);
        entries.add(TERAPAGOSSUMMON);
    }).build());

    public static final ItemGroup MYTHICAL_SUMMONS = Registry.register(Registries.ITEM_GROUP, new Identifier(LegendsDoD.MOD_ID, "mythical_summons"), FabricItemGroup.builder().displayName(Text.of("Mythical Summons")).icon(()-> new ItemStack(MYTHICBASE)).entries((displayContext, entries) -> {
        entries.add(MYTHICBASE);
        entries.add(MEWSUMMON);
        entries.add(CELEBISUMMON);
        entries.add(JIRACHISUMMON);
        entries.add(DEOXYSSUMMON);
        entries.add(PHIONESUMMON);
        entries.add(MANAPHYSUMMON);
        entries.add(DARKRAISUMMON);
        entries.add(SHAYMINSUMMON);
        entries.add(SHAYMINSUMMON);
        entries.add(ARCEUSSUMMON);
        entries.add(VICTINISUMMON);
        entries.add(KELDEOSUMMON);
        entries.add(MELOETTASUMMON);
        entries.add(GENESECTSUMMON);
        entries.add(DIANCIESUMMON);
        entries.add(HOOPASUMMON);
        entries.add(VOLCANIONSUMMON);
        entries.add(MAGEARNASUMMON);
        entries.add(MARSHADOWSUMMON);
        entries.add(ZERAORASUMMON);
        entries.add(MELTANSUMMON);
        entries.add(MELMETALSUMMON);
        entries.add(ZARUDESUMMON);
        entries.add(PECHARUNTSUMMON);
    }).build());

    public static final ItemGroup ULTRA_BEAST_SUMMONS = Registry.register(Registries.ITEM_GROUP, new Identifier(LegendsDoD.MOD_ID, "ultra_beast_summons"), FabricItemGroup.builder().displayName(Text.of("Ultra Beast Summons")).icon(()-> new ItemStack(ULTRABEASTBASE)).entries((displayContext, entries) -> {
        entries.add(ULTRABEASTBASE);
        entries.add(NIHILEGOSUMMON);
        entries.add(BUZZWOLESUMMON);
        entries.add(PHEROMOSASUMMON);
        entries.add(XURKITREESUMMON);
        entries.add(CELESTEELASUMMON);
        entries.add(KARTANASUMMON);
        entries.add(GUZZLORDSUMMON);
        entries.add(POIPOLESUMMON);
        entries.add(NAGANADELSUMMON);
        entries.add(STAKATAKASUMMON);
        entries.add(BLACEPHALONSUMMON);
    }).build());

        public static void registerItemGroups() {
        LegendsDoD.LOGGER.info("Registering Item Groups for " + LegendsDoD.MOD_ID);
    }
}
