package portal658.configuration;

import net.minecraftforge.common.config.Configuration;
import portal658.proxy.CommonProxy;

public class Config {

	private static final String CATEGORY_WORLDGEN = "worldgen";

	public static boolean enableWorldgen = true;

	public static void readConfig() {
		Configuration cfg = CommonProxy.config;
		try {
			cfg.load();
			initWorldgen(cfg);
		} catch (Exception e1) {
			// TODO error read config file
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
	}

	private static void initWorldgen(Configuration cfg) {
		cfg.addCustomCategoryComment(CATEGORY_WORLDGEN, "Worldgen configuration");
		enableWorldgen = cfg.getBoolean("Enable worldgen", "Worldgen configuration", true, "");

	}
}
