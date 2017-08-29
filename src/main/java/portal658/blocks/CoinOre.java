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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import portal658.Portal658;
import portal658.Reference;
import portal658.blocks.blocklist.ListCoinOres;

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
	public int damageDropped(IBlockState state)
	{
		return this.getMetaFromState(state);
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
			System.out.println("portal658:ores/coinore_" + list.getName());
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
}
