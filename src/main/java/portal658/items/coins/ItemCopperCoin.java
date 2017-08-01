package portal658.items.coins;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemCopperCoin extends Item
{
	public ItemCopperCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.COPPER_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.COPPER_COIN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
