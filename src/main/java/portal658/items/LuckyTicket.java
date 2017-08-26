package portal658.items;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class LuckyTicket extends Item
{
	public LuckyTicket()
	{
		setUnlocalizedName(Reference.Portal658Items.LUCKY_TICKET.getUnlocalizedName());
		setRegistryName(Reference.Portal658Items.LUCKY_TICKET.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
