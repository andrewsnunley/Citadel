package com.andrewnunley.citadel;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import net.md_5.bungee.api.ChatColor;

public final class PlayerJoinListener implements Listener {
    @EventHandler
    public void onLogin(PlayerJoinEvent event) {
   	    Player player = event.getPlayer();
   	    player.sendMessage(ChatColor.YELLOW + "Welcome to NunleyCraft!");
   	    //if player has news
   	    //player.sendMessage("You have count unread news items.");
   	    //if player has messages
   	    //player.sendMessage("You have count unread message(s).");
    }
}
