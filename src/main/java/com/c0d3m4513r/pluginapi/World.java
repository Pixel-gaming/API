package com.c0d3m4513r.pluginapi;

import com.c0d3m4513r.pluginapi.Data.Point3D;
import com.c0d3m4513r.pluginapi.entity.Player;
import com.c0d3m4513r.pluginapi.entity.Viewer;
import com.c0d3m4513r.pluginapi.world.Location;

import java.util.Collection;

public interface World extends Viewer {
    Collection<Player> getPlayers();
    Location getSpawnLocation();

}
