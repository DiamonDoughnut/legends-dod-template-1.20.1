package donut.legendsdod.net;

import donut.legendsdod.net.screen.InfusionAltarScreen;
import donut.legendsdod.net.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class LegendsDoDClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        HandledScreens.register(ModScreenHandlers.INFUSION_ALTAR_SCREEN_HANDLER, InfusionAltarScreen::new);

    }
}
