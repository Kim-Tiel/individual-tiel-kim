package com.joysistvi.day9.looping.activity;

public class Activity6_Tiel_Part2 {
    public static void main(String[] args){

        // Outer loop: table number from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication Table of " + i);

            // Inner loop: multiplier from 1 to 10
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.println(i + " x " + multiplier + " = " + (i * multiplier));
            }
            System.out.println(); // blank line between tables
        }

    }
}
