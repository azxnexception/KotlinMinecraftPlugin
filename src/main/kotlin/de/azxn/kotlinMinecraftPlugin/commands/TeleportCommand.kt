package de.azxn.kotlinMinecraftPlugin.commands

import de.azxn.kotlinMinecraftPlugin.utils.FormattingUtils
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class TeleportCommand : CommandExecutor {
    override fun onCommand(p0: CommandSender, p1: Command, p2: String, p3: Array<out String>?): Boolean {
        p0.sendMessage(FormattingUtils.PREFIX.append(FormattingUtils.empty("<red>Soon...")))
        return true
    }
}