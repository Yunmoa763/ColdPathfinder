package me.yunmoa.coldplugin.pathfinder.internal.manager

import me.yunmoa.coldplugin.pathfinder.ColdPathfinder
import me.yunmoa.coldplugin.pathfinder.ColdPathfinder.plugin
import org.bukkit.configuration.ConfigurationSection
import org.bukkit.configuration.file.FileConfiguration
import org.bukkit.configuration.file.YamlConfiguration
import taboolib.common.LifeCycle
import taboolib.common.platform.Awake
import java.io.InputStreamReader

/**
 * ColdPathfinder
 * me.yunmoa.coldplugin.pathfinder.internal.manager
 *
 * @author Yunmoa
 * @since 2023/10/1 15:28
 */
object ConfigManager {

    /**
     * 获取配置文件
     */
    private val setting get() = ColdPathfinder.setting

    val debug
        get() =  setting.getBoolean("Options.Debug", false)

    /**
     * 重载配置管理器
     */
    fun reload() {
        ColdPathfinder.setting.reload()
    }
}