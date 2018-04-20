package portal658.blocks.blocklist;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;
import portal658.util.ItemList;

public enum ListCoinOres implements IStringSerializable,ItemList {
	COPPER("copper", 1, EnumRarity.COMMON),
	IRON("iron", 1, EnumRarity.COMMON),
	SILVER("silver", 1, EnumRarity.UNCOMMON),
	EPIC("epic", 2, EnumRarity.EPIC);

	private int harvestLevel;
	private String name;
	private final EnumRarity rarity;

	private ListCoinOres(String name, int harvestLevel, EnumRarity rarity) {
		this.name = name;
		this.harvestLevel = harvestLevel;
		this.rarity = rarity;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getMetadata() {
		return this.ordinal();
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public EnumRarity getRarity() {
		return rarity;
	}

	@Override
	public String resourceLocation() {
		return "portal658:ores/coinore_" + getName();
	}

	public int getHarvestLevel() {
		return harvestLevel;
	}
}
