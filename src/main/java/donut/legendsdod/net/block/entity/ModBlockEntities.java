package donut.legendsdod.net.block.entity;

import donut.legendsdod.net.LegendsDoD;
import donut.legendsdod.net.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<InfusionAltarBlockEntity> INFUSION_ALTAR_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(LegendsDoD.MOD_ID, "infusion_altar_be"),
                    FabricBlockEntityTypeBuilder.create(InfusionAltarBlockEntity::new,
                            ModBlocks.INFUSION_ALTAR_BLOCK).build());

    public static void registerBlockEntities() {
        LegendsDoD.LOGGER.info("Registering Block Entities for " + LegendsDoD.MOD_ID);
    }

}
