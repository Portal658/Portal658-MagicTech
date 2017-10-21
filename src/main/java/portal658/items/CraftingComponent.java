package portal658.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
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
		this.setUnlocalizedName(Reference.Portal658Items.CRAFTING_COMPONENT.getUnlocalizedName());
		this.setRegistryName(Reference.Portal658Items.CRAFTING_COMPONENT.getRegistryName());
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
}
