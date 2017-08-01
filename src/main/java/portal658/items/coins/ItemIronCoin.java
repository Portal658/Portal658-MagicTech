package portal658.items.coins;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemIronCoin extends Item
{
	public ItemIronCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.IRON_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.IRON_COIN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
