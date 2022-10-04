package com.c0d3m4513r.pluginapi.messages;

import lombok.NonNull;
import lombok.Value;

import java.util.Optional;

@Value
public class Title {
    Optional<String> title;
    Optional<String> subtitle;
}
