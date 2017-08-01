package portal658.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import portal658.Reference;
import portal658.init.items.crafting.ItemMagical_orb;
import portal658.init.items.crafting.ItemSuper_circuit;
import portal658.init.items.crafting.ItemSuperconductor;
import portal658.items.ItemChisel_rar;
import portal658.items.ItemLuckyTicket;
import portal658.items.ItemMorovizka;
import portal658.items.coins.ItemChurchCoin;
import portal658.items.coins.ItemCopperCoin;
import portal658.items.coins.ItemErrorCoin;
import portal658.items.coins.ItemGoldCoin;
import portal658.items.coins.ItemHorseCoin;
import portal658.items.coins.ItemIntegralCoin;
import portal658.items.coins.ItemIronCoin;
import portal658.items.coins.ItemMetpromCoin;
import portal658.items.coins.ItemNaquadahCoin;
import portal658.items.coins.ItemNeutroniumCoin;
import portal658.items.coins.ItemOsmiumCoin;
import portal658.items.coins.ItemPlatinumCoin;
import portal658.items.coins.ItemProgressionCoin;
import portal658.items.coins.ItemRadiactiveCoin;
import portal658.items.coins.ItemSilverCoin;
import portal658.items.coins.ItemSusCoin;
import portal658.items.coins.ItemZambiaCoin;

public class ModItems
{
	public static Item copperCoin;
	public static Item ironCoin;
	public static Item silverCoin;
	public static Item goldCoin;
	public static Item platinumCoin;
	public static Item osmiumCoin;
	public static Item naquadahCoin;
	public static Item neutroniumCoin;
	public static Item zambiaCoin;
	public static Item errorCoin;
	public static Item radiactiveCoin;
	public static Item horseCoin;
	public static Item churchCoin;
	public static Item susCoin;
	public static Item progressionCoin;
	public static Item integralCoin;
	public static Item metpromCoin;
	public static Item luckyTicket;
	public static Item morovizka;
	public static Item chisel_rar;
	public static Item superconductor;
	public static Item super_circuit;
	public static Item magical_orb;
	
	public static void init()
	{
		copperCoin = new ItemCopperCoin();
		ironCoin = new ItemIronCoin();
		silverCoin = new ItemSilverCoin();
		goldCoin = new ItemGoldCoin();
		platinumCoin = new ItemPlatinumCoin();
		osmiumCoin = new ItemOsmiumCoin();
		naquadahCoin = new ItemNaquadahCoin();
		neutroniumCoin = new ItemNeutroniumCoin();
		zambiaCoin = new ItemZambiaCoin();
		errorCoin = new ItemErrorCoin();
		radiactiveCoin = new ItemRadiactiveCoin();
		horseCoin = new ItemHorseCoin();
		churchCoin = new ItemChurchCoin();
		susCoin = new ItemSusCoin();
		progressionCoin = new ItemProgressionCoin();
		integralCoin = new ItemIntegralCoin();
		metpromCoin = new ItemMetpromCoin();
		luckyTicket = new ItemLuckyTicket();
		morovizka = new ItemMorovizka();
		chisel_rar = new ItemChisel_rar();
		superconductor = new ItemSuperconductor();
		super_circuit = new ItemSuper_circuit();
		magical_orb = new ItemMagical_orb();
	}
	
	public static void register()
	{
		
		ForgeRegistries.ITEMS.register(copperCoin);
		ForgeRegistries.ITEMS.register(copperCoin);
		ForgeRegistries.ITEMS.register(ironCoin);
		ForgeRegistries.ITEMS.register(silverCoin);
		ForgeRegistries.ITEMS.register(goldCoin);
		ForgeRegistries.ITEMS.register(platinumCoin);
		ForgeRegistries.ITEMS.register(osmiumCoin);
		ForgeRegistries.ITEMS.register(naquadahCoin);
		ForgeRegistries.ITEMS.register(neutroniumCoin);
		ForgeRegistries.ITEMS.register(zambiaCoin);
		ForgeRegistries.ITEMS.register(errorCoin);
		ForgeRegistries.ITEMS.register(radiactiveCoin);
		ForgeRegistries.ITEMS.register(horseCoin);
		ForgeRegistries.ITEMS.register(churchCoin);
		ForgeRegistries.ITEMS.register(susCoin);
		ForgeRegistries.ITEMS.register(progressionCoin);
		ForgeRegistries.ITEMS.register(integralCoin);
		ForgeRegistries.ITEMS.register(metpromCoin);
		ForgeRegistries.ITEMS.register(luckyTicket);
		ForgeRegistries.ITEMS.register(morovizka);
		ForgeRegistries.ITEMS.register(chisel_rar);
		ForgeRegistries.ITEMS.register(superconductor);
		ForgeRegistries.ITEMS.register(super_circuit);
		ForgeRegistries.ITEMS.register(magical_orb);
	}
	
	public static void registerRenders()
	{
		registerRender(copperCoin);
		registerRender(ironCoin);
		registerRender(silverCoin);
		registerRender(goldCoin);
		registerRender(platinumCoin);
		registerRender(osmiumCoin);
		registerRender(naquadahCoin);
		registerRender(neutroniumCoin);
		registerRender(zambiaCoin);
		registerRender(errorCoin);
		registerRender(radiactiveCoin);
		registerRender(horseCoin);
		registerRender(churchCoin);
		registerRender(susCoin);
		registerRender(progressionCoin);
		registerRender(integralCoin);
		registerRender(metpromCoin);
		registerRender(luckyTicket);
		registerRender(morovizka);
		registerRender(chisel_rar);
		registerRender(superconductor);
		registerRender(super_circuit);
		registerRender(magical_orb);
	}
	
	private static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
			new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
