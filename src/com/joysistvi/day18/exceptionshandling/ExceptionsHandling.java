package com.joysistvi.day18.exceptionshandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionsHandling {

    static class Gadget {
        public Object copy() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    static int countUp(int n) {
        return countUp(n + 1);
    }

    public static void main(String[] args) {

        System.out.println("===== UNCHECKED EXCEPTIONS =====");

        // 1. NumberFormatException
        try {
            int age = Integer.parseInt("12abc");
            System.out.println(age);
        } catch (NumberFormatException e) {
            System.out.println("1. NumberFormatException: " + e.getMessage());
        }

        // 2. ArithmeticException
        try {
            int share = 25 / 0;
            System.out.println(share);
        } catch (ArithmeticException e) {
            System.out.println("2. ArithmeticException: " + e.getMessage());
        }

        // 3. ArrayIndexOutOfBoundsException
        try {
            int[] scores = {88, 74, 91};
            System.out.println(scores[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("3. ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // 4. StringIndexOutOfBoundsException
        try {
            String school = "Joysis";
            System.out.println(school.charAt(9));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("4. StringIndexOutOfBoundsException: " + e.getMessage());
        }

        // 5. NullPointerException
        try {
            String nickname = null;
            System.out.println(nickname.length());
        } catch (NullPointerException e) {
            System.out.println("5. NullPointerException: nickname is null");
        }

        // 6. InputMismatchException
        try {
            Scanner fakeInput = new Scanner("kalamansi");
            int quantity = fakeInput.nextInt();
            System.out.println(quantity);
        } catch (InputMismatchException e) {
            System.out.println("6. InputMismatchException: expected a number");
        }

        // 7. NoSuchElementException
        try {
            Scanner emptyInput = new Scanner("");
            String line = emptyInput.nextLine();
            System.out.println(line);
        } catch (NoSuchElementException e) {
            System.out.println("7. NoSuchElementException: " + e.getMessage());
        }

        // 8. IllegalArgumentException
        try {
            List<String> fruits = new ArrayList<>(-4);
            System.out.println(fruits);
        } catch (IllegalArgumentException e) {
            System.out.println("8. IllegalArgumentException: " + e.getMessage());
        }

        // 9. IllegalStateException
        try {
            Scanner closedInput = new Scanner("63");
            closedInput.close();
            System.out.println(closedInput.nextInt());
        } catch (IllegalStateException e) {
            System.out.println("9. IllegalStateException: " + e.getMessage());
        }

        // 10. ClassCastException
        try {
            Object box = 42;
            String label = (String) box;
            System.out.println(label);
        } catch (ClassCastException e) {
            System.out.println("10. ClassCastException: Integer cannot become String");
        }

        // 11. NegativeArraySizeException
        try {
            int[] slots = new int[-7];
            System.out.println(slots.length);
        } catch (NegativeArraySizeException e) {
            System.out.println("11. NegativeArraySizeException: " + e.getMessage());
        }

        // 12. UnsupportedOperationException
        try {
            List<String> snacks = Arrays.asList("turon", "banana cue");
            snacks.add("kwek-kwek");
        } catch (UnsupportedOperationException e) {
            System.out.println("12. UnsupportedOperationException: fixed-size list");
        }

        // 13. ConcurrentModificationException
        try {
            List<String> colors = new ArrayList<>();
            colors.add("teal");
            colors.add("maroon");
            colors.add("ochre");
            for (String color : colors) {
                colors.remove(color);
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("13. ConcurrentModificationException: list changed inside loop");
        }

        System.out.println();
        System.out.println("===== CHECKED EXCEPTIONS =====");

        // 14. FileNotFoundException
        try {
            FileReader reader = new FileReader("wala_ito_8813.txt");
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("14. FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

        // 15. IOException
        try {
            BufferedReader reader = new BufferedReader(new StringReader("sample text"));
            reader.close();
            reader.readLine();
        } catch (IOException e) {
            System.out.println("15. IOException: " + e.getMessage());
        }

        // 16. InterruptedException
        try {
            Thread.currentThread().interrupt();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("16. InterruptedException: " + e.getMessage());
        }

        // 17. ClassNotFoundException
        try {
            Class.forName("com.joysistvi.WalangGanitongClass");
        } catch (ClassNotFoundException e) {
            System.out.println("17. ClassNotFoundException: " + e.getMessage());
        }

        // 18. SQLException
        try {
            DriverManager.getConnection("jdbc:sampledb://localhost/tesda");
        } catch (SQLException e) {
            System.out.println("18. SQLException: " + e.getMessage());
        }

        // 19. ParseException
        try {
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
            format.parse("ika-tatlo ng Marso");
        } catch (ParseException e) {
            System.out.println("19. ParseException: " + e.getMessage());
        }

        // 20. CloneNotSupportedException
        try {
            Gadget phone = new Gadget();
            phone.copy();
        } catch (CloneNotSupportedException e) {
            System.out.println("20. CloneNotSupportedException: " + e.getMessage());
        }

        System.out.println();
        System.out.println("===== ERRORS (demo only) =====");

        // 21. StackOverflowError
        try {
            countUp(1);
        } catch (StackOverflowError e) {
            System.out.println("21. StackOverflowError: recursion never stopped");
        }

        // 22. OutOfMemoryError
        try {
            long[] huge = new long[Integer.MAX_VALUE];
            System.out.println(huge.length);
        } catch (OutOfMemoryError e) {
            System.out.println("22. OutOfMemoryError: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Program finished without crashing!");
    }
}