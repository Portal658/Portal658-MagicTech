package portal658.items.itemlist;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public enum ListOtherCoins implements IStringSerializable
{
	ZAMBIA_COIN("zambia_coin", 0, EnumRarity.UNCOMMON),
	ERROR_COIN("error_coin", 1, EnumRarity.UNCOMMON),
	RADIACTIVE_COIN("radiactive_coin", 2, EnumRarity.UNCOMMON),
	HORSE_COIN("horse_coin", 3, EnumRarity.UNCOMMON),
	CHURCH_COIN("church_coin", 4, EnumRarity.UNCOMMON),
	SUS_COIN("sus_coin", 5, EnumRarity.UNCOMMON),
	PROGRESSION_COIN("progression_coin", 6, EnumRarity.UNCOMMON),
	INTEGRAL_COIN("integral_coin", 7, EnumRarity.UNCOMMON),
	METPROM_COIN("metprom_coin", 8, EnumRarity.UNCOMMON);
	
	public final String name;
    public final EnumRarity rarity;
    public int metadata;
    
    ListOtherCoins(String name, int metadata, EnumRarity rarity)
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