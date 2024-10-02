package de.azxn.kotlinMinecraftPlugin

import de.azxn.kotlinMinecraftPlugin.commands.TeleportCommand
import de.azxn.kotlinMinecraftPlugin.listener.PlayerConnectionListener
import de.azxn.kotlinMinecraftPlugin.utils.FormattingUtils
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class KotlinMinecraftPlugin : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(FormattingUtils.empty("<gray>Willkommen zu meinem ersten Kotlin Minecraft Plugin"))

        server.pluginManager.registerEvents(PlayerConnectionListener(), this)
        getCommand("teleport")?.setExecutor(TeleportCommand())
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
