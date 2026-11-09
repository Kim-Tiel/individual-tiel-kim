package com.joysistvi.day23.polymorphism.activity16tiel;

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen("Panda", "Blue", 15);
        Pen pen2 = new Ballpen("Pilot", "Black", 20, 1);
        Pen pen3 = new Highlighter("Stabilo", "Yellow", 12, "Neon");

        System.out.println("=== Calling methods on Pen references ===");
        System.out.println("--- Pen ---");
        pen1.write();
        pen1.refill();

        System.out.println("\n--- Ballpen ---");
        pen2.write();
        pen2.refill();

        System.out.println("\n--- Highlighter ---");
        pen3.write();
        pen3.refill();

        System.out.println("\n=== testPen() ===");
        testPen(pen1);
        testPen(pen2);
        testPen(pen3);

        System.out.println("=== Overloading ===");
        pen3.write("Java");
        pen3.write("Java", 3);

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
        pen.refill();
        System.out.println();
    }

    /*
     * Method overloading: same method name in the same class but different parameters, like write(), write(String), and write(String, int).
     * Method overriding: a child class replaces a parent method with the same name and parameters, like refill() in Ballpen.
     */
}
