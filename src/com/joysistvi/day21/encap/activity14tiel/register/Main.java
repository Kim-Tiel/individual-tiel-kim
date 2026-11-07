package com.joysistvi.day21.encap.activity14tiel.register;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static boolean hasError = false;

    public static void main(String[] args) {
        System.out.println("***********************************");
        System.out.println("*     User Account Registration   *");
        System.out.println("***********************************");
        System.out.println("Please enter the details below:\n");

        String firstName = readLine("Enter first name: ");
        String middleName = readLine("Enter middle name (optional): ");
        String lastName = readLine("Enter last name: ");
        String address = readLine("Enter address: ");
        String email = readLine("Enter email: ");
        String password = readLine("Enter password: ");

        System.out.println();

        checkField(firstName, "first name");
        checkField(lastName, "last name");
        checkField(address, "address");
        checkField(email, "email");
        checkField(password, "password");

        if (hasError) {
            System.out.println("\nRegistration failed. Please fix the errors above.");
        } else {
            UserAccount account = new UserAccount(firstName, middleName, lastName, address, email, password);

            System.out.println("=== Account Details ===");
            System.out.println(account);
        }

        scanner.close();
    }

    // Checks one field and prints its error, if any
    public static void checkField(String input, String field) {
        try {
            switch (field) {
                case "first name" -> UserAccount.validateEmpty(input, "First name");
                case "last name" -> UserAccount.validateEmpty(input, "Last name");
                case "address" -> UserAccount.validateEmpty(input, "Address");
                case "email" -> UserAccount.validateEmail(input);
                case "password" -> UserAccount.validatePassword(input);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("- " + e.getMessage());
            hasError = true;
        }
    }

    // Prints the prompt and reads one line
    public static String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}