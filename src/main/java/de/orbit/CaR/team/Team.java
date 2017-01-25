package de.orbit.CaR.team;

import org.spongepowered.api.text.format.TextColor;

public interface Team {

    /**
     * The name of the team used in e.g.: chat on signs and so on.
     *
     * @return
     */
    String displayName();

    /**
     * The color of the team used in e.g: chat on signs and so on.
     *
     * @return
     */
    TextColor color();



}
