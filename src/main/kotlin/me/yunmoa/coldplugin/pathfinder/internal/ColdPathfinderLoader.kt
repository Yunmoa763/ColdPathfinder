package me.yunmoa.coldplugin.pathfinder.internal

import me.yunmoa.coldplugin.pathfinder.ColdPathfinder.plugin
import me.yunmoa.coldplugin.pathfinder.util.BasicUtils
import org.bukkit.Bukkit
import taboolib.common.LifeCycle
import taboolib.common.platform.Awake
import taboolib.common.platform.Platform
import taboolib.common.platform.function.console
import taboolib.module.lang.sendLang
import taboolib.module.metrics.Metrics

/**
 * ColdPathfinder
 * me.yunmoa.coldplugin.pathfinder.internal
 *
 * @author Yunmoa
 * @since 2023/10/1 15:08
 */
object ColdPathfinderLoader {
    @Awake(LifeCycle.LOAD)
    fun onLoad() {
        console().sendMessage("")
        console().sendLang("Plugin-Loading", Bukkit.getServer().version)
        console().sendMessage("")
        // TODO Metrics 更改
        Metrics(19660, plugin.description.version, Platform.BUKKIT)
    }

    @Awake(LifeCycle.ENABLE)
    fun onEnable() {
        console().sendLang("Plugin-Enabled")
    }

    @Awake(LifeCycle.ACTIVE)
    fun onActive() {
        BasicUtils.debug("Debug 已开启！")
    }

    @Awake(LifeCycle.DISABLE)
    fun onDisable() {
        console().sendLang("Plugin-Disable")
    }
}