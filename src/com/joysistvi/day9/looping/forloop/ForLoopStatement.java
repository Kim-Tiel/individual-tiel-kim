package com.joysistvi.day9.looping.forloop;

public class ForLoopStatement {
    public static void main(String[] args){
        for (int i = 0; i <= 20; i++){
            System.out.print(i % 2 == 0 ? i + " " : "");
        }
    }
}
