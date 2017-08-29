package portal658.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import portal658.blocks.BlockAskarinka;
import portal658.blocks.BlockBerti;
import portal658.blocks.BlockGotoman;
import portal658.blocks.BlockLavrusha;
import portal658.blocks.BlockMorda;
import portal658.blocks.BlockMorovizka;
import portal658.blocks.BlockParrot;
import portal658.blocks.BlockRuvon;
import portal658.blocks.BlockUnificated_thaumium_block;
import portal658.blocks.CoinOre;
import portal658.blocks.itemblocks.ItemBlockCoinOre;

public class ModBlocks
{
	public static Block lavrusha = new BlockLavrusha();
	public static Block parrot = new BlockParrot();
	public static Block unificated_thaumium_block = new BlockUnificated_thaumium_block();
	public static Block morovizka = new BlockMorovizka();
	public static Block askarinka = new BlockAskarinka();
	public static Block gotoman = new BlockGotoman();
	public static Block morda = new BlockMorda();
	public static Block berti = new BlockBerti();
	public static Block ruvon = new BlockRuvon();
	public static Block coinOre = new CoinOre();
	
	public static void register()
	{
		setRegister(lavrusha);
		setRegister(parrot);
		setRegister(unificated_thaumium_block);
		setRegister(morovizka);
		setRegister(askarinka);
		setRegister(gotoman);
		setRegister(morda);
		setRegister(berti);
		setRegister(ruvon);
		setRegister(coinOre, new ItemBlockCoinOre(coinOre));
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRenders()
	{
		setRender_withMetaData();
		setRender(lavrusha);
		setRender(parrot);
		setRender(unificated_thaumium_block);
		setRender(morovizka);
		setRender(askarinka);
		setRender(gotoman);
		setRender(morda);
		setRender(berti);
		setRender(ruvon);
	}
	
	private static void setRegister(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
		ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
	
	private static void setRegister(Block block, ItemBlock itemblock)
	{
		ForgeRegistries.BLOCKS.register(block);
		ForgeRegistries.ITEMS.register(itemblock.setRegistryName(block.getRegistryName()));
	}
	
	@SideOnly(Side.CLIENT)
	private static void setRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),
			0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerItemVariants()
	{
		CoinOre.registerItemVariants(coinOre);
	}
	
	@SideOnly(Side.CLIENT)
	public static void setRender_withMetaData()
	{
		CoinOre.registerRender(coinOre);
	}
}
