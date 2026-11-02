package com.joysistvi.day16.methods;

import java.util.Scanner;

public class LoadRegistrationSimulator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        dialUssdCode();

    }

    public static void dialUssdCode() {

        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String ussdCode = scanner.nextLine();

        // guard clause / early exit
        if (!ussdCode.equals("*143#")) {
            System.out.println("Invalid USSD Code!");
            return;
        }

        promptMainMenu();
    }

    public static void promptMainMenu() {
        while (true) {
            System.out.println();
            System.out.println("        * Load Registration *");
            System.out.println("    [1] Go+");
            System.out.println("    [2] Go");
            System.out.println("    [3] GoEXTRA");
            System.out.println("    [4] UNLI 5G");
            System.out.println("    [5] ALLNET");
            System.out.println("    [0] Exit");

            int mainChoice = getInput("Enter a choice: ");

            switch(mainChoice) {
                case 1 -> goPlusPromo();
                case 2 -> goPromo();
//            case 3 -> goExtraPromo();
//            case 4 -> unli5GPromo();
//            case 5 -> allNetPromo();
                case 0 -> exitMethod();
                default -> System.out.println("Invalid Input. Please try again.");
            }
        }

    }

    public static void goPlusPromo(){
        System.out.println(" \n\n\n       *** Go+ Promos ***");
        System.out.println("    [1] Go+99");
        System.out.println("    [2] Go+129");
        System.out.println("    [3] Go+149");
        System.out.println("    [4] Back");
        System.out.println("    [0] Exit");

        int goPlusChoice = getInput("Enter a choice: ");

        switch (goPlusChoice) {
            case 1 -> promoDetailsMenu("Go+", 8,8);
            case 2 -> promoDetailsMenu("Go+129",16, 16);
            case 3 -> promoDetailsMenu("Go+149",32, 32);
            case 4 -> { return; }
        }
    }

    public static void goPromo() {
        System.out.println();
        System.out.println("        *** Go Promos ***");
        System.out.println("    [1] Go50");
        System.out.println("    [2] Go90");
        System.out.println("    [3] Go120");
        System.out.println("    [0] Exit");
        System.out.print("Enter a choice: ");
        int goChoice = scanner.nextInt();

        switch (goChoice) {
            case 1 -> promoDetailsMenu("Go50", 5, 3);
            case 2 -> promoDetailsMenu("Go90", 8, 5);
            case 3 -> promoDetailsMenu("Go120", 12, 8);
            case 4 -> exitMethod();

        }
    }

    public static void promoDetailsMenu(String promoName, int gb, int freeGB) {
        System.out.println();
        System.out.println("        *** " + promoName + " Promo ***");
        System.out.println("-> Get " + gb + " GB for all sites + " + freeGB + " GB.");
        System.out.println("    [1] Subscribe");
        System.out.println("    [2] Exit");
        System.out.print("Enter a choice: ");
        int actionChoice = scanner.nextInt();
    }

    public static void exitMethod() {
        System.out.println("Are you sure that you want to exit the program?");
        System.out.println("[Y] Yes - Exit Program");
        System.out.println("[N] No - Return to Main Menu");

        System.out.println("\nEnter your choice: ");
        String choice = String.valueOf(scanner.nextLine().trim().charAt(0)) ;

        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Returning Back to Main Menu");
        }
    }

    public static int getInput(String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Invalid Input. Please enter a number");
            }
        }
    }


}
