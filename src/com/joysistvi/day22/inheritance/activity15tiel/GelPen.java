package com.joysistvi.day22.inheritance.activity15tiel;

// Grandchild: Pen -> Ballpen -> GelPen (Multilevel Inheritance)
public class GelPen extends Ballpen {
    private boolean waterproof;

    public GelPen(String brand, String color, double weightInGrams, double pointSize, boolean waterproof) {
        super(brand, color, weightInGrams, pointSize);
        this.waterproof = waterproof;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    @Override
    public void write(){
        System.out.println("Writing neatly with a gel pen.");
    }

    @Override
    public String toString(){
        return "Type: Gel Pen \n"
                + "Brand: " + getBrand() + "\n"
                + "Color: " + getColor() + "\n"
                + "Weight in Grams: " + getWeightInGrams() + "\n"
                + "Point Size: " + getPointSize() + "\n"
                + "Is Waterproof: " + (waterproof ? "Yes" : "No");
    }
}
