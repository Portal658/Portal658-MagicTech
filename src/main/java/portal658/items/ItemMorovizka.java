package portal658.items;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemMorovizka extends Item
{
	public ItemMorovizka()
	{
		setUnlocalizedName(Reference.Portal658Items.MOROVIZKA.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.MOROVIZKA.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
