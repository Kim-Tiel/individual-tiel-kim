package com.joysistvi.day22.inheritance.activity15tiel;

public class Highlighter extends Pen {

    private String inkType;

    public Highlighter(String brand, String color, double weightInGrams, String intType) {
        super(brand, color, weightInGrams);
        this.inkType = intType;
    }

    public String getIntType() {
        return inkType;
    }

    public void setIntType(String intType) {
        this.inkType = intType;
    }

    @Override
    public void write(){
        System.out.println("Highlighting important notes with a highlighter.");
    }

    @Override
    public String toString() {
        return "Type: Marker \n"
                + super.toString() + "\n"
                + "Ink Type: " + inkType;
    }
}
