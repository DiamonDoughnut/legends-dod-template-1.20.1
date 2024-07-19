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

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LEGEND_PICKAXE, 1)
                .pattern("SSS")
                .pattern(" N ")
                .pattern(" N ")
                .input('S', ModItems.LEGENDSHARD)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModItems.LEGENDSHARD), conditionsFromItem(ModItems.LEGENDSHARD))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LEGEND_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LEGEND_AXE, 1)
                .pattern("SS")
                .pattern("SN")
                .pattern(" N")
                .input('S', ModItems.LEGENDSHARD)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModItems.LEGENDSHARD), conditionsFromItem(ModItems.LEGENDSHARD))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LEGEND_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LEGEND_HOE, 1)
                .pattern("SS")
                .pattern(" N")
                .pattern(" N")
                .input('S', ModItems.LEGENDSHARD)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModItems.LEGENDSHARD), conditionsFromItem(ModItems.LEGENDSHARD))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LEGEND_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LEGEND_SHOVEL, 1)
                .pattern("S")
                .pattern("N")
                .pattern("N")
                .input('S', ModItems.LEGENDSHARD)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModItems.LEGENDSHARD), conditionsFromItem(ModItems.LEGENDSHARD))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LEGEND_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LEGEND_SWORD, 1)
                .pattern("S")
                .pattern("S")
                .pattern("N")
                .input('S', ModItems.LEGENDSHARD)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModItems.LEGENDSHARD), conditionsFromItem(ModItems.LEGENDSHARD))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LEGEND_SWORD)));

            ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LEGEND_HELMET, 1)
                .pattern("SNS")
                .pattern("S S")
                .input('S', ModItems.LEGENDSHARD)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModItems.LEGENDSHARD), conditionsFromItem(ModItems.LEGENDSHARD))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LEGEND_HELMET)));

            ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LEGEND_CHESTPLATE, 1)
                .pattern("S S")
                .pattern("SLS")
                .pattern("SNS")
                .input('S', ModItems.LEGENDSHARD)
                .input('L', ModItems.LEGENDSTAR)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModItems.LEGENDSHARD), conditionsFromItem(ModItems.LEGENDSHARD))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LEGEND_CHESTPLATE)));

            ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LEGEND_LEGGINGS, 1)
                .pattern("SNS")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.LEGENDSHARD)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModItems.LEGENDSHARD), conditionsFromItem(ModItems.LEGENDSHARD))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LEGEND_LEGGINGS)));

            ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LEGEND_BOOTS, 1)
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.LEGENDSHARD)
                .criterion(hasItem(ModItems.LEGENDSHARD), conditionsFromItem(ModItems.LEGENDSHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LEGEND_BOOTS)));

    }
}
