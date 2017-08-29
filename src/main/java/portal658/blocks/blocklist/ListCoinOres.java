package portal658.blocks.blocklist;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

public enum ListCoinOres implements IStringSerializable
{
	COPPER("copper", 0, EnumRarity.COMMON),
	IRON("iron", 1, EnumRarity.COMMON),
	SILVER("silver", 2, EnumRarity.UNCOMMON),
	EPIC("epic", 3, EnumRarity.EPIC);

	private int metadata;
	private String name;
	private final EnumRarity rarity;
	
	private ListCoinOres(String name, int metadata, EnumRarity rarity)
	{
		this.metadata = metadata;
		this.name = name;
		this.rarity = rarity;
	}
	
	@Override
	public String getName()
	{
		return this.name;
	}
	
	public int getMetadata()
	{
		return metadata;
	}
	
	@Override
	public String toString()
	{
		return getName();
	}

	public EnumRarity getRarity()
	{
		return rarity;
	}
}
