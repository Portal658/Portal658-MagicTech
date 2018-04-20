package portal658.items;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import portal658.Portal658;
import portal658.Reference;

public class Morovizka extends Item {
	public Morovizka() {
		this.setUnlocalizedName(Reference.Portal658Items.MOROVIZKA.getUnlocalizedName());
		this.setRegistryName(Reference.Portal658Items.MOROVIZKA.getRegistryName());
		this.setCreativeTab(Portal658.CREATIVE_TAB);
	}

	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.EPIC;
	}
}
