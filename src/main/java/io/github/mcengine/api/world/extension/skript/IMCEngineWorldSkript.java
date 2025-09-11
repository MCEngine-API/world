package io.github.mcengine.api.world.extension.skript;

import org.bukkit.plugin.Plugin;

/**
 * Represents a World-based Skript module that can be dynamically loaded into MCEngine.
 * <p>
 * Implement this interface to integrate scripted world content into the system.
 */
public interface IMCEngineWorldSkript {

    /**
     * Called when the World Skript module is loaded by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the World Skript module is unloaded or disabled by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this World Skript instance.
     *
     * @param id the unique ID assigned by the engine
     */
    void setId(String id);
}
