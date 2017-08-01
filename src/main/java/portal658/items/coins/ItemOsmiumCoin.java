package portal658.items.coins;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemOsmiumCoin extends Item
{
	public ItemOsmiumCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.OSMIUM_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.OSMIUM_COIN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}