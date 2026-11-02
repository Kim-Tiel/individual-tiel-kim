package com.joysistvi.day15.oopintro.ecom;

public class Product {
    // fields / attributes
    String name;
    double price;
    int stock;

    // methods
    void restock(int quantity) {
        stock = stock + quantity;
        System.out.printf("Restocked %d %s. New stock: %d%n", quantity, name, stock);
    }

    void displayInfo() {
        System.out.printf("Product Name: %s%nPrice: %.2f%nStock: %d%n", name, price, stock);
    }

    void updatePrice(double newPrice) {
        System.out.printf("%s price updated from %.2f to %.2f%n", name, price, newPrice);
        price = newPrice;
    }

    void checkStock() {
        if(stock == 0){
            System.out.printf("%s is out of stock.%n", name);
        } else if (stock <= 5) {
            System.out.printf("%s is low on stock. Only %d left.%n", name, stock);
        }else {
            System.out.printf("%s is in stock. Available: %d%n", name, stock);
        }
    }
}