package de.orbit.CaR;

import com.google.inject.Inject;
import de.orbit.CaR.game.GameManager;
import de.orbit.CaR.team.Teams;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;



@Plugin(id = "car", name = "Cops and Robbers", version = "0.1")

public class CaR {

    private static CaR instance;
    private static GameManager gameManager = new GameManager();

    public CaR(){
        CaR.instance = this;
    }

    public static CaR getInstance(){
        return CaR.instance;
    }

    @Inject
    private Logger logger;

    public static Logger getLogger() {
        return CaR.getInstance().logger;
    }

    public static GameManager getGameManager(){
        return CaR.gameManager;
    }

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        this.logger.info("Cops and Robbers plugin is loading.");
    }
}
