package com.c0d3m4513r.pluginapi.events;

import lombok.ToString;

@ToString
public enum EventType {
    preinit,
    init,
    load_complete,
    commandRegister,
    onReboot,

}
