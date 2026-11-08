package com.joysistvi.day22.inheritance;

// Child / Sub Class
public class Cat extends Animal{

    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    // a method that only Cat has
    public void scratch() {
        System.out.println(getName() + " is scratching the sofa.");
    }

    @Override
    public String toString() {
        return "Type: Cat\n"
                + super.toString() + "\n"
                + "Fur Color: " + furColor;
    }
}
