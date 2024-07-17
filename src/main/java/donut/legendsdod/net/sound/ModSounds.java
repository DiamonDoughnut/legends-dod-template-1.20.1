package donut.legendsdod.net.sound;

import donut.legendsdod.net.LegendsDoD;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent SUB_LEGEND_SUMMONED = registerSoundEvents("sub_legend_summoned");
    public static final SoundEvent LEGEND_SUMMONED = registerSoundEvents("legend_summoned");
    public static final SoundEvent MYTHIC_SUMMONED = registerSoundEvents("mythic_summoned");

    public static final SoundEvent INFUSION_STARTED = registerSoundEvents("infusion_started");
    public static final SoundEvent INFUSION_COMPLETE = registerSoundEvents("infusion_complete");



    private static SoundEvent registerSoundEvents(String name) {
        Identifier id = new Identifier(LegendsDoD.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        LegendsDoD.LOGGER.info("Registering Sounds for " + LegendsDoD.MOD_ID);
    }
}
