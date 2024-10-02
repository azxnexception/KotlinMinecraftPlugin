package de.azxn.kotlinMinecraftPlugin.utils

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextDecoration
import net.kyori.adventure.text.minimessage.MiniMessage

class FormattingUtils {
    companion object {

        val PREFIX: Component = empty("<#5418FC>Kotlin <dark_gray>| <gray>")
        val NOPERMISSION: Component = PREFIX.append(empty("<red>You don't have permission to do that!"))

        fun empty(message: String): Component {
            return MiniMessage.miniMessage().deserialize(message)
        }
    }

}