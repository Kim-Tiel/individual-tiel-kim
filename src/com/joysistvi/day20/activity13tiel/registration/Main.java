package com.joysistvi.day20.activity13tiel.registration;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserAccount account = new UserAccount();

        System.out.println("***********************************");
        System.out.println("*     User Account Registration   *");
        System.out.println("***********************************");
        System.out.println();

        while (true) {
            try {
                account.setFirstName(readLine("Enter First Name: "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[Error] " + e.getMessage());
            }
        }

        account.setMiddleName(readLine("Enter Middle Name: "));

        while (true) {
            try {
                account.setLastName(readLine("Enter Last Name: "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[Error] " + e.getMessage());
            }
        }

        while (true) {
            try {
                account.setAddress(readLine("Enter Address: "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[Error] " + e.getMessage());
            }
        }

        while (true) {
            try {
                account.setEmail(readLine("Enter Email: "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[Error] " + e.getMessage());
            }
        }

        while (true) {
            try {
                account.setPassword(readLine("Enter Password: "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[Error] " + e.getMessage());
            }
        }

        System.out.println();
        System.out.println("--- User Account Created ---");
        System.out.println("Full Name: " + account.getFullName());
        System.out.println("Address: " + account.getAddress());
        System.out.println("Email: " + account.getEmail());

        scanner.close();
    }

    // Prints the prompt and reads one line
    public static String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}