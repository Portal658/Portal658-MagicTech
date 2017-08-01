package portal658.blocks.ores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import portal658.Portal658;
import portal658.Reference;
import portal658.init.ModItems;

public class BlockRandom_ore extends Block {
	public BlockRandom_ore() {
		super(Material.IRON);
		setUnlocalizedName(Reference.Portal658Blocks.RANDOM_ORE.getUnlocalizedName());
		setRegistryName(Reference.Portal658Blocks.RANDOM_ORE.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
		setHardness(2);
		random_ore();
	}
	
	private int q_dropped = 0;
	private Item dropped_item;
	
	
	private void random_ore()
	{
		Random rand = new Random();
		int random = rand.nextInt(5);
		boolean r = random == 3 ? true : false; 
	}
	
	private void lagg()
	{
		int lag;
		for (int i = 0 ; i < 1000000000; ++i)
			lag = i;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		lagg();
		return dropped_item;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return q_dropped;
	}
	
	@SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        lagg();
        lagg();
        lagg();
        lagg();
        lagg();
		double d0 = (double)((float)pos.getX() + rand.nextFloat());
        double d1 = (double)((float)pos.getY() + 0.8F);
        double d2 = (double)((float)pos.getZ() + rand.nextFloat());
        double d3 = 0.0D;
        double d4 = 0.0D;
        double d5 = 0.0D;
        worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
    }
}
