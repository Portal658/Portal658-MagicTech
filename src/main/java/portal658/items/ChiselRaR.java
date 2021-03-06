package portal658.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import portal658.Portal658;
import portal658.Reference;

public class ChiselRaR extends Item {
	public ChiselRaR() {
		this.setUnlocalizedName(Reference.Portal658Items.CHISEL_RAR.getUnlocalizedName());
		this.setRegistryName(Reference.Portal658Items.CHISEL_RAR.getRegistryName());
		this.setCreativeTab(Portal658.CREATIVE_TAB);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		player.sendMessage(
				new TextComponentString("Chisel.rar otkrit, fotki mojno naiti v papke minecraft/fotki_gotomana"));
		return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}

	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.EPIC;
	}
}
