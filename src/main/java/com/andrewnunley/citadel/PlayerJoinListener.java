package com.andrewnunley.citadel;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public final class PlayerJoinListener implements Listener {
    @EventHandler
    public void onLogin(PlayerJoinEvent event) {
   	    Player player = event.getPlayer();
   	    player.sendMessage("Welcome to Dev!");
    }
}
