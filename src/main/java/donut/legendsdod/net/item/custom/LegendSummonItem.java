package donut.legendsdod.net.item.custom;

import net.minecraft.block.FluidBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class LegendSummonItem extends Item {

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient){

            ItemStack stack = user.getStackInHand(hand);
            BlockHitResult blockHitResult = raycast(world, user, RaycastContext.FluidHandling.ANY);
            if(blockHitResult.getType() != HitResult.Type.BLOCK){
                return TypedActionResult.pass(stack);
            } else {
                BlockPos spawnLocation = blockHitResult.getBlockPos();
                if(world.getBlockState(spawnLocation).getBlock() instanceof FluidBlock) {
                    return TypedActionResult.pass(stack);
                } else if (world.canPlayerModifyAt(user, spawnLocation) && user.canPlaceOn(spawnLocation, blockHitResult.getSide(), stack)) {
                    String type = stack.getItem().getTranslationKey();
                    String name;
                    if (type.contains("ho-oh")){
                        name = "Hooh";
                    } else if(type.contains("tapu_koko")){
                        name = "tapukoko";
                    } else if(type.contains("tapu_lele")){
                        name = "tapulele";
                    } else if(type.contains("tapu_bulu")){
                        name = "tapubulu";
                    } else if(type.contains("tapu_fini")){
                        name = "tapufini";
                    } else if (type.contains("type_null")){
                        name = "typenull";
                    } else if (type.contains("wo-chien")) {
                        name = "wochien";
                    } else if (type.contains("chien-pao")) {
                        name = "chienpao";
                    } else if (type.contains("ting-lu")) {
                        name = "tinglu";
                    } else if (type.contains("chi-yu")) {
                        name = "chiyu";
                    } else {
                        String[] typeSplit = type.split("dod.", 2);
                        String[] keySplit = typeSplit[1].split("_");
                        name = " " + keySplit[0];
                        name = StringUtils.capitalize(name);
                    }
                    String x = spawnLocation.toString();
                    int[] xyz = blockPosParser(x);
                    CommandManager commandManager = Objects.requireNonNull(Objects.requireNonNull(user.getServer()).getCommandManager());
                    ServerCommandSource commandSource = user.getServer().getCommandSource();
                    commandManager.executeWithPrefix(commandSource, "say spawnpokemonat " + xyz[0] + " " + xyz[1] + " " + xyz[2] +  name + ", level=[50]");
                    stack.damage(1, user, player -> player.sendToolBreakStatus(user.getActiveHand()));
                    return TypedActionResult.consume(stack);


                }
            }

        } else {
            return TypedActionResult.pass(user.getStackInHand(hand));
        }
        return TypedActionResult.pass(user.getStackInHand(hand));
    }

    public static int[] blockPosParser(String string) {
        return Pattern.compile("\\d+").matcher(string).results().map(MatchResult::group).mapToInt(Integer::parseInt).toArray();
    }



    public LegendSummonItem(Settings settings) {
        super(settings);
    }
}