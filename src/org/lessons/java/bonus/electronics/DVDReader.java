package org.lessons.java.bonus.electronics;

public class DVDReader extends Creator implements Functionality{
    private String name;

    public DVDReader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println(this.name + " I'm a DVDReader and I'm on play");
    }

    @Override
    public void stop() {
        System.out.println(this.name + " I'm a DVDReader and I'm on stop");
    }
}
