package de.orbit.CaR.game;


import org.spongepowered.api.entity.living.player.Player;

import java.util.HashMap;
import java.util.Map;

public class GameManager {

    private HashMap<Player,GamePlayer> players;


    public HashMap<Player, GamePlayer> getPlayers() {
        return players;
    }

    public void setPlayers(HashMap<Player, GamePlayer> players) {
        this.players = players;
    }
}
