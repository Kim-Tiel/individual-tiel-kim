package com.joysistvi.day4.operator;

public class UnaryOperator {

    public static void main(String[] args){
        // negating an expression (-)
        int num = 10;
        num = 11;
        System.out.println(-num);

        // inverting the value of a boolean
        boolean isActive = true;
        System.out.println(!isActive);

        // increment/decrement a value by one
        int number = 1;
        System.out.println(--number);
        System.out.println(++number);

        System.out.println(number--);
        System.out.println(number++);

        System.out.println(number);
    }
}
