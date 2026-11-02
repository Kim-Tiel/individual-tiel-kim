package com.joysistvi.day15.oopintro.ecom;

public class Main {
    public static void main(String[] args){

        Product product1 = new Product();
        product1.name = "Pancit Canton";
        product1.price = 17.50;
        product1.stock = 40;

        Product product2 = new Product();
        product2.name = "Kopiko Brown";
        product2.price = 9.75;
        product2.stock = 12;

        Product product3 = new Product();
        product3.name = "Chocolate";
        product3.price = 13.25;
        product3.stock = 5;

        product1.restock(5);
        product1.displayInfo();
        product1.updatePrice(18.50);
        product1.checkStock();

        Cart myCart = new Cart();
        myCart.addToCart(product1, 5);
        myCart.addToCart(product2, 5);
        myCart.addToCart(product1, 5);
        myCart.removeFromCart(product3, 4);

        myCart.showMyTotalPrice();
        myCart.displayCart();
        myCart.removeFromCart(product2, 2);
        myCart.checkout();
    }
}
