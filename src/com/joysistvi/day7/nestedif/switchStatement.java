package com.joysistvi.day7.nestedif;
import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size code (XS, S, M, L, XL): ");
        String sizeCode = input.next().toUpperCase();

        System.out.print("Enter day number (1-7): ");
        int day = input.nextInt();

        String sizeDescription = "";

        // Old Way
        switch (sizeCode) {
            case "XS":
                sizeDescription = "Extra Small";
                break;
            case "S":
                sizeDescription = "Small";
                break;
            case "M":
                sizeDescription = "Medium";
                break;
            case "L":
                sizeDescription = "Large";
                break;
            case "XL":
                sizeDescription = "Extra Large";
                break;
            default:
                sizeDescription = "Invalid Input";
                break;
        }

        // new way
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

        System.out.println(sizeDescription);
        System.out.println(dayName);

        input.close();
    }
}