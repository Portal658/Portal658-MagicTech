package portal658.init;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import portal658.Reference;

public class ModCrafting
{
	public static void register()
	{
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperCoin, 4), ModItems.ironCoin);
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironCoin, 4), ModItems.silverCoin);
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.silverCoin, 4), ModItems.goldCoin);
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.goldCoin, 4), ModItems.platinumCoin);
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.platinumCoin, 4), ModItems.osmiumCoin);
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.osmiumCoin, 4), ModItems.naquadahCoin);
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.naquadahCoin, 4), ModItems.neutroniumCoin);
		
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironCoin),
		//	ModItems.copperCoin, ModItems.copperCoin, ModItems.copperCoin, ModItems.copperCoin);
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.silverCoin),
		//		ModItems.ironCoin, ModItems.ironCoin, ModItems.ironCoin, ModItems.ironCoin);
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.goldCoin),
		//		ModItems.silverCoin, ModItems.silverCoin, ModItems.silverCoin, ModItems.silverCoin);
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.platinumCoin),
		//		ModItems.goldCoin, ModItems.goldCoin, ModItems.goldCoin, ModItems.goldCoin);
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.osmiumCoin),
		//		ModItems.platinumCoin, ModItems.platinumCoin, ModItems.platinumCoin, ModItems.platinumCoin);
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.naquadahCoin),
		//		ModItems.osmiumCoin, ModItems.osmiumCoin, ModItems.osmiumCoin, ModItems.osmiumCoin);
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.neutroniumCoin),
		//		ModItems.naquadahCoin, ModItems.naquadahCoin, ModItems.naquadahCoin, ModItems.naquadahCoin);
		
		//GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.ruvon), "111", "232", "111",
		//		'1', ModItems.platinumCoin, '2', ModItems.churchCoin, '3', Items.IRON_SWORD);
		//GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.berti), "111", "232", "111",
		//		'1', ModItems.platinumCoin, '2', ModItems.errorCoin, '3', Blocks.DIRT);
		//GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.morda), "111", "232", "111",
		//		'1', ModItems.platinumCoin, '2', ModItems.progressionCoin, '3', Items.PRISMARINE_SHARD);
		//GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.lavrusha), "111", "232", "111",
		//	'1', ModItems.platinumCoin, '2', ModItems.metpromCoin, '3', Items.FEATHER);
		//GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.parrot), "111", "232", "111",
		//		'1', ModItems.platinumCoin, '2', ModItems.zambiaCoin, '3', Items.FEATHER);
		//GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.unificated_thaumium_block), "111", "232", "111",
		//		'1', ModItems.platinumCoin, '2', ModItems.susCoin, '3', ModItems.luckyTicket);
		//GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.morovizka), "111", "232", "111",
		//		'1', ModItems.platinumCoin, '2', ModItems.zambiaCoin, '3', Blocks.RED_MUSHROOM);
		//GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.askarinka), "111", "232", "111",
		//		'1', ModItems.platinumCoin, '2', ModItems.integralCoin, '3', Blocks.BROWN_MUSHROOM);
		//GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.gotoman), "111", "232", "111",
		//		'1', ModItems.platinumCoin, '2', ModItems.metpromCoin, '3', Blocks.RED_FLOWER);
		//GameRegistry.addShapedRecipe(new ItemStack(ModItems.morovizka), "111", "121", "111",
		//		'1', Items.NETHER_STAR, '2',Blocks.RED_MUSHROOM);
		//GameRegistry.addShapedRecipe(new ItemStack(ModItems.chisel_rar), "121", "232", "121",
		//		'1', ModItems.zambiaCoin, '2', ModItems.luckyTicket, '3', Items.NETHER_STAR);
		//registerRecipes("copper_coin");
	}
	private static void registerRecipes(String name)
	{
		CraftingHelper.register(new ResourceLocation(Reference.MOD_ID, name), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	}
}
