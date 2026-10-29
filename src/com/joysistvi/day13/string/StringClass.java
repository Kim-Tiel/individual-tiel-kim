package com.joysistvi.day13.string;
import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) {
//        System.out.println("Are you sure that you want to exit the program?");
//        System.out.println("[Y] Yes - Exit Program");
//        System.out.println("[N] No - Return to Main Menu");
//
//        System.out.println("\n Enter your choice: ");
//        String choice = String.valueOf(scanner.nextLine().charAt(0));
//
//        if(choice.equalsIgnoreCase("Y")){
//            System.out.println("Exiting....");
//        }else{
//            System.out.println("Main Menu");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Login ***");

        String correctUsername = "admin";
        String correctPassword = "admin123";

        int max_attempts = 5;
        boolean isLoggedIn = false;

        for (int attempt = 1; attempt <= max_attempts; attempt++) {

            System.out.print("Enter Username: ");
            String username = scanner.nextLine();
            if (username.isEmpty()) { // Validate username
                System.out.println("Username cannot be empty.");
                System.out.println("Attempts left: " + (max_attempts - attempt) + "\n");
                continue;
            }

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();
            if(password.isEmpty()){ // Validate password
                System.out.println("Password cannot be empty.");
                System.out.println("Attempts left: " + (max_attempts - attempt) + "\n");
                continue;
            }

            // Authentication
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login Successfully!");
                System.out.println("Welcome, " + username + "!");
                isLoggedIn = true;
                break;
            } else {
                System.out.println("Invalid Username or Password.");
                System.out.println("Access Denied.");
                System.out.println("Attempts left: " + (max_attempts - attempt) + "\n");
            }
        }

        // 5 retries
        if (!isLoggedIn) {
            System.out.println("Too many failed attempts. Account locked.");
        }

        scanner.close();
    }
}
