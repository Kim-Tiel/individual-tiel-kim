package com.joysistvi.day6.ifstatement;

public class Activity4_Tiel {
    public static void main(String[] args){

        int age = 25;

        // Validate the age before processing
        if (age < 0 || age > 100) {
            System.out.println("Invalid Age");
            return; // early exit: terminate the program
        }

        String category;
        // Categorize the age using an if-else ladder
        if (age <= 2) {              // 0 - 2
            category = "Baby";
        } else if (age <= 12) {      // 3 - 12
            category = "Child";
        } else if (age <= 19) {      // 13 - 19
            category = "Teenager";
        } else if (age <= 29) {      // 20 - 29
            category = "Young Adult";
        } else if (age <= 59) {      // 30 - 59
            category = "Adult";
        } else {                     // 60 - 100
            category = "Senior";
        }

        // Display output
        System.out.println("Age: " + age);
        System.out.println("Category: " + category);
    }
}
