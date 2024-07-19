package donut.legendsdod.net.recipe;

import donut.legendsdod.net.LegendsDoD;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;


import java.util.List;

public class LegendInfusionRecipe implements Recipe<SimpleInventory> {
    private  final ItemStack output;
    private final List<Ingredient> recipeItems;

    public LegendInfusionRecipe(List<Ingredient> ingredients, ItemStack itemStack){
        this.output = itemStack;
        this.recipeItems = ingredients;
    }

    @Override
    public boolean matches(SimpleInventory inventory, World world) {
        if(world.isClient) {
            return false;
        }
        return recipeItems.get(0).test(inventory.getStack(0)) && recipeItems.get(1).test(inventory.getStack(1)) &&
                recipeItems.get(2).test(inventory.getStack(2)) && recipeItems.get(3).test(inventory.getStack(3)) &&
                recipeItems.get(4).test(inventory.getStack(4)) && recipeItems.get(5).test(inventory.getStack(5)) &&
                recipeItems.get(6).test(inventory.getStack(6)) && recipeItems.get(7).test(inventory.getStack(7)) &&
                recipeItems.get(8).test(inventory.getStack(8));
    }

    @Override
    public ItemStack craft(SimpleInventory inventory, DynamicRegistryManager registryManager) {
        return output;
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.ofSize(this.recipeItems.size());
        list.addAll(recipeItems);
        return list;
    }

    @Override
    public ItemStack getOutput(DynamicRegistryManager registryManager) {
        return null;
    }

    @Override
    public Identifier getId() {
        return Identifier.of(LegendsDoD.MOD_ID, "legend_infusion_recipe");
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return null;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }
    public static class Type implements RecipeType<LegendInfusionRecipe> {
        public static final Type INSTANCE = new Type();
    }


}
