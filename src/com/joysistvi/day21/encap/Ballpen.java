package com.joysistvi.day21.encap;

public class Ballpen {

    // data hiding -> making all the data members private
    private String brand;
    private String color;
    private double pointSize;
    private double weightInGrams;

    public Ballpen(String brand, String color, double pointSize, double weightInGrams) {
        this.brand = brand;
        this.color = color;
        this.pointSize = pointSize;
        this.weightInGrams = weightInGrams;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPointSize() {
        return pointSize;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    @Override
    public String toString(){
        return "Brand: " + brand + "\n" +
            "Color: " + color + "\n" +
            "Point Size: " + pointSize + "\n" +
            "Weight in Grams: " + weightInGrams + "\n";
    }


}
