package portal658.items.coins;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemSilverCoin extends Item 
{
	public ItemSilverCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.SILVER_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.SILVER_COIN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
