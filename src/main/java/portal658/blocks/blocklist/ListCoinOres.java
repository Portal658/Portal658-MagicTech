package portal658.blocks.blocklist;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

public enum ListCoinOres implements IStringSerializable
{
	COPPER("copper", 0, 1, EnumRarity.COMMON),
	IRON("iron", 1, 1, EnumRarity.COMMON),
	SILVER("silver", 2, 1, EnumRarity.UNCOMMON),
	EPIC("epic", 3, 2, EnumRarity.EPIC);

	private int metadata;
	private int harvestLevel;
	private String name;
	private final EnumRarity rarity;
	
	private ListCoinOres(String name, int metadata, int harvestLevel, EnumRarity rarity)
	{
		this.metadata = metadata;
		this.name = name;
		this.harvestLevel = harvestLevel;
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
	
	public int getHarvestLevel()
	{
		return harvestLevel;
	}
}
