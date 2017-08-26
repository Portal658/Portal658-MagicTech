package portal658.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import portal658.items.ItemChisel_rar;
import portal658.items.ItemLuckyTicket;
import portal658.items.ItemMorovizka;
import portal658.items.OtherCoin;
import portal658.items.itemlist.ListBasicCoins;
import portal658.items.itemlist.ListOtherCoins;
import portal658.items.BasicCoin;
import portal658.items.CraftingComponent;

public class ModItems
{
	public static Item basicCoin = new BasicCoin();
	public static Item otherCoin = new OtherCoin();
	public static Item craftingComponent = new CraftingComponent();
	public static Item luckyTicket = new ItemLuckyTicket();
	public static Item morovizka = new ItemMorovizka();
	public static Item chisel_rar = new ItemChisel_rar();
	
	public static void register()
	{
		setRegister(basicCoin);
		setRegister(otherCoin);
		setRegister(craftingComponent);
		setRegister(luckyTicket);
		setRegister(morovizka);
		setRegister(chisel_rar);
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRenders()
	{
		setRender_withMetaData();
		setRender(luckyTicket);
		setRender(morovizka);
		setRender(chisel_rar);       
	}

	private static void setRegister(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
	}
	
	@SideOnly(Side.CLIENT)
	private static void setRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
			new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerItemVariants()
	{
		BasicCoin.registerItemVariants(basicCoin);
		OtherCoin.registerItemVariants(otherCoin);
		CraftingComponent.registerItemVariants(craftingComponent);
	}
	
	@SideOnly(Side.CLIENT)
	public static void setRender_withMetaData()
	{
		BasicCoin.registerRender(basicCoin);
		OtherCoin.registerRender(otherCoin);
		CraftingComponent.registerRender(craftingComponent);
	}
}
