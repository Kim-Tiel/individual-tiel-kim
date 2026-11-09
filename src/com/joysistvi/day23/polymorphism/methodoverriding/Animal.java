package com.joysistvi.day23.polymorphism.methodoverriding;


// Parent / Super Class
public class Animal {

     String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public  void setAge(int age) {
        this.age = age;
    }

    public  void eat() {
        System.out.println(name + " is eating.");
    }

    public  void  makeSound() {
        System.out.println(name + " make a sound.");
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Age: " + age;
    }
}

// A child class must not be weaker than of its parent class
// access modifiers: public protected default private

// non-access modifiers: static, final, abstract