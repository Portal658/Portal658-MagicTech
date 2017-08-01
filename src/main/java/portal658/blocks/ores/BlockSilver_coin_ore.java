package portal658.blocks.ores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import portal658.Portal658;
import portal658.Reference;
import portal658.init.ModItems;

public class BlockSilver_coin_ore extends Block
{
	public BlockSilver_coin_ore()
	{
		super(Material.IRON);
		setUnlocalizedName(Reference.Portal658Blocks.SILVER_COIN_ORE.getUnlocalizedName());
		setRegistryName(Reference.Portal658Blocks.SILVER_COIN_ORE.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
		setHardness(2);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ModItems.silverCoin;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return 1 + rand.nextInt(3);
	}
}