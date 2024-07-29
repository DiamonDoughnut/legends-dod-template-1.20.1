package donut.legendsdod.net;

import com.cobblemon.mod.common.CobblemonItems;
import com.cobblemon.mod.common.client.render.item.CobblemonBuiltinItemRendererRegistry;
import donut.legendsdod.net.item.ModItems;
import donut.legendsdod.net.screen.InfusionAltarScreen;
import donut.legendsdod.net.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import com.cobblemon.mod.common.client.render.item.PokemonItemRenderer;

public class LegendsDoDClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        HandledScreens.register(ModScreenHandlers.INFUSION_ALTAR_SCREEN_HANDLER, InfusionAltarScreen::new);

    }
}
