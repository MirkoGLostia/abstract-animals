package org.lessons.java.farm.animals.species;

import org.lessons.java.farm.animals.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eating() {
        System.out.println("I eat dog kibbles");
    }

    @Override
    public void animalSound() {
        System.out.println("woof!!");
    }
}
