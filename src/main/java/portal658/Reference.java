package portal658;

public class Reference {
	public static final String MOD_ID = "portal658";
	public static final String NAME = "Portal658 - MagicTech";
	
	public static final String CLIENT_PROXY_CLASS = "portal658.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "portal658.proxy.ServerProxy";
	
	public static enum Portal658Items
	{
		COPPER_COIN("copperCoin", "ItemCopperCoin"),
		IRON_COIN("ironCoin", "ItemIronCoin"),
		SILVER_COIN("silverCoin", "ItemSilverCoin"),
		GOLD_COIN("goldCoin", "ItemGoldCoin"),
		PLATINUM_COIN("platinumCoin", "ItemPlatinumCoin"),
		OSMIUM_COIN("osmiumCoin", "ItemOsmiumCoin"),
		NAQUADAH_COIN("naquadahCoin", "ItemNaquadahCoin"),
		NEUTRONIUM_COIN("neutroniumCoin", "ItemNeutroniumCoin"),
		ZAMBIA_COIN("zambiaCoin", "ItemZambiaCoin"),
		ERROR_COIN("errorCoin", "ItemErrorCoin"),
		RADIACTIVE_COIN("radiactiveCoin", "ItemRadiactiveCoin"),
		HORSE_COIN("horseCoin", "ItemHorseCoin"),
		CHURCH_COIN("churchCoin", "ItemChurchCoin"),
		SUS_COIN("susCoin", "ItemSusCoin"),
		PROGRESSION_COIN("progressionCoin", "ItemProgressionCoin"),
		INTEGRAL_COIN("integralCoin", "ItemIntegralCoin"),
		METPROM_COIN("metpromCoin", "ItemMetpromCoin"),
		LUCKY_TICKET("luckyTicket", "ItemLuckyTicket"),
		MOROVIZKA("morovizka", "ItemMorovizka"),
		CHISEL_RAR("chisel_rar", "ItemChisel_rar"),
		SUPERCONDUCTOR("superconductor", "ItemSuperconductor"),
		SUPER_CIRCUIT("super_circuit", "ItemSuper_circuit"),
		MAGICAL_ORB("magical_orb", "ItemMagical_orb");
		
		private String unlocalizedName;
		private String registryName;
		
		Portal658Items(String unlocalizedName, String registryName)
		{
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName()
		{
			return unlocalizedName;
		}
		
		public String getRegistryName()
		{
			return registryName;
		}
	}
	
	public static enum Portal658Blocks
	{
		COPPER_COIN_ORE("copper_coin_ore", "BlockCopper_coin_ore"),
		IRON_COIN_ORE("iron_coin_ore", "BlockIron_coin_ore"),
		SILVER_COIN_ORE("silver_coin_ore", "BlockSilver_coin_ore"),
		EPIC_COIN_ORE("epic_coin_ore", "BlockEpic_coin_ore"),
		RANDOM_ORE("random_ore", "BlockRandom_ore"),
		LAVRUSHA("lavrusha", "BlockLavrusha"),
		PARROT("parrot", "BlockParrot"),
		UNIFICATED_THAUMIUM_BLOCK("unificated_thaumium_block", "BlockUnificated_thaumium_block"),
		MOROVIZKA("morovizka", "BlockMorovizka"),
		ASKARINKA("askarinka", "BlockAskarinka"),
		GOTOMAN("gotoman", "BlockGotoman"),
		MORDA("morda", "BlockMorda"),
		BERTI("berti", "BlockBerti"),
		RUVON("ruvon", "BlockRuvon");
		
		private String unlocalizedName;
		private String registryName;
	
		Portal658Blocks(String unlocalizedName, String registryName)
		{
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
	
		public String getUnlocalizedName()
		{
			return unlocalizedName;
		}
	
		public String getRegistryName()
		{
			return registryName;
		}
	}
}
