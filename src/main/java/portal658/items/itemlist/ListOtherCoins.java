package portal658.items.itemlist;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;
import portal658.util.ItemList;

public enum ListOtherCoins implements IStringSerializable,ItemList {
	ZAMBIA_COIN("zambia_coin", EnumRarity.UNCOMMON),
	ERROR_COIN("error_coin", EnumRarity.UNCOMMON),
	RADIACTIVE_COIN("radiactive_coin", EnumRarity.UNCOMMON),
	HORSE_COIN("horse_coin", EnumRarity.UNCOMMON),
	CHURCH_COIN("church_coin", EnumRarity.UNCOMMON),
	SUS_COIN("sus_coin", EnumRarity.UNCOMMON),
	PROGRESSION_COIN("progression_coin", EnumRarity.UNCOMMON),
	INTEGRAL_COIN("integral_coin", EnumRarity.UNCOMMON),
	METPROM_COIN("metprom_coin", EnumRarity.UNCOMMON);

	private final String name;
	private final EnumRarity rarity;

	private ListOtherCoins(String name, EnumRarity rarity) {
		this.name = name;
		this.rarity = rarity;
	}

	@Override
	public int getMetadata() {
		return this.ordinal();
	}

	@Override
	public EnumRarity getRarity() {
		return rarity;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String resourceLocation() {
		return "portal658:coins/other/" + this.getName();
	}
}