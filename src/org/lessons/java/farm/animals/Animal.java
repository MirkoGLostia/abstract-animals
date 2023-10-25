package org.lessons.java.farm.animals;

public abstract class Animal {
    // attributes
    protected String name;




    // constructor
    public Animal(String name) {
        this.name = name;
    }





    // getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    // methods
    public void sleeping(){
        System.out.println("Zzzzzzzzzzzz");
    }

    public abstract void eating();

    public abstract void animalSound();


}
