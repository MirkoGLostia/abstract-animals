package org.lessons.java.farm;

import org.lessons.java.farm.animals.Animal;
import org.lessons.java.farm.animals.charateristics.CanFly;
import org.lessons.java.farm.animals.charateristics.CanSwim;
import org.lessons.java.farm.animals.species.Dog;
import org.lessons.java.farm.animals.species.Dolphin;
import org.lessons.java.farm.animals.species.Eagle;
import org.lessons.java.farm.animals.species.Sparrow;
import org.lessons.java.farm.methods.UsefulMethods;

public class MainFarm {
    public static void main(String[] args) {
        // the animals
        Eagle terry = new Eagle("Terry");
        Dog jackye = new Dog("Jackye");
        Sparrow philly = new Sparrow("Philly");
        Dolphin mariello = new Dolphin("Mariello");

        Animal[] listOfAnimals = {terry, jackye, philly, mariello};


        for (Animal animal : listOfAnimals) {
            System.out.println("**********************");
            System.out.println(animal.getName());
            animal.sleeping();
            animal.animalSound();
            animal.eating();
            if (animal instanceof CanFly flying) {
                UsefulMethods.makeItFly(flying);
            } else if (animal instanceof  CanSwim swimmer) {
                UsefulMethods.makeItSwim(swimmer);
            }
        }
    }

}
