package portal658.init;

import java.util.Arrays;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import portal658.items.BasicCoin;
import portal658.items.ChiselRaR;
import portal658.items.CraftingComponent;
import portal658.items.LuckyTicket;
import portal658.items.Morovizka;
import portal658.items.OtherCoin;
import portal658.items.itemlist.ListBasicCoins;
import portal658.items.itemlist.ListCraftingComponents;
import portal658.items.itemlist.ListOtherCoins;
import portal658.util.ItemList;
import portal658.util.RegisterModel;

public class ModItems {
	public static Item basicCoin = new BasicCoin();
	public static Item otherCoin = new OtherCoin();
	public static Item craftingComponent = new CraftingComponent();
	public static Item luckyTicket = new LuckyTicket();
	public static Item morovizka = new Morovizka();
	public static Item chisel_rar = new ChiselRaR();

	private static ItemList[] listBasicCoin = Arrays.copyOf(ListBasicCoins.values(), ListBasicCoins.values().length);
	private static ItemList[] listOtherCoin = Arrays.copyOf(ListOtherCoins.values(), ListOtherCoins.values().length);
	private static ItemList[] listCraftingComponent = Arrays.copyOf(ListCraftingComponents.values(),
			ListCraftingComponents.values().length);

	public static void register() {
		setRegister(basicCoin);
		setRegister(otherCoin);
		setRegister(craftingComponent);
		setRegister(luckyTicket);
		setRegister(morovizka);
		setRegister(chisel_rar);
	}

	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		setRender_withMetaData();
		setRender(luckyTicket);
		setRender(morovizka);
		setRender(chisel_rar);
	}

	private static void setRegister(Item item) {
		ForgeRegistries.ITEMS.register(item);
	}

	@SideOnly(Side.CLIENT)
	private static void setRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

	@SideOnly(Side.CLIENT)
	public static void registerItemVariants() {
		RegisterModel.registerItemVariants(basicCoin, listBasicCoin);
		RegisterModel.registerItemVariants(otherCoin, listOtherCoin);
		RegisterModel.registerItemVariants(craftingComponent, listCraftingComponent);
	}

	@SideOnly(Side.CLIENT)
	public static void setRender_withMetaData() {
		RegisterModel.registerRender(basicCoin, listBasicCoin);
		RegisterModel.registerRender(otherCoin, listOtherCoin);
		RegisterModel.registerRender(craftingComponent, listCraftingComponent);
	}
}
