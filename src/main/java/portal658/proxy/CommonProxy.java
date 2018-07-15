package portal658.proxy;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import portal658.configuration.Config;
import portal658.handlers.OreDictionaryHandler;
import portal658.init.ModBlocks;
import portal658.init.ModItems;
import portal658.worldgen.OreGen;

public class CommonProxy {

	public static Configuration config;

	private void setupConfiguration(FMLPreInitializationEvent event) {
		File directory = event.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "portal658.cfg"));
		Config.readConfig();
	}

	public void preInit(FMLPreInitializationEvent event) {
		setupConfiguration(event);
		ModItems.register();
		ModBlocks.register();
		if (Config.enableWorldgen) {
			GameRegistry.registerWorldGenerator(new OreGen(), 0);
		}
	}

	public void init(FMLInitializationEvent event) {
		OreDictionaryHandler.registerOreDictionary();
	}

	public void postInit(FMLPostInitializationEvent event) {
		if (config.hasChanged()) {
			config.save();
		}
	}
}
