package de.orbit.CaR.event;


import de.orbit.CaR.CaR;
import de.orbit.CaR.game.GamePlayer;
import de.orbit.CaR.map.Map;
import de.orbit.CaR.team.Teams;
import org.spongepowered.api.Game;
import org.spongepowered.api.entity.Transform;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.entity.living.humanoid.player.RespawnPlayerEvent;
import org.spongepowered.api.world.World;

public class EventListener {

    @Listener
    public void onPlayerDeath(RespawnPlayerEvent event) {

        GamePlayer player = CaR.getGameManager().getPlayers().get(event.getTargetEntity());

        if(player.getTeam() == Teams.ROBBERS){
            event.setToTransform(new Transform<World>(player.getMap().getPrison().getPrisonSpawn()));
            player.setBusted(true);
        } else if (player.getTeam() == Teams.COPS){
            event.setToTransform(new Transform<World>(player.getMap().getCopsSpawn()));
        }

    }

}
