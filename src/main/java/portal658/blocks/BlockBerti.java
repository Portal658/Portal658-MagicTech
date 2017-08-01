package portal658.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import portal658.Portal658;
import portal658.Reference;

public class BlockBerti extends Block
{
	public BlockBerti()
	{
		super(Material.IRON);
		setUnlocalizedName(Reference.Portal658Blocks.BERTI.getUnlocalizedName());
		setRegistryName(Reference.Portal658Blocks.BERTI.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
		setHardness(2);
	}
}
