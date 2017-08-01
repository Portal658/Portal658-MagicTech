package portal658.items.coins;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemHorseCoin extends Item
{
	public ItemHorseCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.HORSE_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.HORSE_COIN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
