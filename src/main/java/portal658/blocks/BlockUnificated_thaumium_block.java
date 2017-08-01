package portal658.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import portal658.Portal658;
import portal658.Reference;

public class BlockUnificated_thaumium_block extends Block 
{
	public BlockUnificated_thaumium_block()
	{
		super(Material.IRON);
		setUnlocalizedName(Reference.Portal658Blocks.UNIFICATED_THAUMIUM_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.Portal658Blocks.UNIFICATED_THAUMIUM_BLOCK.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
		setHardness(2);
	}
}
