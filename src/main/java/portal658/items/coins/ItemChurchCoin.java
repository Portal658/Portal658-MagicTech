package portal658.items.coins;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemChurchCoin extends Item
{
	public ItemChurchCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.CHURCH_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.CHURCH_COIN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
