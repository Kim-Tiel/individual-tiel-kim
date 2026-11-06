package com.joysistvi.day21.encap.activity14tiel.register;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("***********************************");
        System.out.println("*     User Account Registration   *");
        System.out.println("***********************************");
        System.out.println("Please enter the details below:\n");

        UserAccount account;

        while (true) {
            String firstName = readLine("Enter first name: ");
            String middleName = readLine("Enter middle name: ");
            String lastName = readLine("Enter last name: ");
            String address = readLine("Enter address: ");
            String email = readLine("Enter email: ");
            String password = readLine("Enter password: ");

            account = new UserAccount(firstName, middleName, lastName, address, email, password);

            if (account.isValid()) {
                break;
            }

            System.out.println("Please fix the errors above and try again.");
            System.out.println();
        }

        System.out.println();
        System.out.println("=== Account Details ===");
        System.out.println(account);
    }

    // Prints the prompt and reads one line
    public static String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}