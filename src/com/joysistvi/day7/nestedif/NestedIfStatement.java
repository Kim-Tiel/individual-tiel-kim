package com.joysistvi.day7.nestedif;

public class NestedIfStatement {
    public static void main(String[] args){

        int age = 2;

        // Validate the age before processing
        if (age < 0 || age > 100) {
            System.out.println("Invalid Age");
            return; // early exit: terminate the program
        }

        String category;
        String subCategory = "";

        // Categorize the age using an if-else-if ladder
        if (age <= 2) {              // 0 - 2
            category = "Baby";
            if (age <= 1) {          // 0 - 1
                subCategory = "Infant";
            } else {                 // 2
                subCategory = "Toddler";
            }
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
            if (age <= 75) {         // 60 - 75
                subCategory = "Young-old Senior";
            } else {                 // 76 - 100
                subCategory = "Old Senior";
            }
        }

        // Display output
        System.out.println("Age: " + age);
        System.out.println("Category: " + category);
        System.out.println(!subCategory.isEmpty() ? "Sub Category: " + subCategory : "");
    }
}