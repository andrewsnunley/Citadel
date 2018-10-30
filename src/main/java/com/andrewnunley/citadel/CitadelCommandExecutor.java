package com.andrewnunley.citadel;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CitadelCommandExecutor implements CommandExecutor {
	private final Citadel plugin;
	
	public CitadelCommandExecutor(Citadel plugin) {
		this.plugin = plugin;
	}
	
	public void registerCommands() {
        plugin.getCommand("msg").setExecutor(this);
        plugin.getCommand("recall").setExecutor(this);
        plugin.getCommand("mark").setExecutor(this);
	}
	
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("msg")) {
        	if (sender instanceof Player) {
    	        sender.sendMessage("Msg.");
        	}
            return true;
        }
        else if (cmd.getName().equalsIgnoreCase("recall")) {
        	if (sender instanceof Player) {
        		World world;
        		Player player;
    	        Location spawn;
    	        
    	        player = (Player) sender;
    	        world = player.getWorld();
    	        spawn = world.getSpawnLocation();
    	        if ( player.getLocation() == spawn) {
    	             player.sendMessage("Look around you.");
    	        }
    	        else if (player.teleport(spawn)) {
    	        	player.sendMessage("You recall to the world spawn.");
    	        }
    	        else {
    	        	player.sendMessage("Nothing happens.");
    	        }
        	}
            return true;
        }
        else if (cmd.getName().equalsIgnoreCase("mark")) {
        	if (sender instanceof Player) {
    	        sender.sendMessage("Mark.");
        	}
            return true;
        }
        return false;
    }
}
