package com.joysistvi.mockexam;

public class MockTechnicalExam {

    public static void main(String[] args) {

        // Question #1
        // char var1 = 'a';
        // char var2 = var1;
        // var2 = 'e';

        // // Vowel obj1 = new Vowel();
        // // Vowel obj2 = obj1;
        // // obj1.var = 'o';
        // // obj2.var = 'i';

        // System.out.println(var1 + ", " + var2);
        // // System.out.print(obj1.var + ", " + obj2.var);

        // Question #2
        // String stuff = "TV";
        // String res = null;

        // if (stuff.equals("TV")) {
        //     res = "Samsung";
        //     System.out.println(res);
        // } else if (stuff.equals("Color")) {
        //     res = "White";
        //     System.out.println(res);
        // } else {
        //     res = "No result";
        //     System.out.println(res);
        // }

        // res = stuff.equals("TV") ? "Samsung" : stuff.equals("Color") ? "White" : "No result";
        // System.out.println(res);

        // Question #4
        // int x = 100;
        // int a = x++;
        // int b = ++x;
        // int c = x++;
        // int d = (a < b) ? (a < c) ? a : (b < c) ? b : c : x;
        // System.out.println(d);

        // Question #5
        // int y2 = 100;
        // float fltA = (float) y2;

        // // Float fltB = 100.00;

        // float fltC = (float) 1_11.00;

        // float fltD = 100.00F;

        // // double y1 = 203.22;
        // // float fltE = y1;

        // System.out.println(fltA + " " + fltC + " " + fltD);

        // Question #6
        // int x = 10;
        // int y = 3;
        // System.out.println(x / y);

        // Question #7
        // float var1 = (12_345.01 <= 123_45.00) ? 12_456 : 124_56.02f;
        // float var2 = var1 + 1024;
        // System.out.println(var2);

        // Question #11
        // int x = 10;
        // int y = ++x;
        // int z = 0;
        // if (y >= 10 | y <= ++x) {
        //     z = x;
        // } else {
        //     z = x++;
        // }
        // System.out.println(z);

        // Question #12
        // Integer x = new Integer("1");
        // // short x = 1;
        // // byte x = 1;
        // switch (x) {
        //     case 1:
        //         System.out.println("One");
        //         break;
        //     case 2:
        //         System.out.println("Two");
        //         break;
        // }

        // Question #13
        // char colorCode = 'y';
        // switch (colorCode) {
        //     case 'r':
        //         int color = 100;
        //         break;
        //     case 'b':
        //         color = 10;
        //         break;
        //     case 'y':
        //         color = 1;
        //         break;
        // }
        // // System.out.println(color);

        // Question #14
        // String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //         if (arr[i][j].equals("B")) {
        //             continue;
        //         }
        //     }
        //     continue;
        // }
        // System.out.println();

        // Question #15
        // class Testing {
        //     Testing() {}
        //     String str = "Java";
        // }
        // System.out.println(new Testing().str);

        // Question #16
        // String[] strs = {"A", "B"};
        // int idx = 0;
        // for (String s : strs) {
        //     strs[idx].concat(" and " + idx);
        //     idx++;
        // }
        // for (idx = 0; idx < strs.length; idx++) {
        //     System.out.println(strs[idx]);
        // }

        // Question #17
        // int x;

        // x = 0;
        // do {
        //     System.out.print("*");
        // } while (x++ < 3);
        // System.out.println();

        // x = 3;
        // do {
        //     System.out.print("*");
        //     x--;
        // } while (x >= 0);
        // System.out.println();

        // Question #18
        // String grade = "B";
        // switch (grade) {
        //     case "A": case "1":
        //         System.out.println("Grade 1");
        //         break;
        //     case "B":
        //         System.out.println("Grade 2");
        //         break;
        //     default:
        //         System.out.println("Grade 3");
        // }

        // Question #19
        // int aVar = 9;
        // if (aVar++ < 10) {
        //     System.out.println(aVar + " Hello Universe!");
        // } else {
        //     System.out.println(aVar + " Hello World!");
        // }

        // Question #20
        // // Boolean available = "TRUE";
        // // String tmpAuthor = author, author = "Donald";
        // Double price = 200D;
        // Integer pages = 20;
        // System.out.println(price + " " + pages);

        // Question #21
        // int sum = 0;
        // for (int xVal = 1; xVal <= 5; xVal++) {
        //     sum = sum + xVal;
        // }
        // // System.out.print("The sum of " + xVal + " numbers is: " + sum);

        // Question #22
        // double area = 0;
        // double p, b, h;
        // if (area == 0) {
        //     b = 3;
        //     h = 4;
        //     p = 0.5;
        //     area = p * b * h;
        // }
        // System.out.println("Area is " + area);

        // Question #23
        // int x;
        // for (x = 100; x <= 100; x++) {
        //     System.out.println("Welcome " + x);
        // }

//         Question #24
         int price = 1000;
         int qty = 2;
         String grade = "2";
         double discount = 0.0;
         switch (grade) {
             case "1":
                 discount = price * 0.1;
                 break;
             case "2":
                 discount = price * 0.5;
                 // continue;
             default:
                 System.out.println("Thank you!");
         }
         System.out.println(discount);

        // Question #25
        // // package clothing;
        // // public class Shirt {
        // //     public static String getColor() {
        // //         return "Green";
        // //     }
        // // }
        // //
        // // package clothing.pants;
        // // import clothing.Shirt;
        // // public class Jeans {
        // //     public void matchShirt() {
        // //         String color = Shirt.getColor();
        // //         if (color.equals("Green")) {
        // //             System.out.println("Fit");
        // //         }
        // //     }
        // // }
    }
}