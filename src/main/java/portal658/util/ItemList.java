package portal658.util;

import net.minecraft.item.EnumRarity;

public interface ItemList {
	public String getName();

	public int getMetadata();

	public EnumRarity getRarity();

	public String resourceLocation();

	@Override
	public String toString();
}
