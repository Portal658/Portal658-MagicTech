package portal658;

public class Reference {
	public static final String MOD_ID = "portal658";
	public static final String NAME = "Portal658 - MagicTech";
	public static final String ACCEPTED_VERSION = "[1.12, 1.12.1]";
	
	public static final String CLIENT_PROXY_CLASS = "portal658.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "portal658.proxy.ServerProxy";
	
	public static enum Portal658Items
	{
		BASIC_COIN("basicCoin", "basicCoin"),
		OTHER_COIN("otherCoin", "otherCoin"),
		CRAFTING_COMPONENT("craftingComponent", "craftingComponent"),
		LUCKY_TICKET("luckyTicket", "luckyTicket"),
		MOROVIZKA("morovizka", "morovizka"),
		CHISEL_RAR("chisel_rar", "chisel_rar");
		
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
		COIN_ORE("coinOre", "coinOre"),
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
