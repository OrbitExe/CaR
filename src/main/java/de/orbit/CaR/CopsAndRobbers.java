package de.orbit.CaR;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

/**
 * Created by m0ys on 23.01.2017.
 */

@Plugin(id = "car")
public class CopsAndRobbers {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        this.logger.info("Kicking off the initializing process to prepare all necessary components.");
    }
}
