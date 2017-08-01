package portal658.items.coins;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemMetpromCoin extends Item
{
	public ItemMetpromCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.METPROM_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.METPROM_COIN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
