package com.pixelcatt.simpleban;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import java.util.UUID;


public class LoginListener implements Listener {

    private final SimpleBan plugin;
    private final BanManager manager;

    public LoginListener(SimpleBan plugin, BanManager manager) {
        this.plugin = plugin;
        this.manager = manager;
    }

    @EventHandler
    public void onPreLogin(AsyncPlayerPreLoginEvent event) {
        UUID uuid = event.getUniqueId();

        if (manager.isBanned(uuid)) {
            event.disallow(AsyncPlayerPreLoginEvent.Result.KICK_BANNED, manager.getBanMessage(uuid).toLegacyText());
        }
    }
}