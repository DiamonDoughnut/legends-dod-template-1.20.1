package donut.legendsdod.net;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;

import java.util.function.Supplier;

public interface LegendsDoDClientImplementation {
    public void registerLayer(EntityModelLayer layer, Supplier<TexturedModelData> supplier);
    public <T extends BlockEntity> void registerBlockEntityRenderer(BlockEntityType<T> type, BlockEntityRendererFactory<T> factory);
}
