package portal658.util;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import portal658.blocks.blocklist.BlockItemList;
import portal658.items.itemlist.ItemItemList;

public class RegisterModel {
	public static void registerItemVariants(Block block, BlockItemList[] list) {
		ResourceLocation[] resourceLocation = new ResourceLocation[list.length];
		for (BlockItemList lst : list) {
			ResourceLocation location = new ResourceLocation(lst.resourceLocation());
			resourceLocation[lst.getMetadata()] = location;
		}
		ModelBakery.registerItemVariants(Item.getItemFromBlock(block), resourceLocation);
	}

	public static void registerItemVariants(Item item, ItemItemList[] list) {
		ResourceLocation[] resourceLocation = new ResourceLocation[list.length];
		for (ItemItemList lst : list) {
			ResourceLocation location = new ResourceLocation(lst.resourceLocation());
			resourceLocation[lst.getMetadata()] = location;
		}
		ModelBakery.registerItemVariants(item, resourceLocation);
	}

	public static void registerRender(Block block, BlockItemList[] list) {
		for (BlockItemList lst : list) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),
					lst.getMetadata(), new ModelResourceLocation(lst.resourceLocation(), "inventory"));
		}
	}

	public static void registerRender(Item item, ItemItemList[] list) {
		for (ItemItemList lst : list) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, lst.getMetadata(),
					new ModelResourceLocation(lst.resourceLocation(), "inventory"));
		}
	}
}
