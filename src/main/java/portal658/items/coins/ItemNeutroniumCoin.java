package portal658.items.coins;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemNeutroniumCoin extends Item
{
	public ItemNeutroniumCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.NEUTRONIUM_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.NEUTRONIUM_COIN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
