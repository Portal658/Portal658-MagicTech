package portal658.items.coins;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemSusCoin extends Item
{
	public ItemSusCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.SUS_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.SUS_COIN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
