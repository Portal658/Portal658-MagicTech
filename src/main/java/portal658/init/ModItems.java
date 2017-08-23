package portal658.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import portal658.init.items.crafting.ItemMagical_orb;
import portal658.init.items.crafting.ItemSuper_circuit;
import portal658.init.items.crafting.ItemSuperconductor;
import portal658.items.ItemChisel_rar;
import portal658.items.ItemLuckyTicket;
import portal658.items.ItemMorovizka;
import portal658.items.OtherCoin;
import portal658.items.itemlist.ListBasicCoins;
import portal658.items.itemlist.ListOtherCoins;
import portal658.items.BasicCoin;

public class ModItems
{
	public static Item basicCoin = new BasicCoin();
	public static Item otherCoin = new OtherCoin();
	public static Item luckyTicket = new ItemLuckyTicket();
	public static Item morovizka = new ItemMorovizka();
	public static Item chisel_rar = new ItemChisel_rar();
	public static Item superconductor = new ItemSuperconductor();
	public static Item super_circuit = new ItemSuper_circuit();
	public static Item magical_orb = new ItemMagical_orb();
	
	public static void register()
	{
		setRegister(basicCoin);
		setRegister(otherCoin);
		setRegister(luckyTicket);
		setRegister(morovizka);
		setRegister(chisel_rar);
		setRegister(superconductor);
		setRegister(super_circuit);
		setRegister(magical_orb);
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRenders()
	{
		setRender_witchMetaData();
		setRender(luckyTicket);
		setRender(morovizka);
		setRender(chisel_rar);
		setRender(superconductor);
		setRender(super_circuit);
		setRender(magical_orb);        
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
		ResourceLocation[] rl_basiccoins = new ResourceLocation[ListBasicCoins.values().length];
		for(ListBasicCoins list : ListBasicCoins.values())
        {
			ResourceLocation location = new ResourceLocation("portal658:coins/basic/" + list.getName());
			rl_basiccoins[list.getMetadata()] = location;
        }
		ModelBakery.registerItemVariants(basicCoin, rl_basiccoins);
		
		ResourceLocation[] rl_othercoins = new ResourceLocation[ListOtherCoins.values().length];
		for(ListOtherCoins list : ListOtherCoins.values())
        {
			ResourceLocation location = new ResourceLocation("portal658:coins/other/" + list.getName());
			rl_othercoins[list.getMetadata()] = location;
        }
		ModelBakery.registerItemVariants(otherCoin, rl_othercoins);
	}
	
	@SideOnly(Side.CLIENT)
	public static void setRender_witchMetaData()
	{
		for(ListBasicCoins list : ListBasicCoins.values())
        {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
				basicCoin, list.getMetadata(), new ModelResourceLocation("portal658:coins/basic/" + list.getName(), "inventory"));
        }
		for(ListOtherCoins list : ListOtherCoins.values())
        {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
				otherCoin, list.getMetadata(), new ModelResourceLocation("portal658:coins/other/" + list.getName(), "inventory"));
        }
	}
}
