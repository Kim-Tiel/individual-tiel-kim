package com.joysistvi.day9.looping.activity;

import java.util.Scanner;

public class Activity6_Tiel_Part1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the multiplication table you want to display: ");
        int num = input.nextInt();

        System.out.println("\n Multiplication Table of " + num);

        // for loop: multiplier from 1 to 10
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println(num + " x " + multiplier + " = " + (num * multiplier));
        }
        input.close();
/*
        // Using While Loop Statement
        int multiplier = 1;
        while (multiplier <= 10) {
            System.out.println(num + " x " + multiplier + " = " + (num * multiplier));
            multiplier++;
        }
 */

/*
        // Using Do While Loop Statement
        int multiplier = 1;
        do {
            System.out.println(num + " x " + multiplier + " = " + (num * multiplier));
            multiplier++;
        } while (multiplier <= 10);
 */
    }
}
