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
        entries.add(UNSTABLEPARADOX);
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
        entries.add(ARTICUNOGALARSUMMON);
        entries.add(ZAPDOSSUMMON);
        entries.add(ZAPDOSGALARSUMMON);
        entries.add(MOLTRESSUMMON);
        entries.add(MOLTRESGALARSUMMON);
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
        entries.add(SILVALLYSUMMON);
        entries.add(KUBFUSUMMON);
 //       entries.add(URSHIFUDARKSUMMON);
 //       entries.add(URSHIFUWATERSUMMON);
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
         entries.add(ARTICUNOSUMMONSHINY);
         entries.add(ARTICUNOGALARSUMMONSHINY);
        entries.add(ZAPDOSSUMMONSHINY);
        entries.add(ZAPDOSGALARSUMMONSHINY);
        entries.add(MOLTRESSUMMONSHINY);
        entries.add(MOLTRESGALARSUMMONSHINY);
        entries.add(RAIKOUSUMMONSHINY);
        entries.add(ENTEISUMMONSHINY);
        entries.add(SUICUNESUMMONSHINY);
        entries.add(REGIROCKSUMMONSHINY);
        entries.add(REGICESUMMONSHINY);
        entries.add(REGISTEELSUMMONSHINY);
        entries.add(LATIASSUMMONSHINY);
        entries.add(LATIOSSUMMONSHINY);
        entries.add(UXIESUMMONSHINY);
        entries.add(AZELFSUMMONSHINY);
        entries.add(MESPRITSUMMONSHINY);
        entries.add(CRESSELIASUMMONSHINY);
        entries.add(HEATRANSUMMONSHINY);
        entries.add(REGIGIGASSUMMONSHINY);
        entries.add(COBALIONSUMMONSHINY);
        entries.add(TERRAKIONSUMMONSHINY);
        entries.add(VIRIZIONSUMMONSHINY);
        entries.add(TORNADUSSUMMONSHINY);
        entries.add(THUNDURUSSUMMONSHINY);
        entries.add(LANDORUSSUMMONSHINY);
        entries.add(TAPUKOKOSUMMONSHINY);
        entries.add(TAPULELESUMMONSHINY);
        entries.add(TAPUBULUSUMMONSHINY);
        entries.add(TAPUFINISUMMONSHINY);
        entries.add(TYPENULLSUMMONSHINY);
        entries.add(SILVALLYSUMMONSHINY);
        entries.add(KUBFUSUMMONSHINY);
 //       entries.add(URSHIFUDARKSUMMONSHINY);
 //       entries.add(URSHIFUWATERSUMMONSHINY);
        entries.add(REGIELEKISUMMONSHINY);
        entries.add(REGIDRAGOSUMMONSHINY);
        entries.add(GLASTRIERSUMMONSHINY);
        entries.add(SPECTRIERSUMMONSHINY);
        entries.add(ENAMORUSSUMMONSHINY);
        entries.add(WOCHIENSUMMONSHINY);
        entries.add(CHIENPAOSUMMONSHINY);
        entries.add(TINGLUSUMMONSHINY);
        entries.add(CHIYUSUMMONSHINY);
        entries.add(OKIDOGISUMMONSHINY);
        entries.add(MUNKIDORISUMMONSHINY);
        entries.add(FEZANDIPITISUMMONSHINY);
        entries.add(OGERPONSUMMONSHINY);
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
        entries.add(MEWTWOSUMMONSHINY);
        entries.add(LUGIASUMMONSHINY);
        entries.add(HOOHSUMMONSHINY);
        entries.add(KYOGRESUMMONSHINY);
        entries.add(GROUDONSUMMONSHINY);
        entries.add(RAYQUAZASUMMONSHINY);
        entries.add(DIALGASUMMONSHINY);
        entries.add(PALKIASUMMONSHINY);
        entries.add(GIRATINASUMMONSHINY);
        entries.add(RESHIRAMSUMMONSHINY);
        entries.add(ZEKROMSUMMONSHINY);
        entries.add(KYUREMSUMMONSHINY);
        entries.add(XERNEASSUMMONSHINY);
        entries.add(YVELTALSUMMONSHINY);
        entries.add(ZYGARDESUMMONSHINY);
        entries.add(COSMOGSUMMONSHINY);
        entries.add(COSMOEMSUMMONSHINY);
        entries.add(SOLGALEOSUMMONSHINY);
        entries.add(LUNALASUMMONSHINY);
        entries.add(NECROZMASUMMONSHINY);
        entries.add(ZACIANSUMMONSHINY);
        entries.add(ZAMAZENTASUMMONSHINY);
        entries.add(ETERNATUSSUMMONSHINY);
        entries.add(CALYREXSUMMONSHINY);
        entries.add(KORAIDONSUMMONSHINY);
        entries.add(MIRAIDONSUMMONSHINY);
        entries.add(TERAPAGOSSUMMONSHINY);
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
        entries.add(MEWSUMMONSHINY);
        entries.add(CELEBISUMMONSHINY);
        entries.add(JIRACHISUMMONSHINY);
        entries.add(DEOXYSSUMMONSHINY);
        entries.add(PHIONESUMMONSHINY);
        entries.add(MANAPHYSUMMONSHINY);
        entries.add(DARKRAISUMMONSHINY);
        entries.add(SHAYMINSUMMONSHINY);
        entries.add(ARCEUSSUMMONSHINY);
        entries.add(VICTINISUMMONSHINY);
        entries.add(KELDEOSUMMONSHINY);
        entries.add(MELOETTASUMMONSHINY);
        entries.add(GENESECTSUMMONSHINY);
        entries.add(DIANCIESUMMONSHINY);
        entries.add(HOOPASUMMONSHINY);
        entries.add(VOLCANIONSUMMONSHINY);
        entries.add(MAGEARNASUMMONSHINY);
        entries.add(MARSHADOWSUMMONSHINY);
        entries.add(ZERAORASUMMONSHINY);
        entries.add(MELTANSUMMONSHINY);
        entries.add(MELMETALSUMMONSHINY);
        entries.add(ZARUDESUMMONSHINY);
        entries.add(PECHARUNTSUMMONSHINY);
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
        entries.add(NIHILEGOSUMMONSHINY);
        entries.add(BUZZWOLESUMMONSHINY);
        entries.add(PHEROMOSASUMMONSHINY);
        entries.add(XURKITREESUMMONSHINY);
        entries.add(CELESTEELASUMMONSHINY);
        entries.add(KARTANASUMMONSHINY);
        entries.add(GUZZLORDSUMMONSHINY);
        entries.add(POIPOLESUMMONSHINY);
        entries.add(NAGANADELSUMMONSHINY);
        entries.add(STAKATAKASUMMONSHINY);
        entries.add(BLACEPHALONSUMMONSHINY);
    }).build());

    public static final ItemGroup PAST_PARADOX_SUMMONS = Registry.register(Registries.ITEM_GROUP, new Identifier(LegendsDoD.MOD_ID, "past_paradox_summons"), FabricItemGroup.builder().displayName(Text.of("Past Paradox Summons")).icon(() -> new ItemStack(PASTPARADOXBASE)).entries((displayContext, entries) -> {
        entries.add(PASTPARADOXBASE);
        entries.add(GREATTUSKSUMMON);
        entries.add(SCREAMTAILSUMMON);
        entries.add(BRUTEBONNETSUMMON);
        entries.add(FLUTTERMANESUMMON);
        entries.add(SLITHERWINGSUMMON);
        entries.add(SANDYSHOCKSSUMMON);
        entries.add(ROARINGMOONSUMMON);
        entries.add(WALKINGWAKESUMMON);
        entries.add(GOUGINGFIRESUMMON);
        entries.add(RAGINGBOLTSUMMON);
        entries.add(GREATTUSKSUMMONSHINY);
        entries.add(SCREAMTAILSUMMONSHINY);
        entries.add(BRUTEBONNETSUMMONSHINY);
        entries.add(FLUTTERMANESUMMONSHINY);
        entries.add(SLITHERWINGSUMMONSHINY);
        entries.add(SANDYSHOCKSSUMMONSHINY);
        entries.add(ROARINGMOONSUMMONSHINY);
        entries.add(WALKINGWAKESUMMONSHINY);
        entries.add(GOUGINGFIRESUMMONSHINY);
        entries.add(RAGINGBOLTSUMMONSHINY);
    }).build());

    public static final ItemGroup FUTURE_PARADOX_SUMMONS = Registry.register(Registries.ITEM_GROUP, new Identifier(LegendsDoD.MOD_ID, "future_paradox_summons"), FabricItemGroup.builder().displayName(Text.of("Future Paradox Summons")).icon(() -> new ItemStack(FUTUREPARADOXBASE)).entries((displayContext, entries) -> {
        entries.add(FUTUREPARADOXBASE);
        entries.add(IRONTREADSSUMMON);
        entries.add(IRONBUNDLESUMMON);
        entries.add(IRONHANDSSUMMON);
        entries.add(IRONJUGULISSUMMON);
        entries.add(IRONMOTHSUMMON);
        entries.add(IRONTHORNSSUMMON);
        entries.add(IRONVALIANTSUMMON);
        entries.add(IRONLEAVESSUMMON);
        entries.add(IRONBOULDERSUMMON);
        entries.add(IRONCROWNSUMMON);
        entries.add(IRONTREADSSUMMONSHINY);
        entries.add(IRONBUNDLESUMMONSHINY);
        entries.add(IRONHANDSSUMMONSHINY);
        entries.add(IRONJUGULISSUMMONSHINY);
        entries.add(IRONMOTHSUMMONSHINY);
        entries.add(IRONTHORNSSUMMONSHINY);
        entries.add(IRONVALIANTSUMMONSHINY);
        entries.add(IRONLEAVESSUMMONSHINY);
        entries.add(IRONBOULDERSUMMONSHINY);
        entries.add(IRONCROWNSUMMONSHINY);
    }).build());

        public static void registerItemGroups() {
        LegendsDoD.LOGGER.info("Registering Item Groups for " + LegendsDoD.MOD_ID);
    }
}
