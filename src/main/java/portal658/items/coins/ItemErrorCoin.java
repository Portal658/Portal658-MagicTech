package portal658.items.coins;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemErrorCoin extends Item
{
	public ItemErrorCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.ERROR_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.ERROR_COIN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
