package de.azxn.kotlinMinecraftPlugin.commands

import de.azxn.kotlinMinecraftPlugin.utils.FormattingUtils
import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class TeleportCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, strings: String, string: Array<out String>?): Boolean {
        if (sender is Player ) {
            var player = sender
            if (strings.length == 1) {
                var target = Bukkit.getPlayerExact(strings[0].toString())
                if (target != null) {
                    player.teleport(target.getLocation())
                } else {
                    player.sendMessage(FormattingUtils.PREFIX.append(FormattingUtils.empty("<red>Player not found!")))
                }
            } else {
                player.sendMessage(FormattingUtils.PREFIX.append(FormattingUtils.empty("<red>Usage: /teleport <player>")))
            }
        }

        return true

    }
}