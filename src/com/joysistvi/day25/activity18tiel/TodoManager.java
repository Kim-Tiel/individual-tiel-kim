package com.joysistvi.day25.activity18tiel;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoManager {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = getInput("Enter your choice: ");

            switch (choice) {
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> updateTask();
                case 4 -> removeTask();
                case 5 -> clearTasks();
                case 0 -> System.out.println("Exiting TodoManager. Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    public static int getInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a number.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("\n--- Todo Manager Menu ---");
        System.out.println("1. Add a task");
        System.out.println("2. View all tasks");
        System.out.println("3. Update a task");
        System.out.println("4. Remove a task");
        System.out.println("5. Clear all tasks");
        System.out.println("0. Exit");
    }

    public static void addTask() {
        String task;

        do {
            System.out.print("Enter a task: ");
            task = scanner.nextLine().trim();

            if (task.isEmpty()) {
                System.out.println("Task cannot be empty.");
            }
        } while (task.isEmpty());

        tasks.add(task);
        System.out.println("Task added.");
    }

    public static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
            return;
        }

        System.out.println("Your tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void updateTask() {
        int number = getInput("Enter the task number to update: ");

        if (number < 1 || number > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        System.out.print("Enter the new task: ");
        String newTask = scanner.nextLine().trim();
        tasks.set(number - 1, newTask);
        System.out.println("Task updated.");
    }

    public static void removeTask() {
        int number = getInput("Enter the task number to remove: ");

        if (number < 1 || number > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        String removed = tasks.remove(number - 1);
        System.out.println("Removed: " + removed);
    }

    public static void clearTasks() {
        tasks.clear();
        System.out.println("All tasks cleared.");
    }
}
