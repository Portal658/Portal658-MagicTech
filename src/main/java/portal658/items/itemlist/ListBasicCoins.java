package portal658.items.itemlist;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public enum ListBasicCoins implements IStringSerializable, ItemItemList
{
	COPPER_COIN("copper_coin", EnumRarity.COMMON),
	IRON_COIN("iron_coin", EnumRarity.COMMON),
	SILVER_COIN("silver_coin", EnumRarity.COMMON),
	GOLD_COIN("gold_coin", EnumRarity.UNCOMMON),
	PLATINUM_COIN("platinum_coin", EnumRarity.UNCOMMON),
	OSMIUM_COIN("osmium_coin", EnumRarity.RARE),
	NAQUADAH_COIN("naquadah_coin", EnumRarity.RARE),
	NEUTRONIUM_COIN("neutronium_coin", EnumRarity.EPIC);
	
	private final String name;
	private final EnumRarity rarity;
    
    private ListBasicCoins(String name, EnumRarity rarity)
    {
        this.name = name;
        this.rarity = rarity;
    }
    
    @Override
    public int getMetadata()
    {
    	return this.ordinal();
    }
    
    @Override
    public EnumRarity getRarity()
    {
    	return rarity;
    }
    
	@Override
	public String getName()
	{
		return name;
	}
	
	@Override
	public String resourceLocation()
	{
		return "portal658:coins/basic/" + this.getName();
	}
}