package com.c0d3m4513r.pluginapi.events;

import lombok.ToString;

@ToString
public enum EventType {
    preinit,
    init,
    commandRegister,
    load_complete,

    ///This may potentially be executed multiple times, but for the first time it gets executed,
    serverStarting,
    onReboot,

}
