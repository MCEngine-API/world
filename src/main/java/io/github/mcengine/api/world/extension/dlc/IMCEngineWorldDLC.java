package io.github.mcengine.api.world.extension.dlc;

import org.bukkit.plugin.Plugin;

/**
 * Represents a World-based DLC module that can be dynamically loaded into MCEngine.
 * <p>
 * Implement this interface to integrate downloadable world content into the system.
 */
public interface IMCEngineWorldDLC {

    /**
     * Called when the World DLC is loaded by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the World DLC is unloaded or disabled by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this World DLC instance.
     *
     * @param id the unique ID assigned by the engine
     */
    void setId(String id);
}
