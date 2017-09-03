package portal658.blocks.blocklist;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

public enum ListMiscBlocks implements IStringSerializable
{
	ASKARINKA("askarinka", 0, EnumRarity.UNCOMMON),
	BERTI("berti", 1, EnumRarity.UNCOMMON),
	GOTOMAN("gotoman", 2, EnumRarity.UNCOMMON),
	LAVRUSHA("lavrusha", 3, EnumRarity.UNCOMMON),
	MORDA("morda", 4, EnumRarity.UNCOMMON),
	MOROVIZKA("morovizka", 5, EnumRarity.UNCOMMON),
	PARROT("parrot", 6, EnumRarity.UNCOMMON),
	RUVON("ruvon", 7, EnumRarity.UNCOMMON),
	THAUMIUM_BLOCK("thaumium_block", 8, EnumRarity.UNCOMMON);

	private int metadata;
	private String name;
	private final EnumRarity rarity;
	
	private ListMiscBlocks(String name, int metadata, EnumRarity rarity)
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