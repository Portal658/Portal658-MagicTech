package portal658.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import portal658.Portal658;
import portal658.Reference;
import portal658.blocks.blocklist.ListCoinOres;
import portal658.init.ModItems;
import portal658.items.itemlist.ListBasicCoins;
import portal658.items.itemlist.ListOtherCoins;

public class CoinOre extends Block
{
	public static final ListCoinOres[] coinOres = ListCoinOres.values();
	public static final PropertyEnum TYPE = PropertyEnum.create("type", ListCoinOres.class);
	
	public CoinOre()
	{
		super(Material.ROCK);
		setUnlocalizedName(Reference.Portal658Blocks.COIN_ORE.getUnlocalizedName());
		setRegistryName(Reference.Portal658Blocks.COIN_ORE.getRegistryName());
		setCreativeTab(Portal658.CREATIVE_TAB);
		this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE,  ListCoinOres.COPPER));
		setHardness(2);
	}
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, TYPE);
	}
	
	@Override
	public int getMetaFromState(IBlockState state)
	{
		ListCoinOres type = (ListCoinOres) state.getValue(TYPE);
		return type.getMetadata();
	}
		
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(TYPE, ListCoinOres.values()[meta]);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (tab == Portal658.CREATIVE_TAB)
		{
			for (int i = 0; i < coinOres.length; ++i)
			{
				items.add(new ItemStack(this, 1, i));
			}
		}
	}
	
	public static void registerItemVariants(Block block)
	{
		ResourceLocation[] rl_coinores = new ResourceLocation[ListCoinOres.values().length];
		for(ListCoinOres list : ListCoinOres.values())
        {
			ResourceLocation location = new ResourceLocation("portal658:ores/coinore_" + list.getName());
			rl_coinores[list.getMetadata()] = location;
        }
		ModelBakery.registerItemVariants(Item.getItemFromBlock(block), rl_coinores);
	}
	
	public static void registerRender(Block block)
	{
		for(ListCoinOres list : ListCoinOres.values())
        {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),
				list.getMetadata(), new ModelResourceLocation("portal658:ores/coinore_" + list.getName(), "inventory"));
        }
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
	{
		if (getMetaFromState(state) != ListCoinOres.EPIC.getMetadata())
		{
			getDropFromBasicCoinOres(drops, state, fortune);
		}
		else
		{
			getDropFromEpicCoinOre(drops, state, fortune);
		}
	}
	
	private void getDropFromBasicCoinOres(NonNullList<ItemStack> drops, IBlockState state, int fortune)
	{
		Random rand = new Random();
		if (getMetaFromState(state) == ListCoinOres.COPPER.getMetadata())
		{
			int metadata = ListBasicCoins.COPPER_COIN.getMetadata();
			int amount = 3 + Math.round((2.4F * rand.nextInt(fortune + 1)));
			drops.add(new ItemStack(ModItems.basicCoin, amount, metadata));
		}
		if (getMetaFromState(state) == ListCoinOres.IRON.getMetadata())
		{
			int metadata = ListBasicCoins.IRON_COIN.getMetadata();
			int amount = 2 + Math.round(1.7F * rand.nextInt(fortune + 1));
			drops.add(new ItemStack(ModItems.basicCoin, amount, metadata));
		}
		if (getMetaFromState(state) == ListCoinOres.SILVER.getMetadata())
		{
			int metadata = ListBasicCoins.SILVER_COIN.getMetadata();
			int amount = 1 + Math.round(1.2F * rand.nextInt(fortune + 1));
			drops.add(new ItemStack(ModItems.basicCoin, amount, metadata));
		}
	}
	
	private void getDropFromEpicCoinOre(NonNullList<ItemStack> drops, IBlockState state, int fortune)
	{
		int amount = new Random().nextInt(4) == 2 ? 2 : 1;
		for (int i = 0; i < amount; ++i)
		{
			int random = new Random().nextInt(ListOtherCoins.values().length);
			drops.add(new ItemStack(ModItems.otherCoin, 1, random));
		}
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune)
	{
		Random rand = new Random();
		if (getMetaFromState(state) == ListCoinOres.EPIC.getMetadata())
		{
			return MathHelper.getInt(rand, 3, 7);
		}
		else
		{
			return MathHelper.getInt(rand, 0, 2);
		}
	}
}
