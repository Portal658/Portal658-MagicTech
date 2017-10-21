package portal658.items.itemlist;

import net.minecraft.item.EnumRarity;

public interface ItemItemList
{
	public String getName();
	public int getMetadata();
	public EnumRarity getRarity();
	public String toString();
	public String resourceLocation();
}
