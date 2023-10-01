package me.yunmoa.coldplugin.pathfinder.util

import me.yunmoa.coldplugin.pathfinder.internal.manager.ConfigManager
import taboolib.common.platform.function.console
import taboolib.common5.Coerce
import taboolib.module.lang.sendLang

/**
 * ColdPathfinder
 * me.yunmoa.coldplugin.pathfinder.util
 *
 * @author Yunmoa
 * @since 2023/10/1 15:12
 */
object BasicUtils {
    fun debug(text: String) {
        if (ConfigManager.debug) {
            console().sendLang("Plugin-Debug", text)
        }
    }

    fun timing(): Long {
        return System.nanoTime()
    }

    fun timing(start: Long): Double {
        return Coerce.format((System.nanoTime() - start).div(1000000.0))
    }
}