package io.github.mcengine.api.world.extension.library;

import org.bukkit.plugin.Plugin;

/**
 * Represents a World-based Library module that can be dynamically loaded into MCEngine.
 * <p>
 * Implement this interface to provide world-related library support to the system.
 */
public interface IMCEngineWorldLibrary {

    /**
     * Called when the World Library is loaded by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the World Library is unloaded or disabled by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this World Library instance.
     *
     * @param id the unique ID assigned by the engine
     */
    void setId(String id);
}
