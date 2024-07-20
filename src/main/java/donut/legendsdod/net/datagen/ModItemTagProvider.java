package donut.legendsdod.net.datagen;

import donut.legendsdod.net.item.ModItems;
import donut.legendsdod.net.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

import static donut.legendsdod.net.item.ModItems.*;
import static donut.legendsdod.net.item.ModItems.OGERPONSUMMON;

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
        getOrCreateTagBuilder(ModTags.Items.LEGEND_CATALYSTS)
                .add(ModItems.SUBLEGENDBASE)
                        .add(ModItems.LEGENDBASE)
                                .add(ModItems.MYTHICBASE);
        getOrCreateTagBuilder(ModTags.Items.SUB_LEGEND_SUMMONS)
        .add(SUBLEGENDBASE)
        .add(ARTICUNOSUMMON)
        .add(ZAPDOSSUMMON)
        .add(MOLTRESSUMMON)
        .add(RAIKOUSUMMON)
        .add(ENTEISUMMON)
        .add(SUICUNESUMMON)
        .add(REGIROCKSUMMON)
        .add(REGICESUMMON)
        .add(REGISTEELSUMMON)
        .add(LATIASSUMMON)
        .add(LATIOSSUMMON)
        .add(UXIESUMMON)
        .add(AZELFSUMMON)
        .add(MESPRITSUMMON)
        .add(CRESSELIASUMMON)
        .add(HEATRANSUMMON)
        .add(REGIGIGASSUMMON)
        .add(COBALIONSUMMON)
        .add(TERRAKIONSUMMON)
        .add(VIRIZIONSUMMON)
        .add(TORNADUSSUMMON)
        .add(THUNDURUSSUMMON)
        .add(LANDORUSSUMMON)
        .add(TAPUKOKOSUMMON)
        .add(TAPULELESUMMON)
        .add(TAPUBULUSUMMON)
        .add(TAPUFINISUMMON)
        .add(TYPENULLSUMMON)
        .add(SYLVALLYSUMMON)
        .add(KUBFUSUMMON)
//        .add(URSHIFUDARKSUMMON)
//        .add(URSHIFUWATERSUMMON)
        .add(REGIELEKISUMMON)
        .add(REGIDRAGOSUMMON)
        .add(GLASTRIERSUMMON)
        .add(SPECTRIERSUMMON)
        .add(ENAMORUSSUMMON)
        .add(WOCHIENSUMMON)
        .add(CHIENPAOSUMMON)
        .add(TINGLUSUMMON)
        .add(CHIYUSUMMON)
        .add(OKIDOGISUMMON)
        .add(MUNKIDORISUMMON)
        .add(FEZANDIPITISUMMON)
        .add(OGERPONSUMMON);
        getOrCreateTagBuilder(ModTags.Items.LEGEND_SUMMONS)
        .add(LEGENDBASE)
        .add(MEWTWOSUMMON)
        .add(LUGIASUMMON)
        .add(HOOHSUMMON)
        .add(KYOGRESUMMON)
        .add(GROUDONSUMMON)
        .add(RAYQUAZASUMMON)
        .add(DIALGASUMMON)
        .add(PALKIASUMMON)
        .add(GIRATINASUMMON)
        .add(RESHIRAMSUMMON)
        .add(ZEKROMSUMMON)
        .add(KYUREMSUMMON)
        .add(XERNEASSUMMON)
        .add(YVELTALSUMMON)
        .add(ZYGARDESUMMON)
        .add(COSMOGSUMMON)
        .add(COSMOEMSUMMON)
        .add(SOLGALEOSUMMON)
        .add(LUNALASUMMON)
        .add(NECROZMASUMMON)
        .add(ZACIANSUMMON)
        .add(ZAMAZENTASUMMON)
        .add(ETERNATUSSUMMON)
        .add(CALYREXSUMMON)
        .add(KORAIDONSUMMON)
        .add(MIRAIDONSUMMON)
        .add(TERAPAGOSSUMMON);
        getOrCreateTagBuilder(ModTags.Items.MYTHIC_SUMMONS)
        .add(MYTHICBASE)
        .add(MEWSUMMON)
        .add(CELEBISUMMON)
        .add(JIRACHISUMMON)
        .add(DEOXYSSUMMON)
        .add(PHIONESUMMON)
        .add(MANAPHYSUMMON)
        .add(DARKRAISUMMON)
        .add(SHAYMINSUMMON)
        .add(SHAYMINSUMMON)
        .add(ARCEUSSUMMON)
        .add(VICTINISUMMON)
        .add(KELDEOSUMMON)
        .add(MELOETTASUMMON)
        .add(GENESECTSUMMON)
        .add(DIANCIESUMMON)
        .add(HOOPASUMMON)
        .add(VOLCANIONSUMMON)
        .add(MAGEARNASUMMON)
        .add(MARSHADOWSUMMON)
        .add(ZERAORASUMMON)
        .add(MELTANSUMMON)
        .add(MELMETALSUMMON)
        .add(ZARUDESUMMON)
        .add(PECHARUNTSUMMON);
        getOrCreateTagBuilder(ModTags.Items.ULTRA_BEAST_SUMMONS)
        .add(ULTRABEASTBASE)
        .add(NIHILEGOSUMMON)
        .add(BUZZWOLESUMMON)
        .add(PHEROMOSASUMMON)
        .add(XURKITREESUMMON)
        .add(CELESTEELASUMMON)
        .add(KARTANASUMMON)
        .add(GUZZLORDSUMMON)
        .add(POIPOLESUMMON)
        .add(NAGANADELSUMMON)
        .add(STAKATAKASUMMON)
        .add(BLACEPHALONSUMMON);

    }
}
