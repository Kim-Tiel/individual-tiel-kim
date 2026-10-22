package com.joysistvi.day6.operator;

public class Activity3_Tiel {
    public static void main(String[] args){

        // Task 2: Logical AND (&&) - Event Entry Check
        int age = 20;
        boolean hasValidId = true;

        boolean isAllowedToEnter = age >= 18 && hasValidId;

        System.out.println("--- Task 2: Event Entry Check ---");
        System.out.println("Allowed to enter the event: " + (isAllowedToEnter ? "Yes" : "No"));
        System.out.println();

        // Task 3: Logical OR (||) - Class Status Check
        boolean isWeekend = true;
        boolean isHoliday = false;

        boolean noClasses = isWeekend || isHoliday;

        System.out.println("--- Task 3: Class Status Check ---");
        System.out.println("Are there no classes today? " + (noClasses ? "Yes, no classes." : "No, there are classes."));
        System.out.println();

        // Task 4: Ternary operator (? :) - Pass or Fail Check
        int score = 85;

        String result = score >= 75 ? "Passed" : "Failed";

        System.out.println("--- Task 4: Pass or Fail Check ---");
        System.out.println("Score: " + score);
        System.out.println("Result: " + result);
        System.out.println();

        // Task 5: Ternary operator (? :) - Larger Number Check
        int num = 10;
        int num2 = 25;

        int largerNumber = num > num2 ? num : num2;

        System.out.println("--- Task 5: Larger Number Check ---");
        System.out.println("Number 1: " + num + ", Number 2: " + num2);
        System.out.println("The larger number is: " + largerNumber);
    }
}