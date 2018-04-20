package portal658.util;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class RegisterModel {
	public static void registerItemVariants(Block block, ItemList[] list) {
		ResourceLocation[] resourceLocation = new ResourceLocation[list.length];
		for (ItemList lst : list) {
			ResourceLocation location = new ResourceLocation(lst.resourceLocation());
			resourceLocation[lst.getMetadata()] = location;
		}
		ModelBakery.registerItemVariants(Item.getItemFromBlock(block), resourceLocation);
	}

	public static void registerItemVariants(Item item, ItemList[] list) {
		ResourceLocation[] resourceLocation = new ResourceLocation[list.length];
		for (ItemList lst : list) {
			ResourceLocation location = new ResourceLocation(lst.resourceLocation());
			resourceLocation[lst.getMetadata()] = location;
		}
		ModelBakery.registerItemVariants(item, resourceLocation);
	}

	public static void registerRender(Block block, ItemList[] list) {
		for (ItemList lst : list) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),
					lst.getMetadata(), new ModelResourceLocation(lst.resourceLocation(), "inventory"));
		}
	}

	public static void registerRender(Item item, ItemList[] list) {
		for (ItemList lst : list) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, lst.getMetadata(),
					new ModelResourceLocation(lst.resourceLocation(), "inventory"));
		}
	}
}
