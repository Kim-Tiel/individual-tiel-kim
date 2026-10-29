package com.joysistvi.day14.math;

public class Activity11_Tiel {
    public static void main(String[] args) {

        // 1. Math.abs() - returns the absolute value (always positive)
        System.out.println("1. Math.abs()");

        // Example 1: temperature in Celsius below zero
        double temperature = -273.15;
        System.out.println(Math.abs(temperature));

        // Example 2: difference between two scores, no matter which is bigger
        int scoreA = 58;
        int scoreB = 91;
        System.out.println(Math.abs(scoreA - scoreB));

        // 2. Math.max() - returns the bigger of two values
        System.out.println("\n2. Math.max()");

        // Example 1: higher of two quiz scores
        System.out.println(Math.max(73, 86));

        // Example 2: higher of two prices
        System.out.println(Math.max(1249.75, 1199.50));

        // 3. Math.min() - returns the smaller of two values
        System.out.println("\n3. Math.min()");

        // Example 1: lower of two quiz scores
        System.out.println(Math.min(73, 86));

        // Example 2: lower of two negative numbers
        System.out.println(Math.min(-17, -42));

        // 4. Math.pow() - returns the first value raised to the power of the second
        System.out.println("\n4. Math.pow()");

        // Example 1: 7 raised to the 3rd power
        System.out.println(Math.pow(7, 3));

        // Example 2: area of a square with side 6.5
        double side = 6.5;
        System.out.println(Math.pow(side, 2));

        // 5. Math.sqrt() - returns the square root
        System.out.println("\n5. Math.sqrt()");

        // Example 1: square root of a perfect square
        System.out.println(Math.sqrt(2209));

        // Example 2: hypotenuse of a right triangle with sides 20 and 21
        double sideA = 20;
        double sideB = 21;
        System.out.println(Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)));

        // 6. Math.round() - rounds to the nearest whole number
        System.out.println("\n6. Math.round()");

        // Example 1: round a grade average
        System.out.println(Math.round(87.49));
        System.out.println(Math.round(87.5));

        // Example 2: round a negative number
        System.out.println(Math.round(-3.7));

        // 7. Math.ceil() - always rounds up
        System.out.println("\n7. Math.ceil()");

        // Example 1: round up a decimal
        System.out.println(Math.ceil(4.01));

        // Example 2: number of jeepneys needed for 53 passengers (16 per jeepney)
        int passengers = 53;
        int seatsPerJeepney = 16;
        System.out.println(Math.ceil((double) passengers / seatsPerJeepney));

        // 8. Math.floor() - always rounds down
        System.out.println("\n8. Math.floor()");

        // Example 1: round down a decimal
        System.out.println(Math.floor(8.99));

        // Example 2: round down a negative number
        System.out.println(Math.floor(-2.3));

        // 9. Math.random() - returns a random number from 0.0 up to (but not including) 1.0
        System.out.println("\n9. Math.random()");

        // Example 1: random decimal (changes every run)
        System.out.println(Math.random());

        // Example 2: random whole number from 1 to 12 (like picking a month)
        int month = (int) (Math.random() * 12) + 1;
        System.out.println(month);

        // 10. Math.log() - returns the natural logarithm (base e)
        System.out.println("\n10. Math.log()");

        // Example 1: natural log of 12.75
        System.out.printf("%.4f%n", Math.log(12.75));

        // Example 2: natural log of 0.6
        System.out.printf("%.4f%n", Math.log(0.6));

        // 11. Math.log10() - returns the logarithm base 10
        System.out.println("\n11. Math.log10()");

        // Example 1: log base 10 of 0.001
        System.out.println(Math.log10(0.001));

        // Example 2: log base 10 of 250
        System.out.printf("%.4f%n", Math.log10(250));

        // 12. Math.exp() - returns e raised to the given power
        System.out.println("\n12. Math.exp()");

        // Example 1: e raised to 1.5
        System.out.printf("%.4f%n", Math.exp(1.5));

        // Example 2: e raised to -2
        System.out.printf("%.4f%n", Math.exp(-2));

        // 13. Math.sin() - returns the sine of an angle in radians
        System.out.println("\n13. Math.sin()");

        // Example 1: sine of 48 degrees
        System.out.printf("%.4f%n", Math.sin(Math.toRadians(48)));

        // Example 2: sine of 210 degrees
        System.out.printf("%.4f%n", Math.sin(Math.toRadians(210)));

        // 14. Math.cos() - returns the cosine of an angle in radians
        System.out.println("\n14. Math.cos()");

        // Example 1: cosine of 115 degrees
        System.out.printf("%.4f%n", Math.cos(Math.toRadians(115)));

        // Example 2: cosine of 300 degrees
        System.out.printf("%.4f%n", Math.cos(Math.toRadians(300)));

        // 15. Math.tan() - returns the tangent of an angle in radians
        System.out.println("\n15. Math.tan()");

        // Example 1: tangent of 72 degrees
        System.out.printf("%.4f%n", Math.tan(Math.toRadians(72)));

        // Example 2: tangent of 160 degrees
        System.out.printf("%.4f%n", Math.tan(Math.toRadians(160)));
    }
}
