package de.orbit.CaR.team;

import org.spongepowered.api.text.format.TextColor;
import org.spongepowered.api.text.format.TextColors;

/**
 * Created by boeschemeier on 25.01.2017.
 */
public enum Teams implements Team {

    COPS {
        @Override
        public String displayName() {
            return "Cops";
        }

        @Override
        public TextColor color() {
            return TextColors.AQUA;
        }
    },
    ROBBERS {
        @Override
        public String displayName() {
            return "Robbers";
        }

        @Override
        public TextColor color() {
            return TextColors.GOLD;
        }
    }

}
