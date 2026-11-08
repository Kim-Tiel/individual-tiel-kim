package com.joysistvi.day22.inheritance.activity15tiel;

public class Main {
    public static void main(String[] args) {
        Ballpen ballpen = new Ballpen("Pilot", "Black", 20, 1);
        Highlighter highlighter = new Highlighter("Stabilo", "Yellow", 12, "Neon");

        System.out.println("=== Ballpen ===");
        System.out.println(ballpen);
        ballpen.write();

        System.out.println("\n=== Highlighter ===");
        System.out.println(highlighter);
        highlighter.write();

        // Stretch Goal
        GelPen gelPen = new GelPen("Uni-ball", "Black", 15, 1, true);
        System.out.println("\n=== Gel Pen ===");
        System.out.println(gelPen);
        gelPen.write();
        System.out.println("Brand from Pen: " + gelPen.getBrand());
        System.out.println("Point Size of Ballpen: " + gelPen.getPointSize());
    }
}
