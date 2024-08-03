package donut.legendsdod.net.recipe;

import donut.legendsdod.net.LegendsDoD;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {

    public static void registerRecipes(){
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(LegendsDoD.MOD_ID, LegendInfusionRecipe.Serializer.ID),
                LegendInfusionRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(LegendsDoD.MOD_ID, LegendInfusionRecipe.Type.ID),
                LegendInfusionRecipe.Type.INSTANCE);
    }

}
