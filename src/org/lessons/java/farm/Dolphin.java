package org.lessons.java.farm;

public class Dolphin extends Animal{
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void eating() {
        System.out.println("I eat fish");
    }

    @Override
    public void animalSound() {
        System.out.println("hihihihihi");
    }
}
