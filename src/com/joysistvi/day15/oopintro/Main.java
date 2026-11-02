package com.joysistvi.day15.oopintro;

public class Main {
    public static void main(String[] args){
        Laptop myLaptop = new Laptop();
        myLaptop.brand = "Lenovo";
        myLaptop.color = "Gray";
        myLaptop.weightInKg = 1.45;
        myLaptop.cpu = "Intel Core i5";
        myLaptop.ram = 16;

        Laptop myLaptop2 = new Laptop();
        myLaptop2.brand = "ASUS";
        myLaptop2.color = "Black";
        myLaptop2.weightInKg = 2.30;
        myLaptop2.cpu = "AMD Ryzen 7";
        myLaptop2.ram = 32;

        Laptop myLaptop3 = new Laptop();
        myLaptop3.brand = "Acer";
        myLaptop3.color = "Silver";
        myLaptop3.weightInKg = 1.70;
        myLaptop3.cpu = "Intel Core i3";
        myLaptop3.ram = 8;

        System.out.println("Brand: " + myLaptop.brand);
        System.out.println("RAM: " + myLaptop.ram + "GB");
        myLaptop.sendMessage();
        myLaptop.createDocuments();
        myLaptop.transferFiles();
        myLaptop.browseInternet();
        System.out.println();

        System.out.println("Brand: " + myLaptop2.brand);
        System.out.println("RAM: " + myLaptop2.ram + "GB");
        myLaptop2.sendMessage();
        myLaptop2.createDocuments();
        myLaptop2.transferFiles();
        myLaptop2.browseInternet();
        System.out.println();

        System.out.println("Brand: " + myLaptop3.brand);
        System.out.println("RAM: " + myLaptop3.ram + "GB");
        myLaptop3.sendMessage();
        myLaptop3.createDocuments();
        myLaptop3.transferFiles();
        myLaptop3.browseInternet();
    }
}