package portal658.init;

import java.util.Arrays;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import portal658.blocks.CoinOre;
import portal658.blocks.MiscBlock;
import portal658.blocks.blocklist.BlockItemList;
import portal658.blocks.blocklist.ListCoinOres;
import portal658.blocks.blocklist.ListMiscBlocks;
import portal658.blocks.itemblocks.ItemBlockCoinOre;
import portal658.blocks.itemblocks.ItemBlockMiscBlock;
import portal658.util.RegisterModel;

public class ModBlocks {
	public static Block coinOre = new CoinOre();
	public static Block miscBlock = new MiscBlock();

	private static BlockItemList[] listCoinOre = Arrays.copyOf(ListCoinOres.values(), ListCoinOres.values().length);
	private static BlockItemList[] listMiscBlock = Arrays.copyOf(ListMiscBlocks.values(),
			ListMiscBlocks.values().length);

	public static void register() {
		setRegister(coinOre, new ItemBlockCoinOre(coinOre));
		setRegister(miscBlock, new ItemBlockMiscBlock(miscBlock));
	}

	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		setRender_withMetaData();
	}

	private static void setRegister(Block block) {
		ForgeRegistries.BLOCKS.register(block);
		ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	private static void setRegister(Block block, ItemBlock itemblock) {
		ForgeRegistries.BLOCKS.register(block);
		ForgeRegistries.ITEMS.register(itemblock.setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	private static void setRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

	@SideOnly(Side.CLIENT)
	public static void registerItemVariants() {
		RegisterModel.registerItemVariants(coinOre, listCoinOre);
		RegisterModel.registerItemVariants(miscBlock, listMiscBlock);
	}

	@SideOnly(Side.CLIENT)
	public static void setRender_withMetaData() {
		RegisterModel.registerRender(coinOre, listCoinOre);
		RegisterModel.registerRender(miscBlock, listMiscBlock);
	}
}
