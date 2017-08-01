package portal658.items.coins;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemIntegralCoin extends Item
{
	public ItemIntegralCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.INTEGRAL_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.INTEGRAL_COIN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
