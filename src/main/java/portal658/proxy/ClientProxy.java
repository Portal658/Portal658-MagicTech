package portal658.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import portal658.init.ModBlocks;
import portal658.init.ModItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		ModItems.registerItemVariants();
		ModBlocks.registerItemVariants();
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}
