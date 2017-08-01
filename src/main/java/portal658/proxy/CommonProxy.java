package portal658.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import portal658.init.ModItems;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
    	ModItems.init();
    	ModItems.register();
    }

    public void init(FMLInitializationEvent e)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
