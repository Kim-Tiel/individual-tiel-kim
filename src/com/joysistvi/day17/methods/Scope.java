package com.joysistvi.day17.methods;

public class Scope {


    static String name = "Winter";
    int age = 60;

    public static void main(String[] args) {
        int num = 0;
        String a = "sample";

        greet(a);
        Scope obj = new Scope();
        System.out.println(obj.name);
        System.out.println(obj.age);
    }

    public static void greet(String num){
        System.out.println("Here " + num);
    }

}
