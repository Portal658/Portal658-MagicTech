package portal658.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import portal658.Portal658;
import portal658.Reference;

public class BlockGotoman extends Block
{
	public BlockGotoman() 
	{
		super(Material.IRON);
		setUnlocalizedName(Reference.Portal658Blocks.GOTOMAN.getUnlocalizedName());
		setRegistryName(Reference.Portal658Blocks.GOTOMAN.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
		setHardness(2);
	}
}
