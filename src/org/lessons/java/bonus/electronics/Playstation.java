package org.lessons.java.bonus.electronics;

public class Playstation extends Creator implements Functionality{
    private String name;

    public Playstation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println(this.name + " I'm a playstation and I'm on play");
    }

    @Override
    public void stop() {
        System.out.println(this.name + " I'm a playstation and I'm on stop");
    }

}
