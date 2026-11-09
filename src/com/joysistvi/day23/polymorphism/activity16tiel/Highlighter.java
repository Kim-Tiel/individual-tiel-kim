package com.joysistvi.day23.polymorphism.activity16tiel;

// Child / Subclass
public class Highlighter extends Pen {

    private String inkType;

    public Highlighter(String brand, String color, double weightInGrams, String inkType) {
        super(brand, color, weightInGrams);
        this.inkType = inkType;
    }

    public String getInkType() {
        return inkType;
    }

    public void setInkType(String inkType) {
        this.inkType = inkType;
    }

    @Override
    public void write() {
        System.out.println("Highlighting important notes with a highlighter.");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the highlighter ink.");
    }

    @Override
    public String toString() {
        return "Type: Highlighter\n"
                + super.toString() + "\n"
                + "Ink Type: " + inkType;
    }
}