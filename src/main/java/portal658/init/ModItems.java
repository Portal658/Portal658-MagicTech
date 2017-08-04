package portal658.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import portal658.Reference;
import portal658.init.items.crafting.ItemMagical_orb;
import portal658.init.items.crafting.ItemSuper_circuit;
import portal658.init.items.crafting.ItemSuperconductor;
import portal658.items.ItemChisel_rar;
import portal658.items.ItemLuckyTicket;
import portal658.items.ItemMorovizka;
import portal658.items.coins.ItemChurchCoin;
import portal658.items.coins.ItemErrorCoin;
import portal658.items.coins.ItemHorseCoin;
import portal658.items.coins.ItemIntegralCoin;
import portal658.items.coins.ItemMetpromCoin;
import portal658.items.coins.ItemProgressionCoin;
import portal658.items.coins.ItemRadiactiveCoin;
import portal658.items.coins.ItemSusCoin;
import portal658.items.coins.ItemZambiaCoin;
import portal658.items.BasicCoin;

public class ModItems
{
	public static Item basicCoin = new BasicCoin();
	public static Item zambiaCoin = new ItemZambiaCoin();
	public static Item errorCoin = new ItemErrorCoin();
	public static Item radiactiveCoin = new ItemRadiactiveCoin();
	public static Item horseCoin = new ItemHorseCoin();
	public static Item churchCoin = new ItemChurchCoin();
	public static Item susCoin = new ItemSusCoin();
	public static Item progressionCoin = new ItemProgressionCoin();
	public static Item integralCoin = new ItemIntegralCoin();
	public static Item metpromCoin = new ItemMetpromCoin();
	public static Item luckyTicket = new ItemLuckyTicket();
	public static Item morovizka = new ItemMorovizka();
	public static Item chisel_rar = new ItemChisel_rar();
	public static Item superconductor = new ItemSuperconductor();
	public static Item super_circuit = new ItemSuper_circuit();
	public static Item magical_orb = new ItemMagical_orb();
	
	
	public static void register()
	{
		setRegister(basicCoin);
		setRegister(zambiaCoin);
		setRegister(errorCoin);
		setRegister(radiactiveCoin);
		setRegister(horseCoin);
		setRegister(churchCoin);
		setRegister(susCoin);
		setRegister(progressionCoin);
		setRegister(integralCoin);
		setRegister(metpromCoin);
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
		setRender(basicCoin);
		setRender(zambiaCoin);
		setRender(errorCoin);
		setRender(radiactiveCoin);
		setRender(horseCoin);
		setRender(churchCoin);
		setRender(susCoin);
		setRender(progressionCoin);
		setRender(integralCoin);
		setRender(metpromCoin);
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
}
