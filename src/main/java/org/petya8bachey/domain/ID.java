package org.petya8bachey.domain;

public class ID {
    public static long id = 0;
    public static long genID() {
        return id++;
    }
}
