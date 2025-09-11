package io.github.mcengine.api.world.extension.agent;

import org.bukkit.plugin.Plugin;

/**
 * Represents a World-based Agent module that can be dynamically loaded into MCEngine.
 * <p>
 * Implement this interface to integrate world-related agents into the system.
 */
public interface IMCEngineWorldAgent {

    /**
     * Called when the World Agent is loaded by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the World Agent is unloaded or disabled by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this World Agent instance.
     *
     * @param id the unique ID assigned by the engine
     */
    void setId(String id);
}
