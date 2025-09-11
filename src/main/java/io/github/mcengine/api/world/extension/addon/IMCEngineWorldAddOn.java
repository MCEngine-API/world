package io.github.mcengine.api.world.extension.addon;

import org.bukkit.plugin.Plugin;

/**
 * Represents a World-based AddOn module that can be dynamically loaded into MCEngine.
 * <p>
 * Implement this interface to integrate world-related features into the engine
 * via the AddOn extension system.
 */
public interface IMCEngineWorldAddOn {

    /**
     * Called when the World AddOn is loaded by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the AddOn is unloaded or disabled by the engine.
     * <p>
     * Use this method to release resources, unregister listeners,
     * or perform any necessary cleanup.
     *
     * @param plugin the plugin instance providing context
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this World AddOn instance.
     *
     * @param id the unique ID assigned by the engine
     */
    void setId(String id);
}
