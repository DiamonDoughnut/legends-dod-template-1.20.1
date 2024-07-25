package donut.legendsdod.net.mixin;

import com.cobblemon.mod.common.client.render.item.CobblemonBuiltinItemRenderer;
import com.cobblemon.mod.common.client.render.item.CobblemonBuiltinItemRendererRegistry;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import com.cobblemon.mod.common.client.render.item.PokemonItemRenderer;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;

@Mixin(BuiltinModelItemRenderer.class)
public class SummonRenderMixin {
	@Inject(method = "render", at = @At("HEAD"), cancellable = true)
	private void Legends$useDynamicItemRenderer(ItemStack stack, ModelTransformationMode mode, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, CallbackInfo ci) {
		CobblemonBuiltinItemRenderer renderer = CobblemonBuiltinItemRendererRegistry.INSTANCE.rendererOf(stack.getItem());
		if (renderer != null){
			renderer.render(stack, mode, matrices, vertexConsumers, light, overlay);
			ci.cancel();
		}
	}
}