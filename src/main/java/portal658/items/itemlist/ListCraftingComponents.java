package portal658.items.itemlist;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public enum ListCraftingComponents implements IStringSerializable, ItemItemList
{
	MAGICAL_ORB("magical_orb", EnumRarity.RARE),
	SUPER_CIRCUIT("super_circuit", EnumRarity.RARE),
	SUPERCONDUCTOR("superconductor", EnumRarity.RARE);
	
	private final String name;
	private final EnumRarity rarity;
    
    private ListCraftingComponents(String name, EnumRarity rarity)
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
		return "portal658:crafting/" + this.getName();
	}
}