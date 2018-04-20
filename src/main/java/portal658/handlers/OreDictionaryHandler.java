package portal658.handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import portal658.blocks.blocklist.ListCoinOres;
import portal658.init.ModBlocks;

public class OreDictionaryHandler {
	public static void registerOreDictionary() {
		OreDictionary.registerOre("oreCopperCoin",
				new ItemStack(ModBlocks.coinOre, 1, ListCoinOres.COPPER.getMetadata()));
		OreDictionary.registerOre("oreIronCoin", new ItemStack(ModBlocks.coinOre, 1, ListCoinOres.IRON.getMetadata()));
		OreDictionary.registerOre("oreSilverCoin",
				new ItemStack(ModBlocks.coinOre, 1, ListCoinOres.SILVER.getMetadata()));
		OreDictionary.registerOre("oreEpicCoin", new ItemStack(ModBlocks.coinOre, 1, ListCoinOres.EPIC.getMetadata()));
	}
}
