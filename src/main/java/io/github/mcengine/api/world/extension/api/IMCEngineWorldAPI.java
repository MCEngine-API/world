package io.github.mcengine.api.world.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Represents a World-based API module that can be dynamically loaded into MCEngine.
 * <p>
 * Implement this interface to provide world-related APIs to the system.
 */
public interface IMCEngineWorldAPI {

    /**
     * Called when the World API is loaded by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the World API is unloaded or disabled by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this World API instance.
     *
     * @param id the unique ID assigned by the engine
     */
    void setId(String id);
}
