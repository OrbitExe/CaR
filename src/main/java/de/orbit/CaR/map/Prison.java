package de.orbit.CaR.map;



import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

import java.util.List;

/**
 * Created by boeschemeier on 25.01.2017.
 */
public class Prison {

    private Location<World> prisonMin;
    private Location<World> prisonMax;
    private Location<World> prisonSpawn;

    public Prison(Location<World> prisonMin, Location<World> prisonMax, Location<World> prisonSpawn) {

        this.prisonMin = prisonMin;
        this.prisonMax = prisonMax;
        this.prisonSpawn = prisonSpawn;

    }
}
