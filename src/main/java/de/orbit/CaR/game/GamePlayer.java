package de.orbit.CaR.game;

import de.orbit.CaR.team.Team;
import org.spongepowered.api.entity.living.player.Player;


public class GamePlayer {

    private final Player player;

    private Team team;
    private boolean busted;

    public GamePlayer(Player player) {

        this.player = player;

    }

    public Player getPlayer() {
        return player;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public boolean isBusted() {
        return busted;
    }

    public void setBusted(boolean busted) {
        this.busted = busted;
    }

}
