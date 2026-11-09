package com.joysistvi.day23.polymorphism.methodoverloading;

public class Main {

    public static void main(String[] args) {
        Function function = new Function();

        function.jump();
    }
}

/*
    Takeaway: Compile-Time vs Runtime Polymorphism

    Compile-Time (Method Overloading)
    - Same Class, same method name, different parameters (type, number, or order)
    - The compiler chooses which method to call, before the program runs.
    - The choice is based on the argument you pass.
    - If the compiler cannot find a match, or cannot pick just one, you get a compile error.

    Runtime Polymorphism (Method Overriding)
    - Same method name and same parameters, in a parent and child class.
    - The JVM chooses which method to run, while the program is running.
    - The choice is based the actual object, not the variable type.
    - The compiler only checks that the variable type (Animal) has the method


    Runtime Exception vs Compile Error
 */
