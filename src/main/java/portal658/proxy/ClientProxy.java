package portal658.proxy;

import net.minecraftforge.fml.common.registry.GameRegistry;
import portal658.init.ModBlocks;
import portal658.init.ModItems;
import portal658.worldgen.OreGen;

public class ClientProxy implements CommonProxy
{

	public void init()
	{
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
	}

}
