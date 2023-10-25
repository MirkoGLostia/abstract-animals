package org.lessons.java.farm;

public class Eagle extends Animal implements CanFly{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void eating() {
        System.out.println("I eat small animals");
    }

    @Override
    public void animalSound() {
        System.out.println("Squeeee!!");
    }

    @Override
    public void fly() {
        System.out.println("I'm an eagle and I can fly");
    }
}
