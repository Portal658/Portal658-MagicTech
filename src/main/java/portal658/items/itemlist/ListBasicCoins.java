package portal658.items.itemlist;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public enum ListBasicCoins implements IStringSerializable
{
	COPPER_COIN("copper_coin", 0, EnumRarity.COMMON),
	IRON_COIN("iron_coin", 1, EnumRarity.COMMON),
	SILVER_COIN("silver_coin", 2, EnumRarity.COMMON),
	GOLD_COIN("gold_coin", 3, EnumRarity.UNCOMMON),
	PLATINUM_COIN("platinum_coin", 4, EnumRarity.UNCOMMON),
	OSMIUM_COIN("osmium_coin", 5, EnumRarity.RARE),
	NAQUADAH_COIN("naquadah_coin", 6, EnumRarity.RARE),
	NEUTRONIUM_COIN("neutronium_coin", 7, EnumRarity.EPIC);
	
	public final String name;
    public final EnumRarity rarity;
    public int metadata;
    
    ListBasicCoins(String name, int metadata, EnumRarity rarity)
    {
        this.name = name;
        this.metadata = metadata;
        this.rarity = rarity;
    }
    
    public int getMetadata()
    {
    	return metadata;
    }
    
    public EnumRarity getRarity()
    {
    	return rarity;
    }
    
	@Override
	public String getName()
	{
		return name;
	}
}