package donut.legendsdod.net;

import donut.legendsdod.net.block.ModBlocks;
import donut.legendsdod.net.block.entity.ModBlockEntities;
import donut.legendsdod.net.item.ModItemGroups;
import donut.legendsdod.net.item.ModItems;
import donut.legendsdod.net.screen.ModScreenHandlers;
import donut.legendsdod.net.sound.ModSounds;
import donut.legendsdod.net.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LegendsDoD implements ModInitializer {
    public static final String MOD_ID = "legends_dod";
	public static final Logger LOGGER = LoggerFactory.getLogger("legends_dod");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
		ModItems.registerModItems();
		ModSounds.registerSounds();

		ModLootTableModifiers.modifyLootTables();
		ModScreenHandlers.registerScreenHandlers();

	}
}