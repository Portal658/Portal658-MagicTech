package portal658.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import portal658.Portal658;
import portal658.Reference;
import portal658.blocks.blocklist.ListMiscBlocks;

public class MiscBlock extends Block {
	public static final PropertyEnum TYPE = PropertyEnum.create("type", ListMiscBlocks.class);

	public MiscBlock() {
		super(Material.ROCK);
		this.setUnlocalizedName(Reference.Portal658Blocks.MISCBLOCK.getUnlocalizedName());
		this.setRegistryName(Reference.Portal658Blocks.MISCBLOCK.getRegistryName());
		this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, ListMiscBlocks.ASKARINKA));
		this.setCreativeTab(Portal658.CREATIVE_TAB);
		this.setHardness(3);
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { TYPE });
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		ListMiscBlocks type = (ListMiscBlocks) state.getValue(TYPE);
		return type.getMetadata();
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(TYPE, ListMiscBlocks.values()[meta]);
	}

	@Override
	public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> items) {
		for (int i = 0; i < ListMiscBlocks.values().length; ++i) {
			items.add(new ItemStack(this, 1, i));
		}
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos,
			EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state,
			int fortune) {
		drops.add(new ItemStack(this, 1, getMetaFromState(state)));
	}
}
