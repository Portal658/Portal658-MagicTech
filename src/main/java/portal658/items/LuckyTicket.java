package portal658.items;

import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;

public class LuckyTicket extends Item
{
	public LuckyTicket()
	{
		this.setUnlocalizedName(Reference.Portal658Items.LUCKY_TICKET.getUnlocalizedName());
		this.setRegistryName(Reference.Portal658Items.LUCKY_TICKET.getRegistryName());
		this.setCreativeTab(Portal658.CREATIVE_TAB);
	}
}
