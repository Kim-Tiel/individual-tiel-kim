package com.joysistvi.day15.oopintro;

public class Laptop {
    // fields /attributes
    String brand;
    String color;
    double weightInKg;
    String cpu;
    int ram;

    // purpose / methods
    void sendMessage(){
        System.out.println(brand + " is sending the message...");
    }
    void createDocuments(){
        System.out.println(brand + " is creating document...");
    }
    void transferFiles(){
        System.out.println(brand + " is transfering files...");
    }
    void browseInternet() {
        System.out.println(brand + " is browsing the internet...");
    }
}
