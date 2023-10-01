package me.yunmoa.coldplugin.pathfinder.internal.listener

import me.yunmoa.coldplugin.pathfinder.api.event.PluginReloadEvent
import me.yunmoa.coldplugin.pathfinder.internal.manager.ConfigManager
import me.yunmoa.coldplugin.pathfinder.util.BasicUtils
import taboolib.common.platform.event.SubscribeEvent
import taboolib.common.platform.function.console
import taboolib.module.lang.sendLang

/**
 * ColdPathfinder
 * me.yunmoa.coldplugin.pathfinder.internal.listener
 *
 * @author Yunmoa
 * @since 2023/10/1 16:01
 */
object PluginReloadListener {
    @SubscribeEvent
    fun listener(event: PluginReloadEvent) {
        val startTime = BasicUtils.timing()

        ConfigManager.reload()

        console().sendLang("Plugin-Reloaded", BasicUtils.timing(startTime))
        BasicUtils.debug("Debug 模式已开启！")
    }
}