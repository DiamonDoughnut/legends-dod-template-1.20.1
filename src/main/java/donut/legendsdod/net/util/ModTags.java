package donut.legendsdod.net.util;

import donut.legendsdod.net.LegendsDoD;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> ESSENCE_ITEMS = createTag("essence_items");
        public static final TagKey<Item> LEGEND_CRYSTALS = createTag("legend_crystals");
        public static final TagKey<Item> LEGEND_SUMMON = createTag("legend_summon");
        public static final TagKey<Item> LEGEND_CATALYSTS = createTag("legend_catalysts");
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(LegendsDoD.MOD_ID, name));
        }
    }
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(LegendsDoD.MOD_ID, name));
        }
    }
}
