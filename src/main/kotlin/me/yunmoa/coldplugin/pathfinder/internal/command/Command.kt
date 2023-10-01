package me.yunmoa.coldplugin.pathfinder.internal.command

import me.yunmoa.coldplugin.pathfinder.api.event.PluginReloadEvent
import org.bukkit.command.CommandSender
import taboolib.common.platform.command.CommandBody
import taboolib.common.platform.command.CommandHeader
import taboolib.common.platform.command.mainCommand
import taboolib.common.platform.command.subCommand
import taboolib.common.platform.function.submit
import taboolib.expansion.createHelper
import taboolib.platform.BukkitAdapter

/**
 * ColdPathfinder
 * me.yunmoa.coldplugin.pathfinder.internal.command
 *
 * @author Yunmoa
 * @since 2023/10/1 15:37
 */
@CommandHeader(name = "ColdPathfinder", aliases = ["cpf"])
object Command {

    @CommandBody
    val main = mainCommand {
        execute<CommandSender> { _, _, _ ->
            createHelper()
        }
    }

    @CommandBody
    val reload = subCommand {
        execute<CommandSender> { _, _, _ ->
            submit(async = true) {
                PluginReloadEvent().call()
            }
        }
    }
}