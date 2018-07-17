package portal658.configuration;

import net.minecraftforge.common.config.Configuration;
import portal658.proxy.CommonProxy;

public class Config {

	private static final String CATEGORY_WORLDGEN = "worldgen";
	private static final String CATEGORY_OTHER = "craftingcomponents";

	public static boolean enableWorldgen = true;
	public static boolean enableCraftingComponents = true;

	public static void readConfig() {
		Configuration cfg = CommonProxy.config;
		try {
			cfg.load();
			initWorldgen(cfg);
			initOther(cfg);
		} catch (Exception e1) {
			// TODO error read config file
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
	}

	private static void initOther(Configuration cfg) {
		cfg.addCustomCategoryComment(CATEGORY_OTHER, "Other options");
		enableCraftingComponents = cfg.getBoolean("Enable crafting components", "Crafting components configuration",
				true, "");
	}

	private static void initWorldgen(Configuration cfg) {
		cfg.addCustomCategoryComment(CATEGORY_WORLDGEN, "Worldgen configuration");
		enableWorldgen = cfg.getBoolean("Enable worldgen", "Worldgen configuration", true, "");

	}
}
