package portal658.items.coins;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemRadiactiveCoin extends Item
{
	public ItemRadiactiveCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.RADIACTIVE_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.RADIACTIVE_COIN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
