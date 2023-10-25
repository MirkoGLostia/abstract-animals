package org.lessons.java.bonus.electronics;

public class Creator {

    public static Functionality create(int arg, String name){
        return switch (arg) {
            case 1 -> new Playstation(name);
            case 2 -> new DVDReader(name);
            default -> null;
        };
    }
}
