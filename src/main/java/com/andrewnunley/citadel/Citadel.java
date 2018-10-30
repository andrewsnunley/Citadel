package com.andrewnunley.citadel;

import org.bukkit.plugin.java.JavaPlugin;
import com.andrewnunley.citadel.CitadelCommandExecutor;

public final class Citadel extends JavaPlugin {
    @Override
    public void onEnable() {
        // startup
    	
    	// events
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        
        // commands
        CitadelCommandExecutor citadelcommands = new CitadelCommandExecutor(this);
        citadelcommands.registerCommands();
    }
   
    @Override
    public void onDisable() {
	    // cleanup
    }
}
