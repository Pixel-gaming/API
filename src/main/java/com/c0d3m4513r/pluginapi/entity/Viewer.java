package com.c0d3m4513r.pluginapi.entity;

import com.c0d3m4513r.pluginapi.messages.Title;
import com.c0d3m4513r.pluginapi.registry.Sound;
import com.c0d3m4513r.pluginapi.world.Locatable;
import com.c0d3m4513r.pluginapi.world.Location;

public interface Viewer {
    void playSound(Sound sound, Location location, int volume);
    void sendTitle(Title title);
}
