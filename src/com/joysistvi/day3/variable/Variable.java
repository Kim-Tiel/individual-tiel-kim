package com.joysistvi.day3.variable;

public class Variable {
    public static void main(String[] args) { // main method
        byte numByte = 50;
        short numShort = 500;
        int numInt = 50_000;
        long numLong = 1000000000L;
        System.out.println("Byte: " + numByte);
        System.out.println("Short: " + numShort);
        System.out.println("Int: " + numInt);
        System.out.println("Long: " + numLong);

        float average = 99.90f;
        double price = 29.10;
        System.out.println("Average: " + average);
        System.out.println("Price: " + price);

        boolean is_active = false;
        is_active = true;
        System.out.print("Boolean: " + is_active);

        char middleName = 'G';
        System.out.println("Middle Name: " + middleName);

        String firstName = "Kim Anderson", lastName = "Tiel";
        System.out.print("Full Name: " + lastName + ", " + firstName + " " + middleName + ".");
    }
}