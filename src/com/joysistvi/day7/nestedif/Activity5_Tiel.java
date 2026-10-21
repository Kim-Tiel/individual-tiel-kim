package com.joysistvi.day7.nestedif;

import java.util.Scanner;

public class Activity5_Tiel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Dial the USSD code (ask again, up to 3 attempts only)
        int MAX_ATTEMPTS = 3;
        int attempts = 1;

        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String ussdCode = input.next();

        while (!ussdCode.equals("*143#")) {
            if (attempts == MAX_ATTEMPTS) {
                System.out.println("Too many invalid attempts. Please try again later.");
                input.close();
                return; // early exit
            }

            System.out.println("Invalid USSD code. Please try again.");
            System.out.print("Enter USSD Code: ");
            ussdCode = input.next();
            attempts++;
        }

        // Step 2: Main menu - Load Registration
        System.out.println("\n* Load Registration *\n"
                + "[1] Go+\n"
                + "[2] Go\n"
                + "[3] GoEXTRA\n"
                + "[4] UNLI 5G\n"
                + "[5] ALLNET");
        System.out.print("Enter a choice: ");
        int mainChoice = input.nextInt();

        String category;
        String promo1;
        String promo2;
        String promo3;
        String details1;
        String details2;
        String details3;

        switch (mainChoice) {
            case 1:
                category = "Go+";
                promo1 = "Go+99";
                details1 = "Get 8 GB for all sites + 8GB";
                promo2 = "Go+129";
                details2 = "Get 12 GB for all sites + 12GB";
                promo3 = "Go+149";
                details3 = "Get 16 GB for all sites + 16GB";
                break;
            case 2:
                category = "Go";
                promo1 = "Go50";
                details1 = "Get 5 GB for all sites";
                promo2 = "Go90";
                details2 = "Get 10 GB for all sites";
                promo3 = "Go120";
                details3 = "Get 15 GB for all sites";
                break;
            case 3:
                category = "GoEXTRA";
                promo1 = "GoEXTRA99";
                details1 = "Get 8 GB for all sites + Unli Allnet Texts";
                promo2 = "GoEXTRA129";
                details2 = "Get 12 GB for all sites + Unli Allnet Texts";
                promo3 = "GoEXTRA149";
                details3 = "Get 16 GB for all sites + Unli Allnet Texts";
                break;
            case 4:
                category = "UNLI 5G";
                promo1 = "UNLI 5G 99";
                details1 = "Get Unli 5G data for 3 days";
                promo2 = "UNLI 5G 149";
                details2 = "Get Unli 5G data for 5 days";
                promo3 = "UNLI 5G 199";
                details3 = "Get Unli 5G data for 7 days";
                break;
            case 5:
                category = "ALLNET";
                promo1 = "ALLNET99";
                details1 = "Get Unli Allnet Calls and Texts for 7 days";
                promo2 = "ALLNET149";
                details2 = "Get Unli Allnet Calls and Texts for 15 days";
                promo3 = "ALLNET199";
                details3 = "Get Unli Allnet Calls and Texts for 30 days";
                break;
            default:
                System.out.println("Invalid choice.");
                input.close();
                return; // early exit
        }

        // Step 3: Promo menu of the chosen category
        System.out.printf("%n*** %s Promos ***%n"
                + "[1] %s%n"
                + "[2] %s%n"
                + "[3] %s%n", category, promo1, promo2, promo3);
        System.out.print("Enter a choice: ");
        int promoChoice = input.nextInt();

        // Step 4: Promo details of the chosen promo
        String promo;
        String details;

        switch (promoChoice) {
            case 1:
                promo = promo1;
                details = details1;
                break;
            case 2:
                promo = promo2;
                details = details2;
                break;
            case 3:
                promo = promo3;
                details = details3;
                break;
            default:
                System.out.println("Invalid choice.");
                input.close();
                return; // early exit
        }

        System.out.printf("%n*** %s Promo ***%n"
                + "-> %s%n"
                + "[1] Subscribe%n"
                + "[2] Exit%n", promo, details);
        System.out.print("Enter a choice: ");
        int actionChoice = input.nextInt();

        if (actionChoice == 1) {
            System.out.printf("%nYou are now subscribed to %s%n", promo);
        } else if (actionChoice != 2) {
            System.out.println("Invalid choice.");
        }
        // 2 = Exit: the program ends

        input.close();
    }
}