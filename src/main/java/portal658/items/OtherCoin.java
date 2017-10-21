package portal658.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import portal658.Portal658;
import portal658.Reference;
import portal658.items.itemlist.ListOtherCoins;

public class OtherCoin extends Item
{	
	public OtherCoin()
	{
		this.setUnlocalizedName(Reference.Portal658Items.OTHER_COIN.getUnlocalizedName());
		this.setRegistryName(Reference.Portal658Items.OTHER_COIN.getRegistryName());
		this.setHasSubtypes(true);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return "item." + ListOtherCoins.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public int getMetadata(int damage)
	{
		return damage;
	}
	
	@Override
	public EnumRarity getRarity(ItemStack stack)
	{
		return ListOtherCoins.values()[stack.getItemDamage()].getRarity();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (tab == Portal658.CREATIVE_TAB)
		{
			for (int i = 0; i < ListOtherCoins.values().length; ++i)
			{
				items.add(new ItemStack(this, 1, i));
			}
		}
	}
}
