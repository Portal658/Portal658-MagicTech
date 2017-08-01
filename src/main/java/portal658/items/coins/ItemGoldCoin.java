package portal658.items.coins;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemGoldCoin extends Item
{
	public ItemGoldCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.GOLD_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.GOLD_COIN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
