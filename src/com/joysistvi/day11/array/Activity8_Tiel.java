package com.joysistvi.day11.array;

import java.util.Scanner;

public class Activity8_Tiel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare a single-dimensional array of 5 integers
        int[] numbers = new int[5];

        // Ask the user to input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");

            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a whole number.");
                input.next();   // discards the invalid input
                System.out.print("Number " + (i + 1) + ": ");
            }
            numbers[i] = input.nextInt();
        }

        // Display all the numbers entered
        System.out.println("\nYou entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + (i + 1) + ": " + numbers[i]);
        }

        // Compute the sum, highest and lowest number
        int sum = 0;
        int highest = numbers[0];
        int lowest = numbers[0];

        for (int number : numbers) {
            sum += number;

            if (number > highest) {
                highest = number;
            }
            if (number < lowest) {
                lowest = number;
            }
        }

        // Compute the average
        double average = (double) sum / numbers.length;

        // Display the results
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);

        // Stretch Goal: highest and lowest number
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);

        input.close();
    }
}