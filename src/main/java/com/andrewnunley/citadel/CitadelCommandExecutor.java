package com.andrewnunley.citadel;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CitadelCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("naharlcmd")) {
        	if (sender instanceof Player) {
    	        sender.sendMessage("Success.");
        	}
            return true;
        }
    	return false;
    }
}
