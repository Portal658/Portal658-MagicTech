package portal658.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import portal658.blocks.BlockAskarinka;
import portal658.blocks.BlockBerti;
import portal658.blocks.BlockGotoman;
import portal658.blocks.BlockLavrusha;
import portal658.blocks.BlockMorda;
import portal658.blocks.BlockMorovizka;
import portal658.blocks.BlockParrot;
import portal658.blocks.BlockRuvon;
import portal658.blocks.BlockUnificated_thaumium_block;
import portal658.blocks.ores.BlockCopper_coin_ore;
import portal658.blocks.ores.BlockEpic_coin_ore;
import portal658.blocks.ores.BlockIron_coin_ore;
import portal658.blocks.ores.BlockRandom_ore;
import portal658.blocks.ores.BlockSilver_coin_ore;

public class ModBlocks
{
	
	public static Block lavrusha;
	public static Block parrot;
	public static Block unificated_thaumium_block;
	public static Block morovizka;
	public static Block askarinka;
	public static Block gotoman;
	public static Block morda;
	public static Block berti;
	public static Block ruvon;
	public static Block copper_coin_ore;
	public static Block iron_coin_ore;
	public static Block silver_coin_ore;
	public static Block epic_coin_ore;
	public static Block random_ore;
	
	public static void init()
	{
		lavrusha = new BlockLavrusha();
		parrot = new BlockParrot();
		unificated_thaumium_block = new BlockUnificated_thaumium_block();
		morovizka = new BlockMorovizka();
		askarinka = new BlockAskarinka();
		gotoman = new BlockGotoman();
		morda = new BlockMorda();
		berti = new BlockBerti();
		ruvon = new BlockRuvon();
		copper_coin_ore = new BlockCopper_coin_ore();
		iron_coin_ore = new BlockIron_coin_ore();
		silver_coin_ore = new BlockSilver_coin_ore();
		epic_coin_ore = new BlockEpic_coin_ore();
		random_ore = new BlockRandom_ore();
	}
	
	public static void register()
	{
		registerBlock(lavrusha);
		registerBlock(parrot);
		registerBlock(unificated_thaumium_block);
		registerBlock(morovizka);
		registerBlock(askarinka);
		registerBlock(gotoman);
		registerBlock(morda);
		registerBlock(berti);
		registerBlock(ruvon);
		registerBlock(copper_coin_ore);
		registerBlock(iron_coin_ore);
		registerBlock(silver_coin_ore);
		registerBlock(epic_coin_ore);
		registerBlock(random_ore);
	}
	
	public static void registerRenders()
	{
		registerRender(lavrusha);
		registerRender(parrot);
		registerRender(unificated_thaumium_block);
		registerRender(morovizka);
		registerRender(askarinka);
		registerRender(gotoman);
		registerRender(morda);
		registerRender(berti);
		registerRender(ruvon);
		registerRender(copper_coin_ore);
		registerRender(iron_coin_ore);
		registerRender(silver_coin_ore);
		registerRender(epic_coin_ore);
		registerRender(random_ore);
	}
	
	private static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
		ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
	
	private static void registerRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),
			0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
