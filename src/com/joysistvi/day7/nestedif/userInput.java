package com.joysistvi.day7.nestedif;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int day = input.nextInt();

        String dayName = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(dayName);
        input.close();
    }
}
