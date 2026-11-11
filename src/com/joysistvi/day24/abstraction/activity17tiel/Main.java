package com.joysistvi.day24.abstraction.activity17tiel;

import java.sql.Ref;

public class Main {
    public static void main(String[] args) {
//        Pen pen1 = new Pen("Panda", "Blue", 15);
        Ballpen ballpen = new Ballpen("Pilot", "Black", 20, 1);
        Highlighter highlighter = new Highlighter("Stabilo", "Yellow", 12, "Neon");

//        System.out.println("=== Calling methods on Pen references ===");
//        System.out.println("--- Pen ---");
//        pen1.write();
//        pen1.refill();

        System.out.println("\n--- Ballpen ---");
        ballpen.write();
//        ballpen.refill();

        System.out.println("\n--- Highlighter ---");
        highlighter.write();
//        highlighter.refill();

        System.out.println("\n=== testPen() ===");
//        testPen(pen1);
        testPen(ballpen);
        testPen(highlighter);

        System.out.println("=== testRefillable ===");
        testRefillable(ballpen);
        testRefillable(highlighter);

        System.out.println("=== testClickable ===");
        testClickable(ballpen);
        testRefillable(highlighter);


//        System.out.println("=== Overloading ===");
//        highlighter.write("Java");
//        highlighter.write("Java", 3);

        /*
         *  // Stretch Goal
         *  GelPen gelPen = new GelPen("Uni-ball", "Black", 15, 1, true);
         *  System.out.println("\n=== Gel Pen ===");
         *  System.out.println(gelPen);
         *  gelPen.write();
         *  System.out.println("Brand from Pen: " + gelPen.getBrand());
         *  System.out.println("Point Size of Ballpen: " + gelPen.getPointSize());
         */
    }

    // Accepts any Pen: Pen, Ballpen, or Highlighter
    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        System.out.println();
    }

    public static void testRefillable(Refillable refillable){
        refillable.refill();
        System.out.println("Maximum refills: " + Refillable.MAX_REFILLS + "\n");
    }

    public static void testClickable(Clickable clickable){
        clickable.click();
    }

    /*
     * Method overloading: same method name in the same class but different parameters, like write(), write(String), and write(String, int).
     * Method overriding: a child class replaces a parent method with the same name and parameters, like refill() in Ballpen.
     */

    /*
     * Abstract class (extends): a partial blueprint that can have fields, a constructor,
     * and both abstract and regular methods. A class can extend only ONE class.
     * Interface (implements): a contract that lists methods a class must have and can hold
     * only constants. A class can implement MANY interfaces, like Ballpen with Refillable and Clickable.
     */
}
