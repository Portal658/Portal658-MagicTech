package portal658.items.coins;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemProgressionCoin extends Item
{
	public ItemProgressionCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.PROGRESSION_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.PROGRESSION_COIN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
