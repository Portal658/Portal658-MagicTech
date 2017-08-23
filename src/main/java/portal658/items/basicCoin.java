package portal658.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import portal658.Portal658;
import portal658.Reference;
import portal658.init.ModItems;
import portal658.items.itemlist.ListBasicCoins;

public class BasicCoin extends Item
{
	public static final ListBasicCoins[] basicCoins = ListBasicCoins.values();
	
	public BasicCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.BASIC_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.BASIC_COIN.getRegistryName());
		this.setHasSubtypes(true);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return "item." + basicCoins[stack.getItemDamage()].getName();
	}
	
	@Override
	public int getMetadata(int damage)
	{
		return damage;
	}
	
	@Override
	public EnumRarity getRarity(ItemStack stack)
	{
		return basicCoins[stack.getItemDamage()].getRarity();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		for (int i = 0; i < basicCoins.length; ++i)
		{
			items.add(new ItemStack(this, 1, i));
		}
	}
}
