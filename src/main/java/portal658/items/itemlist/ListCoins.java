package portal658.items.itemlist;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public enum ListCoins
{
	COPPER_COIN("copper_coin", EnumRarity.COMMON),
	IRON_COIN("iron_coin", EnumRarity.COMMON);
	
	public final String name;
    public final EnumRarity rarity;
    
    ListCoins(String name, EnumRarity rarity)
    {
        this.name = name;
        this.rarity = rarity;
    }
}