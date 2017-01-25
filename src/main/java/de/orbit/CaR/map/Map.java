package de.orbit.CaR.map;

import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;


/**
 * Created by boeschemeier on 25.01.2017.
 */
public class Map {

    private final int identifier;

    private Location<World> lobby;
    private Location<World> copsSpawn;
    private Location<World> robbersSpawn;

    private Prison prison;

    private int maxPlayers;

    public Map(int identifier) {

        this.identifier = identifier;

    }

    /**
     * Getter and Setter
     */
    public int getIdentifier() {
        return identifier;
    }

    public Location<World> getLobby() {
        return lobby;
    }

    public void setLobby(Location<World> lobby) {
        this.lobby = lobby;
    }

    public Location<World> getCopsSpawn() {
        return copsSpawn;
    }

    public void setCopsSpawn(Location<World> copsSpawn) {
        this.copsSpawn = copsSpawn;
    }

    public Location<World> getRobbersSpawn() {
        return robbersSpawn;
    }

    public void setRobbersSpawn(Location<World> robbersSpawn) {
        this.robbersSpawn = robbersSpawn;
    }

    public Prison getPrison() {
        return prison;
    }

    public void setPrison(Prison prison) {
        this.prison = prison;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }


}
