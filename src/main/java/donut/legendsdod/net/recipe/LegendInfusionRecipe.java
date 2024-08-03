package donut.legendsdod.net.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.serialization.DataResult;
import com.oracle.truffle.regex.tregex.util.json.Json;
import donut.legendsdod.net.LegendsDoD;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;


import java.awt.*;
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
        return output;
    }


    @Override
    public Identifier getId() {
        return Identifier.of(LegendsDoD.MOD_ID, "legendary_infusion");
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }



    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }
    public static class Type implements RecipeType<LegendInfusionRecipe> {
        public static final Type INSTANCE = new Type();
        public static final String ID = "legendary_infusion";
    }

    public static class Serializer implements  RecipeSerializer<LegendInfusionRecipe>{

        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "legendary_infusion";

        @Override
        public LegendInfusionRecipe read(Identifier id, JsonObject json) {
            DefaultedList<Ingredient> ingredients = getIngredients(json.getAsJsonArray("ingredients"));
            final ItemStack output = outputFromJson(JsonHelper.getObject(json, "result"));
            return new LegendInfusionRecipe(ingredients, output);
        }

        private static DefaultedList<Ingredient> getIngredients(JsonArray json) {
            final DefaultedList<Ingredient> defaultedList = DefaultedList.of();
            for (int i = 0; i < json.size(); i++) {
                Ingredient ingredient = Ingredient.fromJson(json.get(i), false);
                if (!ingredient.isEmpty()) {
                    defaultedList.add(ingredient);
                }
            }
            return defaultedList;
        }

        @Override
        public LegendInfusionRecipe read(Identifier id, PacketByteBuf buf) {
            final int numIngredients = buf.readVarInt();
            final DefaultedList<Ingredient> ingredients = DefaultedList.ofSize(numIngredients, Ingredient.EMPTY);
            for(int j = 0; j < ingredients.size(); j++){
                ingredients.set(j, Ingredient.fromPacket(buf));
            }
            final ItemStack result = buf.readItemStack();
            return new LegendInfusionRecipe(ingredients, result);
        }

        @Override
        public void write(PacketByteBuf buf, LegendInfusionRecipe recipe) {
            buf.writeVarInt(recipe.getIngredients().size());
            for (final Ingredient ingredient : recipe.getIngredients()){
                ingredient.write(buf);
            }
            assert MinecraftClient.getInstance().world != null;
            buf.writeItemStack(recipe.getOutput(null));
        }
        public static ItemStack outputFromJson(JsonObject json) {
            Item item = getItem(json);
            if (json.has("data")) {
                throw new JsonParseException("Disallowed data tag found");
            } else {
                int i = JsonHelper.getInt(json, "count", 1);
                if (i < 1) {
                    throw new JsonSyntaxException("Invalid output count: " + i);
                } else {
                    return new ItemStack(item, i);
                }
            }
        }
        public static Item getItem(JsonObject json) {
            String string = JsonHelper.getString(json, "item");
            Item item = (Item) Registries.ITEM.getOrEmpty(Identifier.tryParse(string)).orElseThrow(() -> new JsonSyntaxException("Unknown item '" + string + "'"));
            if (item == Items.AIR) {
                throw new JsonSyntaxException("Empty ingredient not allowed here");
            } else {
                return item;
            }
        }
    }


}
