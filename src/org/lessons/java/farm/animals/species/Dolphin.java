package org.lessons.java.farm.animals.species;

import org.lessons.java.farm.animals.charateristics.CanSwim;
import org.lessons.java.farm.animals.Animal;

public class Dolphin extends Animal implements CanSwim {
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

    @Override
    public void swim() {
        System.out.println("I'm a dolphin and I can swim");
    }
}
