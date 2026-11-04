package com.joysistvi.day16.methods;

import java.util.Scanner;

public class LoadRegistrationSimulator {

    static Scanner scanner = new Scanner(System.in);
    static boolean isRunning = true;
    static double loadBalance = 250.00;

    public static void main(String[] args) {
        dialUssdCode();
        scanner.close();
    }

    public static void dialUssdCode() {
        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String ussdCode = scanner.nextLine().trim();

        // guard clause / early exit
        if (!ussdCode.equals("*143#")) {
            System.out.println("Invalid USSD Code!");
            return;
        }

        promptMainMenu();
        System.out.println("Thank you for using Globe Services!");
    }

    public static void promptMainMenu() {
        while (isRunning) {
            System.out.println();
            System.out.println("        * Load Registration *");
            System.out.printf("    Load Balance: P%.2f%n", loadBalance);
            System.out.println("    [1] Go+");
            System.out.println("    [2] Go");
            System.out.println("    [3] GoEXTRA");
            System.out.println("    [4] UNLI 5G");
            System.out.println("    [5] ALLNET");
            System.out.println("    [0] Exit");

            int mainChoice = getInput("Enter a choice: ");

            switch (mainChoice) {
                case 1:
                    goPlusPromo();
                    break;
                case 2:
                    goPromo();
                    break;
                case 3:
                    goExtraPromo();
                    break;
                case 4:
                    unli5GPromo();
                    break;
                case 5:
                    allNetPromo();
                    break;
                case 0:
                    exitMethod();
                    break;
                default:
                    System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static void goPlusPromo() {
        while (true) {
            System.out.println();
            System.out.println("        *** Go+ Promos ***");
            System.out.println("    [1] Go+99");
            System.out.println("    [2] Go+129");
            System.out.println("    [3] Go+149");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int goPlusChoice = getInput("Enter a choice: ");

            switch (goPlusChoice) {
                case 1:
                    promoDetailsMenu("Go+99", "8 GB for all sites + 8 GB for your chosen app, valid for 7 days", 99);
                    return;
                case 2:
                    promoDetailsMenu("Go+129", "16 GB for all sites + 16 GB for your chosen app, valid for 7 days", 129);
                    return;
                case 3:
                    promoDetailsMenu("Go+149", "32 GB for all sites + 32 GB for your chosen app, valid for 7 days", 149);
                    return;
                case 4:
                    return;
                case 0:
                    exitMethod();
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static void goPromo() {
        while (true) {
            System.out.println();
            System.out.println("        *** Go Promos ***");
            System.out.println("    [1] Go50");
            System.out.println("    [2] Go90");
            System.out.println("    [3] Go120");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int goChoice = getInput("Enter a choice: ");

            switch (goChoice) {
                case 1:
                    promoDetailsMenu("Go50", "5 GB for all sites + 3 GB for your chosen app, valid for 3 days", 50);
                    return;
                case 2:
                    promoDetailsMenu("Go90", "8 GB for all sites + 5 GB for your chosen app, valid for 7 days", 90);
                    return;
                case 3:
                    promoDetailsMenu("Go120", "12 GB for all sites + 8 GB for your chosen app, valid for 7 days", 120);
                    return;
                case 4:
                    return;
                case 0:
                    exitMethod();
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static void goExtraPromo() {
        while (true) {
            System.out.println();
            System.out.println("        *** GoEXTRA Promos ***");
            System.out.println("    [1] GoEXTRA90");
            System.out.println("    [2] GoEXTRA129");
            System.out.println("    [3] GoEXTRA149");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int goExtraChoice = getInput("Enter a choice: ");

            switch (goExtraChoice) {
                case 1:
                    promoDetailsMenu("GoEXTRA90", "8 GB for all sites + unli texts to all networks, valid for 7 days", 90);
                    return;
                case 2:
                    promoDetailsMenu("GoEXTRA129", "12 GB for all sites + unli calls and texts to all networks, valid for 7 days", 129);
                    return;
                case 3:
                    promoDetailsMenu("GoEXTRA149", "16 GB for all sites + unli calls and texts to all networks, valid for 7 days", 149);
                    return;
                case 4:
                    return;
                case 0:
                    exitMethod();
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static void unli5GPromo() {
        while (true) {
            System.out.println();
            System.out.println("        *** UNLI 5G Promos ***");
            System.out.println("    [1] UNLI5G 149");
            System.out.println("    [2] UNLI5G 299");
            System.out.println("    [3] UNLI5G 599");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int unli5GChoice = getInput("Enter a choice: ");

            switch (unli5GChoice) {
                case 1:
                    promoDetailsMenu("UNLI5G 149", "Unlimited 5G data, valid for 3 days", 149);
                    return;
                case 2:
                    promoDetailsMenu("UNLI5G 299", "Unlimited 5G data, valid for 7 days", 299);
                    return;
                case 3:
                    promoDetailsMenu("UNLI5G 599", "Unlimited 5G data, valid for 30 days", 599);
                    return;
                case 4:
                    return;
                case 0:
                    exitMethod();
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static void allNetPromo() {
        while (true) {
            System.out.println();
            System.out.println("        *** ALLNET Promos ***");
            System.out.println("    [1] ALLNET20");
            System.out.println("    [2] ALLNET50");
            System.out.println("    [3] ALLNET99");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int allNetChoice = getInput("Enter a choice: ");

            switch (allNetChoice) {
                case 1:
                    promoDetailsMenu("ALLNET20", "Unli texts + 20 minutes of calls to all networks, valid for 1 day", 20);
                    return;
                case 2:
                    promoDetailsMenu("ALLNET50", "Unli texts + 60 minutes of calls to all networks, valid for 3 days", 50);
                    return;
                case 3:
                    promoDetailsMenu("ALLNET99", "Unli texts + 150 minutes of calls to all networks, valid for 7 days", 99);
                    return;
                case 4:
                    return;
                case 0:
                    exitMethod();
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static void promoDetailsMenu(String promoName, String description, int price) {
        while (true) {
            System.out.println();
            System.out.println("        *** " + promoName + " Promo ***");
            System.out.println("-> " + description + ".");
            System.out.println("-> Price: P" + price);
            System.out.println("    [1] Subscribe");
            System.out.println("    [2] Back to Main Menu");
            System.out.println("    [0] Exit");

            int actionChoice = getInput("Enter a choice: ");

            switch (actionChoice) {
                case 1:
                    subscribe(promoName, price);
                    return;
                case 2:
                    return;
                case 0:
                    exitMethod();
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static void subscribe(String promoName, int price) {
        System.out.println();
        if (price > loadBalance) {
            System.out.println("Sorry, you do not have enough load to register to " + promoName + ".");
            System.out.printf("Load Balance: P%.2f | Price: P%d%n", loadBalance, price);
            return;
        }

        loadBalance = loadBalance - price;
        System.out.println("You are now registered to " + promoName + "!");
        System.out.printf("Remaining Load Balance: P%.2f%n", loadBalance);
    }

    public static void exitMethod() {
        while (true) {
            System.out.println();
            System.out.println("Are you sure that you want to exit the program?");
            System.out.println("[Y] Yes - Exit Program");
            System.out.println("[N] No - Return to Main Menu");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().trim();

            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Exiting...");
                isRunning = false;
                return;
            } else if (choice.equalsIgnoreCase("N")) {
                System.out.println("Returning Back to Main Menu");
                return;
            } else {
                System.out.println("Invalid Input. Please enter Y or N.");
            }
        }
    }

    public static int getInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Invalid Input. Please enter a number.");
            }
        }
    }
}
