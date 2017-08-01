package portal658.init.items.crafting;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class ItemSuperconductor extends Item
{
	public ItemSuperconductor()
	{
		setUnlocalizedName(Reference.Portal658Items.SUPERCONDUCTOR.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.SUPERCONDUCTOR.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
