package portal658;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import portal658.init.ModItems;
import portal658.items.itemlist.ListBasicCoins;

public class Portal658Tab extends CreativeTabs
{
	public Portal658Tab()
	{
		super("tabPortal658");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.basicCoin, 1, ListBasicCoins.OSMIUM_COIN.getMetadata());
	}
}
