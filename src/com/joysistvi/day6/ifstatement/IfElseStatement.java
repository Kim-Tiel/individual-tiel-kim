package com.joysistvi.day6.ifstatement;

public class IfElseStatement {

    public static void main(String[] args) {
        // Program that identifies if age is Valid or Invalid


        //String result = (age >= 18) ? "Valid Age" : "Invalid Age";
        //System.out.println(result);

        int age = 18;
        String result = "";

        if (age >= 18) {
            // Executes when age is 18 or older
            result = "Valid Age";
        } else {
            // Executes when age is 17 below
            result = "Invalid Age";
        }

        System.out.println(age + " is " + result);

    }
}
