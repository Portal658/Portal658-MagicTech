package portal658.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import portal658.Portal658;
import portal658.Reference;
import portal658.items.itemlist.ListCraftingComponents;

public class CraftingComponent extends Item
{
	public static final ListCraftingComponents[] craftingComponents = ListCraftingComponents.values();
	
	public CraftingComponent()
	{
		setUnlocalizedName(Reference.Portal658Items.CRAFTING_COMPONENT.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.CRAFTING_COMPONENT.getRegistryName());
		this.setHasSubtypes(true);
		this.setCreativeTab(Portal658.CREATIVE_TAB);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return "item." + craftingComponents[stack.getItemDamage()].getName();
	}
	
	@Override
	public int getMetadata(int damage)
	{
		return damage;
	}
	
	@Override
	public EnumRarity getRarity(ItemStack stack)
	{
		return craftingComponents[stack.getItemDamage()].getRarity();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (tab == Portal658.CREATIVE_TAB)
		{
			for (int i = 0; i < craftingComponents.length; ++i)
			{
				items.add(new ItemStack(this, 1, i));
			}
		}
	}
	
	public static void registerRender(Item item)
	{
		for(ListCraftingComponents list : ListCraftingComponents.values())
        {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
				item, list.getMetadata(), new ModelResourceLocation("portal658:crafting/" + list.getName(), "inventory"));
        }
	}
	
	public static void registerItemVariants(Item item)
	{
		ResourceLocation[] rl_crafting = new ResourceLocation[ListCraftingComponents.values().length];
		for(ListCraftingComponents list : ListCraftingComponents.values())
        {
			ResourceLocation location = new ResourceLocation("portal658:crafting/" + list.getName());
			rl_crafting[list.getMetadata()] = location;
        }
		ModelBakery.registerItemVariants(item, rl_crafting);
	}
}
