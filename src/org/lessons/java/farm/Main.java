package org.lessons.java.farm;

public class Main {
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
                makeItFly(flying);
            } else if (animal instanceof  CanSwim swimmer) {
                makeItSwim(swimmer);
            }
        }
    }

    private static void makeItFly (CanFly arg) {
        arg.fly();
    }

    private static void makeItSwim (CanSwim arg) {
        arg.swim();
    }
}
