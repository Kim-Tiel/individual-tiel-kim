package com.joysistvi.day4.operator;

public class Activity2_Tiel {
    public static void main(String[] args){

        // Given values
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        // Arithmetic operations: percentage of each expense
        double foodPercent = foodAllowance / income * 100;
        double transportationPercent = transportation / income * 100;
        double rentPercent = rent / income * 100;
        double utilityPercent = utilityBill / income * 100;

        // Arithmetic operations: remaining balance
        double totalExpenses = foodAllowance + transportation + rent + utilityBill;
        double remainingBalance = income - totalExpenses;

        // Display
        System.out.println("* Expense Tracker Program *");
        System.out.printf("Income: %.0f %n", income);
        System.out.printf("Food Allowance: %.1f %% %n", foodPercent);
        System.out.printf("Transportation: %.1f %% %n", transportationPercent);
        System.out.printf("Rent: %.1f %%%n", rentPercent);
        System.out.printf("Utility Bill: %.1f %% %n", utilityPercent);
        System.out.printf("Remaining Balance: %.0f %n", remainingBalance);
    }
}