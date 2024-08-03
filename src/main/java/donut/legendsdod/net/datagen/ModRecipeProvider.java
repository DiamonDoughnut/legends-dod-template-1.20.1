package donut.legendsdod.net.datagen;

import donut.legendsdod.net.block.ModBlocks;
import donut.legendsdod.net.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> LEGEND_SMELTABLES =
            List.of(
                    ModBlocks.LEGEND_ORE
            );

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, LEGEND_SMELTABLES, RecipeCategory.MISC, ModItems.LEGENDSHARD, 2f, 200, "legend_shard");
        offerBlasting(exporter, LEGEND_SMELTABLES, RecipeCategory.MISC, ModItems.LEGENDSHARD, 2f, 100, "legend_shard");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.LEGENDSHARD, RecipeCategory.MISC, ModBlocks.LEGEND_SHARD_BLOCK);


    }
}
