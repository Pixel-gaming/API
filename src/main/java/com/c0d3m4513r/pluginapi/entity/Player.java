package com.c0d3m4513r.pluginapi.entity;

import com.c0d3m4513r.pluginapi.Scoreboard.Scoreboard;
import com.c0d3m4513r.pluginapi.command.CommandSource;
import com.c0d3m4513r.pluginapi.world.Locatable;

public interface Player extends CommandSource, Locatable, Viewer {
    /**
     * Gets the {@link Scoreboard} displayed to the player.
     *
     * @return The scoreboard displayed to the player
     */
    Scoreboard getScoreboard();

    /**
     * Sets the {@link Scoreboard} displayed to the player.
     *
     * @param scoreboard The scoreboard to display
     */
    void setScoreboard(Scoreboard scoreboard);
}
