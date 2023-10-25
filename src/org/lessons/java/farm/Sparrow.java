package org.lessons.java.farm;

public class Sparrow extends Animal implements CanFly{
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

    @Override
    public void fly() {
        System.out.println("I'm a little sparrow and I can fly");
    }
}
