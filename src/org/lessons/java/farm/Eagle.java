package org.lessons.java.farm;

public class Eagle extends Animal{
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
}
