package com.joysistvi.day24.abstraction.abstractclass;

// Don't Repeat Yourself Principle
public  class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // method overriding: Dog has its own version of makeSound()
    // implementing the abstract methods for Animal
     @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof! Woof!");
    }

    // a method that only Dog has
    public void fetch() {
        System.out.println(getName() + " is fetching the ball.");
    }

    @Override
    public String toString() {
        return "Type: Dog\n"
                + super.toString() + "\n"
                + "Breed: " + breed;
    }
}

//
