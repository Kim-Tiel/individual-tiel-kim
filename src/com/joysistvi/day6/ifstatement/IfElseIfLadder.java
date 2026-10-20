package com.joysistvi.day6.ifstatement;

public class IfElseIfLadder {

    public static void main(String[] args) {
        // This program evaluates a student's grade
        /*
            F: 1-70
            C: 71-80
            B: 81-90
            A: 91-100
         */

        int grade = 60;
        String result;

        // Nested If Statement
        // Validation

        // Early Exit
        // Terminates the method immediately if the grade is outside the valid range of 1 to 100
        if (!(grade >= 1 && grade <= 100)) {
            return; // terminate method
        }

        if (grade <= 70) { // 1 - 70
            result = "F";
        } else if (grade <= 80) { // 71 - 80
            result = "C";
        } else if (grade <= 90) {
            result = "B";
        } else if (grade <= 100){
            result = "A";
        } else {
            result = "Invalid Grade";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Classification: " + result);

    }
}

/*
    int day = -1;
        String dayName = "";

        if (day == 1) {
            // Executes when day is 1
            dayName = "Sunday";
        } else if (day == 2) {
            // Executes when day is 2
            dayName = "Monday";
        } else if (day == 3) {
            // Executes when day is 3
            dayName = "Tuesday";
        } else if (day == 4) {
            // Executes when day is 4
            dayName = "Wednesday";
        } else if (day == 5) {
            // Executes when day is 5
            dayName = "Thursday";
        } else if (day == 6) {
            // Executes when day is 6
            dayName = "Friday";
        } else if (day == 7) {
            // Executes when day is 7
            dayName = "Saturday";
        }

        System.out.println(dayName);
 */

/*
    if (grade >= 1 && grade <= 100) {

            if (grade <= 70) { // 1 - 70
                result = "F";
            } else if (grade <= 80) { // 71 - 80
                result = "C";
            } else if (grade <= 90) {
                result = "B";
            } else {
                result = "A";
            }
            System.out.println("Grade: " + grade);
            System.out.println("Classification: " + result);

        } else {
            System.out.println("Invalid Grade");
        }
 */