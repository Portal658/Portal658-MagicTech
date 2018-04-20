package portal658.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import portal658.init.ModItems;
import portal658.items.itemlist.ListBasicCoins;

public class Portal658CreativeTab extends CreativeTabs {
	public Portal658CreativeTab() {
		super("portal658");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.basicCoin, 1, ListBasicCoins.OSMIUM_COIN.getMetadata());
	}
}
