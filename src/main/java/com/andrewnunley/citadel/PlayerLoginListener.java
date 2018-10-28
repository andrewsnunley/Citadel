package com.andrewnunley.citadel;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public final class PlayerLoginListener implements Listener {
    @EventHandler // EventPriority.NORMAL
    public void onLogin(PlayerLoginEvent event) {
    	//if (event.getResult() == PlayerLoginEvent.Result.ALLOWED ) {
    	    Player player = event.getPlayer();
    	    player.sendMessage("Welcome to Dev!");
    	//}
    }
}
