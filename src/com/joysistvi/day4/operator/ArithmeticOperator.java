package com.joysistvi.day4.operator;

public class ArithmeticOperator {
    public static void main(String[] args){

        int num1 = 20;
        int num2 = 6;

        // Arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2;

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);


        // % Modulo
        double remainder = num1 % num2;
        System.out.println("Remainder: " + remainder);
    }
}