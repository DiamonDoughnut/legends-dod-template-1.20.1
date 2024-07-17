package donut.legendsdod.net.item.custom;

import donut.legendsdod.net.sound.ModSounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;


public class LegendSummonItem extends Item {
   public LegendSummonItem(Settings settings) {
       super(settings);
   }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
       if (!context.getWorld().isClient()){
           String string = "A";
           BlockPos pos = context.getBlockPos();
           String outputstring = "";
           if (isWorking(string)) {
               sendSuccessMessage("Success", context.getPlayer());
               string = "";
               context.getWorld().playSound(null, pos, ModSounds.SUB_LEGEND_SUMMONED, SoundCategory.BLOCKS, 1f, 1f);
           }
           else {
               sendFailMessage("fail", context.getPlayer());
               string = "";
           }
       }
        return ActionResult.SUCCESS;
    }

    private void sendSuccessMessage (String outputstring, PlayerEntity player) {
       player.sendMessage(Text.literal(outputstring));
       outputstring = "";
    }
    private void sendFailMessage (String outputstring, PlayerEntity player) {
       player.sendMessage(Text.literal(outputstring));
       outputstring = "";
    }

    public boolean isWorking(String string) {
       return string.equals("A");
    }
}
