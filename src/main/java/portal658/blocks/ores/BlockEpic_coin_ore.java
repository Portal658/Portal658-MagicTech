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

public class BlockEpic_coin_ore extends Block
{
	public BlockEpic_coin_ore()
	{
		super(Material.IRON);
		setUnlocalizedName(Reference.Portal658Blocks.EPIC_COIN_ORE.getUnlocalizedName());
		setRegistryName(Reference.Portal658Blocks.EPIC_COIN_ORE.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
		setHardness(2);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		int random = rand.nextInt(10);
		switch(random)
		{
		case 0: return ModItems.zambiaCoin;
		case 1: return ModItems.susCoin;
		case 2: return ModItems.progressionCoin;
		case 3: return ModItems.integralCoin;
		case 4: return ModItems.metpromCoin;
		case 5: return ModItems.luckyTicket;
		case 6: return ModItems.errorCoin;
		case 7: return ModItems.radiactiveCoin;
		case 8: return ModItems.horseCoin;
		case 9: return ModItems.churchCoin;
		}
		return null;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return rand.nextInt(4) == 2 ? 2 : 1;
	}
}