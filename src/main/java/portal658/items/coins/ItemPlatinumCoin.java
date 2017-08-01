package portal658.items.coins;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemPlatinumCoin extends Item
{
	public ItemPlatinumCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.PLATINUM_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.PLATINUM_COIN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
