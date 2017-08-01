package portal658.items.coins;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemZambiaCoin extends Item 
{
	public ItemZambiaCoin()
	{
		setUnlocalizedName(Reference.Portal658Items.ZAMBIA_COIN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.ZAMBIA_COIN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
