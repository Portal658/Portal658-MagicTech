package portal658.items.itemlist;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public enum ListOtherCoins
{
	;
	
	public final String name;
    public final EnumRarity rarity;
    
    ListOtherCoins(String name, EnumRarity rarity)
    {
        this.name = name;
        this.rarity = rarity;
    }
}