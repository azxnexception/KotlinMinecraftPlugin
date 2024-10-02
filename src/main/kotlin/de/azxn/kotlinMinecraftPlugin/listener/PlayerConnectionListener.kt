package de.azxn.kotlinMinecraftPlugin.listener

import de.azxn.kotlinMinecraftPlugin.utils.FormattingUtils
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

class PlayerConnectionListener : Listener {

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        event.joinMessage(FormattingUtils.empty("<dark_gray>[<green>+<dark_gray>] <gray>" + event.player.name));
    }

    @EventHandler
    fun onPlayerQuit(event: PlayerQuitEvent) {
        event.quitMessage(FormattingUtils.empty("<dark_gray>[<red>-<dark_gray>] <gray>" + event.player.name));
    }


}