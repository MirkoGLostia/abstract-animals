package org.lessons.java.farm;

public abstract class Animal {
    // attributes
    protected String name;
    protected String food;




    // constructor
    public Animal(String name, String food) {
        this.name = name;
        this.food = food;
    }





    // getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }




    // methods
    public void sleeping(){
        System.out.println("Zzzzzzzzzzzz");
    }

    public void eating(){
        System.out.println("I'm eating " + this.food);
    }

    public abstract void animalSound();


}
