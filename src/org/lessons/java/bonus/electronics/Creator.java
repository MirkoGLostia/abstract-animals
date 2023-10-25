package org.lessons.java.bonus.electronics;

public class Creator {

    public static Functionality create(String arg, String name){
        if (arg.equals("playstation")){
            return new Playstation(name);
        }else if (arg.equals("DVDreader")){
            return new DVDReader(name);
        }else {
            return null;
        }
    }
}
