package com.joysistvi.day12.multidarray;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[][] numbers = new int[3][3];
//        String[][] sample = new String[2][4]

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.print("Enter number for row " + (row + 1) + ", column " + (col + 1) + ": ");
                numbers[row][col] = input.nextInt();
            }
        }

        System.out.println();

        for (int[] number : numbers) {
            for (int i : number) {
                System.out.println(i);
            }
            System.out.println();
        }

        input.close();
    }
}