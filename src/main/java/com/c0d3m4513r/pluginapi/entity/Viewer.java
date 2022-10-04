package com.c0d3m4513r.pluginapi.entity;

import com.c0d3m4513r.pluginapi.Data.Point3D;
import com.c0d3m4513r.pluginapi.messages.Title;
import com.c0d3m4513r.pluginapi.registry.Sound;

public interface Viewer {
    void playSound(Sound sound, Point3D position, int volume);
    void sendTitle(Title title);
}
