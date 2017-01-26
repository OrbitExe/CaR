package de.orbit.CaR.map;



import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

import java.util.List;


public class Prison {

    private Location<World> prisonMin;
    private Location<World> prisonMax;
    private Location<World> prisonSpawn;

    public Prison(Location<World> prisonMin, Location<World> prisonMax, Location<World> prisonSpawn) {

        this.prisonMin = prisonMin;
        this.prisonMax = prisonMax;
        this.prisonSpawn = prisonSpawn;

    }
    public Location<World> getPrisonSpawn() {
        return prisonSpawn;
    }

    public void setPrisonSpawn(Location<World> prisonSpawn) {
        this.prisonSpawn = prisonSpawn;
    }

    public Location<World> getPrisonMax() {
        return prisonMax;
    }

    public void setPrisonMax(Location<World> prisonMax) {
        this.prisonMax = prisonMax;
    }

    public Location<World> getPrisonMin() {
        return prisonMin;
    }

    public void setPrisonMin(Location<World> prisonMin) {
        this.prisonMin = prisonMin;
    }


}
