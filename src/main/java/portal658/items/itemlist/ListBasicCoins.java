package portal658.items.itemlist;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public enum ListBasicCoins
{
	COPPER_COIN("copper_coin", EnumRarity.COMMON),
	IRON_COIN("iron_coin", EnumRarity.COMMON),
	SILVER_COIN("silver_coin", EnumRarity.COMMON),
	GOLD_COIN("gold_coin", EnumRarity.UNCOMMON),
	PLATINUM_COIN("platinum_coin", EnumRarity.UNCOMMON),
	OSMIUM_COIN("osmium_coin", EnumRarity.RARE),
	NAQUADAH_COIN("naquadah_coin", EnumRarity.RARE),
	NEUTRONIUM_COIN("neutronium_coin", EnumRarity.EPIC);
	
	public final String name;
    public final EnumRarity rarity;
    
    ListBasicCoins(String name, EnumRarity rarity)
    {
        this.name = name;
        this.rarity = rarity;
    }
}