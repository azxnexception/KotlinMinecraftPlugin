package de.azxn.kotlinMinecraftPlugin

import de.azxn.kotlinMinecraftPlugin.listener.PlayerConnectionListener
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class KotlinMinecraftPlugin : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(MiniMessage.miniMessage().deserialize("<gray>Willkommen zu meinem ersten Kotlin Minecraft Plugin"))

        server.pluginManager.registerEvents(PlayerConnectionListener(), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
