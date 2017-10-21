package portal658.blocks.blocklist;

import net.minecraft.item.EnumRarity;

public interface BlockItemList
{
	public String getName();
	public int getMetadata();
	public EnumRarity getRarity();
	public String toString();
	public String resourceLocation();
}
