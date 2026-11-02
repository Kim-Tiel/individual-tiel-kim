package com.joysistvi.day16.methods;

public class JavaMethod {

    public static void main(String[] args) {
        int year = 2027;
        if (year == 2026) {
            greet("Jareth", 26);
        } else if (year == 2027) {
            greet("JD", 27);
        }

    }

    // does not return anything
    public static void greet(String name, int age){
        //String name = "Winter";
        printMoto("Hello, my name is " + name);
        printMoto("I am " + age + " years old.");
    }

    public static void printMoto(String word){
        System.out.println(word);
    }


}

/*
    public static void main(String[] args) {
        System.out.println(sum(5, 10)); // invoke method
    }

    public static int sum(int a, int b) {
        return a + b;
    }
 */
