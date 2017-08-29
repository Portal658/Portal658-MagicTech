package portal658.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import portal658.init.ModBlocks;
import portal658.init.ModItems;
import portal658.worldgen.OreGen;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
    	ModItems.register();
		ModBlocks.register();
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
