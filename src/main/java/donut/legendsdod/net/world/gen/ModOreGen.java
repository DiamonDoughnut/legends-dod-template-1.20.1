package donut.legendsdod.net.world.gen;

import donut.legendsdod.net.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGen {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd() , GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LEGEND_ORE_PLACED_KEY);
    }
}
