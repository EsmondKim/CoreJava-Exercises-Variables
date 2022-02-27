package com.teksystems;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
//        twoInts();
//        twoDoubles();
//        doubleIntSum();
//        intDivide();
//        doubleDivide();
//        intDoubleAdd();
//        twoIntAdd();
//        castQ();
//        constCreate();
        cafeMenu();
    }//main

    public static void twoInts() {
        int x = 5;
        int y = 10;
        int sum = x + y;
        System.out.println(sum);
    }//twoInts()

    public static void twoDoubles() {
        double x = 5;
        double y = 10;
        double sum = x + y;
        System.out.println(sum);
    }//twoDoubles()

    public static void doubleIntSum() {
        int x = 5;
        double y = 10;
        double sum = x + y;
        //The sum must be double to avoid "lossy conversion" error.
        System.out.println(sum);
    }//doubleIntSum()

    public static void intDivide() {
        double x = 5;
        double y = 10;
        double divide = x/y;
        System.out.println(divide);
    }//intDivide()
//Int means x/y equates to 0, and switching int to double allows the class to equate to 0.5.

    public static void doubleDivide() {
        double x = 5;
        double y = 10;
        double divide = y/x;
        double c = (int)divide;
        System.out.println(divide);
        System.out.printf("This is the type casted var: %d", c);
    }//doubleDivide()
    //IllegalFormat Conversion of Double to Int

    public static void intDoubleAdd() {
        int x = 5;
        double y = 10;
        double sum = x + y;
        System.out.println(sum);
    }//intDoubleAdd()
    //Must use double for sum variable to avoid lossy conversion exception.

    public static void twoIntAdd() {
        int x = 5;
        double y = 10.2;
        double sum = x + y;
        System.out.println(sum);
    }//twoIntAdd()
    //decimal and sum must be double to avoid lossy conversion

    public static void castQ() {
        int x = 5;
        int y = 6;
//        int q = y/x;
       double q = y;
       double r = x;
       double s = q/r;
        System.out.println(s);
    }//castQ()

    public static void constCreate() {
        double pi = 3.14159;
        int s = 32;
        final double RADIUS = s*s*pi;
        System.out.println(RADIUS);
    }//constCreate()



    public static void cafeMenu() {
        double coffee = 1.50;
        double tea = 2.25;
        double croissant = 2.50;

        double subtotal = (3 * coffee) + (4 * tea) + (2 * croissant);
        final double SALES_TAX = subtotal + (subtotal * 0.8);
        System.out.println(SALES_TAX);
    }//cafeMenu()

}//Main
