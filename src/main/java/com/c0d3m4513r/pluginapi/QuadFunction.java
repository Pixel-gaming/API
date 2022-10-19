package com.c0d3m4513r.pluginapi;

@FunctionalInterface
public interface QuadFunction<A,B,C,D,R> {
    R apply(A a, B b,C c,D d);
}
