package portal658.blocks.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import portal658.blocks.blocklist.ListMiscBlocks;

public class ItemBlockMiscBlock extends ItemBlock
{
	public ItemBlockMiscBlock(Block block)
	{
		super(block);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return "tile.miscblock_" + ListMiscBlocks.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public int getMetadata(int damage)
	{
		return damage;
	}
	
	@Override
	public EnumRarity getRarity(ItemStack stack)
	{
		return ListMiscBlocks.values()[stack.getItemDamage()].getRarity();
	}
}
