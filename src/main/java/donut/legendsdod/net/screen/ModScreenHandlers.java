package donut.legendsdod.net.screen;

import donut.legendsdod.net.LegendsDoD;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<InfusionAltarScreenHandler> INFUSION_ALTAR_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(LegendsDoD.MOD_ID, "infusion_altar"),
                    new ExtendedScreenHandlerType<>(InfusionAltarScreenHandler::new));

    public static void registerScreenHandlers() {
        LegendsDoD.LOGGER.info("Registering Screen Handlers for " + LegendsDoD.MOD_ID);
    }
}
