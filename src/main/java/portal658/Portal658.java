package portal658;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
//import portal658.achievements.AchievementList;
import portal658.init.ModBlocks;
import portal658.init.ModCrafting;
import portal658.init.ModItems;
import portal658.proxy.CommonProxy;

import java.lang.System;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION,
	acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)

public class Portal658
{
	
	@Instance
	public static Portal658 instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs CREATIVE_TAB = new Portal658Tab();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		long delay = 0;
		while (delay < 2000000000)
			delay++;
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.init();
		ModCrafting.register();
		//AchievementList.register();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("Mod load successfully!");
	}
}
