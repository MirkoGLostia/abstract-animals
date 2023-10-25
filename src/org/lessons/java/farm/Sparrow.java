package org.lessons.java.farm;

public class Sparrow extends Animal{
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void eating() {
        System.out.println("I eat worms");
    }

    @Override
    public void animalSound() {
        System.out.println("chip!!");
    }
}
