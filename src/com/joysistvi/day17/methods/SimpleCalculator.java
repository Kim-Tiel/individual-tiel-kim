package com.joysistvi.day17.methods;
import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b){
        if (b == 0){}

        return a / b;
    }
    public static double modulo(double a, double b){
        return a % b;
    }
    public static double power(double base, double exponent){
        return Math.pow(base, exponent);
    }
    public static double calculate(double a, double b, char operator) {
        return switch (operator) {
            case '+' -> add(a, b);
            case '-' -> subtract(a, b);
            case '*' -> multiply(a, b);
            case '/' -> divide(a, b);
            case '%' -> modulo(a, b);
            case '^' -> power(a, b);
            default -> 0;
        };
    }
    public static double readNumber(Scanner scanner, String prompt){
        while(true){
            System.out.print(prompt);
            if(scanner.hasNextDouble()){
                double number = scanner.nextDouble();
                scanner.nextLine();
                return number;
            }

            scanner.nextLine();
            System.out.println("Invalid number. Please try again.");
        }
    }
    public static char readOperator(Scanner scanner){
        while(true){
            System.out.print("Enter opeartor (+, -, *, /, %, ^): ");
            String input = scanner.nextLine().trim();

            if (input.length() == 1 && "+-*/%^".indexOf(input.charAt(0)) >= 0) {
                return input.charAt(0);
            }

            System.out.println("Invalid Operator. Please try again.");
        }
    }

    public static boolean askContinue(Scanner scanner){
        System.out.print("Calculate again(Y/N): ");
        String answer = scanner.nextLine().trim().toLowerCase();
        return answer.equals("y") || answer.equals("yes");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        System.out.println("=== Simple Java Calculator ===");
        while (running) {
            double num = readNumber(scanner, "Enter first number: ");
            char operator = readOperator(scanner);
            double num2 = readNumber(scanner, "Enter second number: ");

            if ((operator == '/' || operator == '%') && num2 == 0) {
                System.out.println("Error: Cannot divide by zero.");
            } else {
                double result = calculate(num, num2, operator);
                System.out.println("Result: " + num + " " + operator + " " + num2 + " = " + result);
            }

            System.out.println();
            running = askContinue(scanner);
            System.out.println();
        }

        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}
