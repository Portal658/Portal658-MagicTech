package portal658.items.coins;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemNaquadahCoin extends Item
{
	public ItemNaquadahCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.NAQUADAH_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.NAQUADAH_COIN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
