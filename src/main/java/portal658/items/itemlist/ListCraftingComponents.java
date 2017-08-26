package portal658.items.itemlist;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public enum ListCraftingComponents implements IStringSerializable
{
	MAGICAL_ORB("magical_orb", 0, EnumRarity.RARE),
	SUPER_CIRCUIT("super_circuit", 1, EnumRarity.RARE),
	SUPERCONDUCTOR("superconductor", 2, EnumRarity.RARE);
	
	private final String name;
	private final EnumRarity rarity;
	private int metadata;
    
    private ListCraftingComponents(String name, int metadata, EnumRarity rarity)
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