package donut.legendsdod.net.item.custom;

import com.cobblemon.mod.common.api.pokemon.PokemonProperties;
import com.cobblemon.mod.common.api.pokemon.PokemonSpecies;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.item.PokemonItem;
import com.cobblemon.mod.common.pokemon.Pokemon;
import com.cobblemon.mod.common.pokemon.RenderablePokemon;
import com.cobblemon.mod.common.pokemon.Species;
import net.fabricmc.fabric.impl.client.indigo.renderer.helper.TextureHelper;
import net.minecraft.block.FluidBlock;
import net.minecraft.data.client.TextureKey;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.resource.featuretoggle.FeatureManager;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.Set;

public class LegendSummonItem extends Item {
    public World world;
    public ItemStack stack = this.getDefaultStack();
    public Boolean glint = false;


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            String shiny = "shiny=no";
            boolean galarian = false;
            boolean shinyCheck = false;
            ItemStack stack = user.getStackInHand(hand);
            //ServerPlayerEntity player = new ServerPlayerEntity(Objects.requireNonNull(user.getServer()), Objects.requireNonNull(user.getServer().getWorld(user.getWorld().getRegistryKey())), user.getGameProfile());
            String type = stack.getItem().getTranslationKey();
            String[] typeSplit = type.split("dod.", 2);
            String[] keySplit = typeSplit[1].split("_");
            int level = 50;
            int l = keySplit.length;
            String name = keySplit[0];
            if(this.getTranslationKey().contains("shiny")) {shinyCheck = true;}
            if(this.getTranslationKey().contains("galar")) {galarian = true;}
            BlockHitResult blockHitResult = raycast(world, user, RaycastContext.FluidHandling.ANY);
            BlockPos pos = blockHitResult.getBlockPos();
            if (blockHitResult.getType() != HitResult.Type.BLOCK) {
                return TypedActionResult.pass(stack);
            } else {
                BlockPos spawnLocation = blockHitResult.getBlockPos();
                if (world.getBlockState(spawnLocation).getBlock() instanceof FluidBlock) {
                    return TypedActionResult.pass(stack);
                } else if (world.canPlayerModifyAt(user, spawnLocation) && user.canPlaceOn(spawnLocation, blockHitResult.getSide(), stack)) {
                    if(shinyCheck){shiny = "shiny=yes";}
                    String args = name + " lvl=" + level + " " + shiny;
                    if (galarian) {args = args + "galarian=true";}
                    PokemonProperties pokemonfinal = PokemonProperties.Companion.parse(args);
                    PokemonEntity entity = pokemonfinal.createEntity(world);

                    float yaw = -user.getYaw();
                    Direction direction = user.getHorizontalFacing().getOpposite();
                    Vec3d vec = new Vec3d(pos.getX(), pos.getY(), pos.getZ());
                    entity.refreshPositionAndAngles(vec.x, vec.y + 2, vec.z, yaw, -user.getPitch());
                    world.spawnEntity(entity);
                    stack.damage(1, user, player -> player.sendToolBreakStatus(user.getActiveHand()));
                    if (!user.isCreative()) {
                        entity.forceBattle((ServerPlayerEntity) user);
                    }
                    return TypedActionResult.success(stack);
                }
            }

        } else {
            return TypedActionResult.pass(user.getStackInHand(hand));
        }
        return TypedActionResult.pass(user.getStackInHand(hand));
    }


    private Species species(ItemStack stack, String name) {
        return PokemonSpecies.INSTANCE.getByName(name);
    }

    public boolean isShiny(String shinycheck) {
        return shinycheck.equals("shiny");
    }


    public Pokemon asPokemon(ItemStack stack, String name, String shinycheck) {
        Species species = this.species(stack, name);
        if (species == null) {
            return null;
        }
        Set<String> aspects = Set.of("lvl=50");
        boolean shiny = isShiny(shinycheck);
        if (shiny) {
            aspects = Set.of("shiny=yes", "lvl=50");
        }
        Pokemon pokemon = new Pokemon();
        pokemon.setSpecies(species);
        pokemon.setAspects(aspects);

        return pokemon;
    }


    public RenderablePokemon asRenderablePokemon(ItemStack stack, String name, String shiny) {
        return this.asPokemon(stack, name, shiny).asRenderablePokemon();
    }

    public boolean itemShinyCheck(ItemStack stack) {
        String key = stack.getTranslationKey();
        return key.contains("shiny");
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return this.getTranslationKey().contains("shiny");
    }

    public LegendSummonItem(Settings settings) {
        super(settings);
    }

}