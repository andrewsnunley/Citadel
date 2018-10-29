package com.andrewnunley.citadel;

import org.bukkit.plugin.java.JavaPlugin;

public final class Citadel extends JavaPlugin {
    @Override
    public void onEnable() {
        // startup
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
    }
   
    @Override
    public void onDisable() {
	    // cleanup
    }
}
