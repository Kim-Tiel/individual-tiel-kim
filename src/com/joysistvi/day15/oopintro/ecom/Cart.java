package com.joysistvi.day15.oopintro.ecom;
import java.util.Scanner;

public class Cart {
    // fields / attributes
    String[][] myCart = new String[10][3];
    int cartCount;
    Scanner scanner = new Scanner(System.in);

    int findItem(String name){
        for (int i = 0; i < cartCount; i++){
            if (myCart[i][0].trim().equalsIgnoreCase(name.trim())){
                return i;
            }
        }
        return -1;
    }

    boolean validateStock(int quantity, int stock){
        return (quantity > stock);
    }

    void addToCart(Product product, int quantity){
        if (quantity <= 0){
            System.out.printf("Quantity must be greater than 0.%n%n");
            return;
        }

        if (validateStock(quantity, product.stock)){
            System.out.printf("Cannot add %d %s. Available: %d%n%n", quantity, product.name, product.stock);
            return;
        }

        int index = findItem(product.name);
        if (index != -1){
            int newQuantity = Integer.parseInt(myCart[index][2]) + quantity;
            if (validateStock(newQuantity, product.stock)){
                System.out.printf("Cannot add %d %s. Available: %d%n%n", quantity, product.name, product.stock);
                return;
            }
            myCart[index][2] = String.valueOf(newQuantity);
            System.out.printf("Updated %s in cart. Quantity: %d%n%n", product.name, newQuantity);
        }else{
            if (cartCount == myCart.length){
                System.out.printf("Cart is full%n%n");
                return;
            }
            myCart[cartCount][0] = product.name;
            myCart[cartCount][1] = String.valueOf(product.price);
            myCart[cartCount][2] = String.valueOf(quantity);
            cartCount++;
            System.out.printf("Added %d %s to cart.%n%n", quantity, product.name);
        }
        product.stock = product.stock - quantity;
    }

    void displayCart(){
        if (cartCount == 0){
            System.out.printf("Cart is empty.%n%n");
            return;
        }
        System.out.printf("%-15s %8s %5s %10s%n", "Item", "Price", "Qty", "Subtotal");
        for(int i = 0; i < cartCount; i++){
            double price = Double.parseDouble(myCart[i][1]);
            int quantity = Integer.parseInt(myCart[i][2]);
            System.out.printf("%-15s %8.2f %5d %10.2f%n", myCart[i][0], price, quantity, price * quantity);
        }
        System.out.printf("%-30s %10.2f%n%n", "Total", computeTotalPrice());
    }

    double computeTotalPrice(){
        double total = 0;
        for (int i = 0; i < cartCount; i++){
            double price = Double.parseDouble(myCart[i][1]);
            int quantity = Integer.parseInt(myCart[i][2]);
            total = total + (price * quantity);
        }
        return total;
    }

    void showMyTotalPrice(){
        System.out.printf("Your total price is %.2f%n%n", computeTotalPrice());
    }

    void removeFromCart(Product product, int quantity){
        int index = findItem(product.name);
        if (index == -1){
            System.out.printf("%s is not in the cart.%n%n", product.name);
            return;
        }

        int currentQuantity = Integer.parseInt(myCart[index][2]);
        if(quantity <= 0 || quantity > currentQuantity){
            System.out.printf("Cannot remove %d %s. In cart: %d%n%n", quantity, product.name, currentQuantity);
            return;
        }

        product.stock = product.stock + quantity;
        int newQuantity = currentQuantity - quantity;
        if (newQuantity > 0){
            myCart[index][2] = String.valueOf(newQuantity);
            System.out.printf("Removed %d %s. In cart: %d%n", quantity, product.name, newQuantity);
        } else {
            for (int i = index; i < cartCount; i++){
                myCart[i][0] = myCart[i + 1][0];
                myCart[i][1] = myCart[i + 1][1];
                myCart[i][2] = myCart[i + 1][2];
            }
            myCart[cartCount - 1][0] = null;
            myCart[cartCount - 1][1] = null;
            myCart[cartCount - 1][2] = null;
            cartCount--;
            System.out.printf("Removed %s from cart.%nUpdated Cart", product.name);
        }
        displayCart();
    }

    void checkout(){
        if (cartCount == 0){
            System.out.printf("Cart is empty. Nothing to checkout.%n%n");
            return;
        }

        double amountToPay = computeTotalPrice();
        System.out.printf("Your amount to pay is %.2f%n", amountToPay);
        double payment;
        System.out.print("Enter payment: ");
        if (scanner.hasNextDouble()) {
            payment = scanner.nextDouble();
            if (payment <= 0) {
                System.out.println("Invalid. Payment must be greater than 0.");
            }else if (payment < amountToPay){
                System.out.printf("You’re short by %.2f.", (amountToPay - payment));
            }else {
                System.out.println("\n===== Receipt =====");
                displayCart();
                System.out.printf("The amount you paid: %.2f%n", payment);
                System.out.printf("Your change is: %.2f%n", payment - amountToPay);
                System.out.println("Thank you for your purchase!");
                resetCart();
            }
        } else {
            System.out.println("Invalid. Please enter a number.");
        }
    }

    void resetCart(){
        for (int i = 0; i < cartCount; i++) {
            myCart[i][0] = null;
            myCart[i][1] = null;
            myCart[i][2] = null;
        }
        cartCount = 0;
    }
}
