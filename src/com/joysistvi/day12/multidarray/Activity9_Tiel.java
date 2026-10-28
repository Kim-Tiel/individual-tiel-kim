package com.joysistvi.day12.multidarray;

import java.util.Scanner;

public class Activity9_Tiel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("        Average Calculator");
        System.out.println("==================================");

        // Ask for the number of students (must be a whole number greater than 0)
        int studentCount = 0;
        while (studentCount <= 0) {
            System.out.print("Enter number of students: ");
            if (input.hasNextInt()) {
                studentCount = input.nextInt();
                if (studentCount <= 0) {
                    System.out.println("Invalid. Number of students must be greater than 0.");
                }
            } else {
                System.out.println("Invalid. Please enter a whole number.");
            }
            input.nextLine(); // discard the rest of the line
        }

        // Ask for the number of subjects (must be a whole number greater than 0)
        int subjectCount = 0;
        while (subjectCount <= 0) {
            System.out.print("Enter number of subjects: ");
            if (input.hasNextInt()) {
                subjectCount = input.nextInt();
                if (subjectCount <= 0) {
                    System.out.println("Invalid. Number of subjects must be greater than 0.");
                }
            } else {
                System.out.println("Invalid. Please enter a whole number.");
            }
            input.nextLine(); // discard the rest of the line
        }

        String[] subjects = new String[subjectCount];
        String[] students = new String[studentCount];
        int[][] grades = new int[studentCount][subjectCount];
        double[] averages = new double[studentCount];

        // Ask for the name of each subject (must not be empty)
        System.out.println("\nEnter subject names: ");
        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = input.nextLine().trim();

            while (subjects[i].isEmpty()) {
                System.out.println("Invalid. Subject name must not be empty.");
                System.out.print("Subject " + (i + 1) + ": ");
                subjects[i] = input.nextLine().trim();
            }
        }

        // Ask for each student's name and grades
        for (int i = 0; i < studentCount; i++) {
            System.out.println();
            System.out.print("Name of Student " + (i + 1) + ": ");
            students[i] = input.nextLine();

            System.out.println("Enter grades for each subject:");
            int total = 0;
            for (int j = 0; j < subjectCount; j++) {
                System.out.print(subjects[j] + ": ");

                // Validation: ask again if the grade is not a whole number
                while (!input.hasNextInt()) {
                    System.out.println("Invalid grade. Please enter a whole number.");
                    input.nextLine(); // discard the invalid input
                    System.out.print(subjects[j] + ": ");
                }

                grades[i][j] = input.nextInt();
                input.nextLine(); // consume the leftover newline
                total += grades[i][j];
            }

            // Compute the average grade of the student
            averages[i] = (double) total / subjectCount;
        }

        // Display the Grades Report
        System.out.println("\n\n==================================");
        System.out.println("        Grades Report");
        System.out.println("==================================");

        // Header row
        System.out.printf("%-20s", "Student");
        for (int j = 0; j < subjectCount; j++) {
            System.out.printf("%-20s", subjects[j]);
        }
        System.out.println("Average");

        // Divider line
        System.out.print("--------------------");
        for (int j = 0; j < subjectCount; j++) {
            System.out.print("--------------------");
        }
        System.out.println("------------");

        // One row per student
        for (int i = 0; i < studentCount; i++) {
            System.out.printf("%-20s", students[i]);
            for (int j = 0; j < subjectCount; j++) {
                System.out.printf("%-20d", grades[i][j]);
            }
            System.out.printf("%.2f%n", averages[i]);
        }

        input.close();
    }
}
