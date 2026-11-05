package com.joysistvi.day18.loadreg;

import java.util.Scanner;

public class LoadRegistrationSimulator {

    static Scanner scanner = new Scanner(System.in);

    static int balance = 500;
    static boolean hasBorrowed = false;

    public static void main(String[] args) {
        dialUssdCode();
        promptMainMenu();
    }


    // Keeps asking until the user enters *143#
    public static void dialUssdCode() {
        clearScreen();
        System.out.println("Dial *143# to access Globe Services");

        while (true) {
            String ussdCode = readLine("Enter USSD Code: ");

            if (ussdCode.equals("*143#")) {
                return;
            }

            System.out.println("Invalid USSD Code. Please try again.");
        }
    }


    public static void promptMainMenu() {
        while (true) {
            clearScreen();
            System.out.println("        * Load Registration *");
            System.out.println("    [1] Go+");
            System.out.println("    [2] Go");
            System.out.println("    [3] GoEXTRA");
            System.out.println("    [4] UNLI 5G");
            System.out.println("    [5] ALLNET");
            System.out.println("    [6] Check Balance");
            System.out.println("    [7] Borrow Load");
            System.out.println("    [0] Exit");

            int mainChoice = getInput("Enter a choice: ", 0, 7);

            switch (mainChoice) {
                case 1 -> goPlusPromo();
                case 2 -> goPromo();
                case 3 -> goExtraPromo();
                case 4 -> unli5GPromo();
                case 5 -> allNetPromo();
                case 6 -> checkBalance();
                case 7 -> borrowLoad();
                case 0 -> exitMethod();
            }
        }
    }

    public static void checkBalance() {
        clearScreen();
        System.out.println("--------------------------------");
        System.out.println("Your current balance is: P" + balance);
        System.out.println("--------------------------------");
        pressEnterToContinue();
    }

    public static void borrowLoad() {
        clearScreen();
        System.out.println("*** Borrow Load ***");
        System.out.println("   [1] Borrow P10");
        System.out.println("   [2] Back to Main Menu");

        int choice = getInput("Enter a choice: ", 1, 2);

        if (choice == 1) {
            try {
                addBorrowedLoad(10);
                System.out.println("\nSuccessfully borrowed P10! Your new balance is: P" + balance);
            } catch (IllegalStateException e) {
                System.out.println("\n[Borrow Error] " + e.getMessage());
            }
            pressEnterToContinue();
        }
    }

    public static void goPlusPromo() {
        while (true) {
            clearScreen();
            System.out.println("        *** Go+ Promos ***");
            System.out.println("    [1] Go+99");
            System.out.println("    [2] Go+129");
            System.out.println("    [3] Go+149");
            System.out.println("    [4] Go+599");
            System.out.println("    [5] Back");
            System.out.println("    [0] Exit");

            int choice = getInput("Enter a choice: ", 0, 5);

            switch (choice) {
                case 1 -> subscriptionConfirmation("Go+99", 99, 8, 8);
                case 2 -> subscriptionConfirmation("Go+129", 129, 16, 16);
                case 3 -> subscriptionConfirmation("Go+149", 149, 32, 32);
                case 4 -> subscriptionConfirmation("Go+599", 599, 200, 30);
                case 5 -> { return; }
                case 0 -> exitMethod();
            }
        }
    }

    public static void goPromo() {
        while (true) {
            clearScreen();
            System.out.println("        *** Go Promos ***");
            System.out.println("    [1] Go50");
            System.out.println("    [2] Go90");
            System.out.println("    [3] Go120");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int choice = getInput("Enter a choice: ", 0, 4);

            switch (choice) {
                case 1 -> subscriptionConfirmation("Go50", 50, 5, 3);
                case 2 -> subscriptionConfirmation("Go90", 90, 8, 5);
                case 3 -> subscriptionConfirmation("Go120", 120, 12, 8);
                case 4 -> { return; }
                case 0 -> exitMethod();
            }
        }
    }


    public static void goExtraPromo() {
        while (true) {
            clearScreen();
            System.out.println("        *** GoEXTRA Promos ***");
            System.out.println("    [1] GoEXTRA99");
            System.out.println("    [2] GoEXTRA129");
            System.out.println("    [3] GoEXTRA149");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int choice = getInput("Enter a choice: ", 0, 4);

            switch (choice) {
                case 1 -> subscriptionConfirmation("GoEXTRA99", 99, 8, 8);
                case 2 -> subscriptionConfirmation("GoEXTRA129", 129, 16, 16);
                case 3 -> subscriptionConfirmation("GoEXTRA149", 149, 32, 32);
                case 4 -> { return; }
                case 0 -> exitMethod();
            }
        }
    }


    public static void unli5GPromo() {
        while (true) {
            clearScreen();
            System.out.println("        *** UNLI 5G Promos ***");
            System.out.println("    [1] UNLI 5G 99");
            System.out.println("    [2] UNLI 5G 149");
            System.out.println("    [3] UNLI 5G 199");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int choice = getInput("Enter a choice: ", 0, 4);

            switch (choice) {
                case 1 -> subscriptionConfirmation("UNLI 5G 99", 99, 8, 8);
                case 2 -> subscriptionConfirmation("UNLI 5G 149", 149, 16, 16);
                case 3 -> subscriptionConfirmation("UNLI 5G 199", 199, 32, 32);
                case 4 -> { return; }
                case 0 -> exitMethod();
            }
        }
    }


    public static void allNetPromo() {
        while (true) {
            clearScreen();
            System.out.println("        *** ALLNET Promos ***");
            System.out.println("    [1] ALLNET99");
            System.out.println("    [2] ALLNET149");
            System.out.println("    [3] ALLNET199");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int choice = getInput("Enter a choice: ", 0, 4);

            switch (choice) {
                case 1 -> subscriptionConfirmation("ALLNET99", 99, 8, 8);
                case 2 -> subscriptionConfirmation("ALLNET149", 149, 16, 16);
                case 3 -> subscriptionConfirmation("ALLNET199", 199, 32, 32);
                case 4 -> { return; }
                case 0 -> exitMethod();
            }
        }
    }

    public static void subscriptionConfirmation(String promoName, int price, int gb, int freeGB) {
        clearScreen();
        System.out.println("        *** " + promoName + " Promo ***");
        System.out.println("-> Get " + gb + " GB for all sites + " + freeGB + " GB.");
        System.out.println("-> Confirm registration for " + promoName + " for P" + price + "?");
        System.out.println("   [1] Yes, Subscribe");
        System.out.println("   [2] Back");

        int subChoice = getInput("Enter a choice: ", 1, 2);

        if (subChoice == 1) {
            try {
                deductBalance(price);
                System.out.println("\nSUCCESS: You are now successfully subscribed to " + promoName + "!");
                System.out.println("Remaining Balance: P" + balance);
                scanner.close();
                System.exit(0);
            } catch (IllegalArgumentException e) {
                System.out.println("\n[Transaction Error] " + e.getMessage());
                pressEnterToContinue();
            }
        }
    }

    public static void exitMethod() {
        clearScreen();
        System.out.println("Are you sure that you want to exit the program?");
        System.out.println("    [Y] Yes - Exit Program");
        System.out.println("    [N] No - Go Back");

        if (getYesNo("Enter your choice: ")) {
            System.out.println("Exiting...");
            scanner.close();
            System.exit(0);
        }
    }


    // ===================== HELPER METHODS =====================
    public static void deductBalance(int price) {
        if (balance < price) {
            throw new IllegalArgumentException("Insufficient balance! You need P" + price + " but you only have P" + balance + ".");
        }

        balance -= price;
    }

    public static void addBorrowedLoad(int amount) {
        if (hasBorrowed) {
            throw new IllegalStateException("You already borrowed load. Please pay your existing loan first.");
        }

        balance += amount;
        hasBorrowed = true;
    }


    public static String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public static boolean getYesNo(String prompt) {
        while (true) {
            String choice = readLine(prompt);

            if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
                return true;
            } else if (choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("no")) {
                return false;
            }

            System.out.println("Invalid Input. Please enter Y or N.");
        }
    }


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println();
    }

    public static void pressEnterToContinue() {
        readLine("\nPress Enter to continue...");
    }

    public static int getInput(String prompt) {
        while (true) {
            String input = readLine(prompt);

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a number.");
            }
        }
    }

    public static int getInput(String prompt, int min, int max) {
        while (true) {
            int number = getInput(prompt);

            if (number >= min && number <= max) {
                return number;
            }

            System.out.println("Invalid Input. Please enter a number from " + min + " to " + max + ".");
        }
    }
}