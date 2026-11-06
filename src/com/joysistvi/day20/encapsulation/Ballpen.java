package com.joysistvi.day20.encapsulation;

public class Ballpen {

    // data hiding -> making all the data members private
    private String brand;
    private String color;
    private double pointSize;
    private double weightInGrams;

    // setter method for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPointSize(double pointSize) {
        this.pointSize = pointSize;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public String getBrand(){
        return brand;
    }

    public String getColor(){
        return color;
    }

    public double getPointSize(){
        return pointSize;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }
}
