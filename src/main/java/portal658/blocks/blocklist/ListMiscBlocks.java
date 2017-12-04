package portal658.blocks.blocklist;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

public enum ListMiscBlocks implements IStringSerializable, BlockItemList
{
	ASKARINKA("askarinka", EnumRarity.UNCOMMON),
	BERTI("berti", EnumRarity.UNCOMMON),
	GOTOMAN("gotoman", EnumRarity.UNCOMMON),
	LAVRUSHA("lavrusha", EnumRarity.UNCOMMON),
	MORDA("morda", EnumRarity.UNCOMMON),
	MOROVIZKA("morovizka", EnumRarity.UNCOMMON),
	PARROT("parrot", EnumRarity.UNCOMMON),
	RUVON("ruvon", EnumRarity.UNCOMMON),
	STEELMAN("steelman", EnumRarity.UNCOMMON),
	THAUMIUM_BLOCK("thaumium_block", EnumRarity.UNCOMMON);

	private String name;
	private final EnumRarity rarity;
	
	private ListMiscBlocks(String name, EnumRarity rarity)
	{
		this.name = name;
		this.rarity = rarity;
	}
	
	@Override
	public String getName()
	{
		return this.name;
	}
	
	@Override
	public int getMetadata()
	{
		return this.ordinal();
	}
	
	@Override
	public String toString()
	{
		return getName();
	}
	
	@Override
	public EnumRarity getRarity()
	{
		return rarity;
	}
	
	@Override
	public String resourceLocation()
	{
		return "portal658:misc/" + this.getName();
	}
}