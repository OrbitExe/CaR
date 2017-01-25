package de.orbit.CaR;

import com.google.inject.Inject;
import de.orbit.CaR.team.Teams;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

/**
 * Created by m0ys on 23.01.2017.
 */

@Plugin(id = "car", name = "Cops and Robbers", version = "0.1")
public class CopsAndRobbers {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        this.logger.info("Cops and Robbers plugin is loading.");
    }
}
