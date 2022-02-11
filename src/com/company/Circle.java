package com.company;

public class Circle {
    private static final double PI=3.14159265;

    public static void area(int radius){
        System.out.println("Area is: "+ PI*(radius*radius));
    }
    public static void circumference(int radius){
        System.out.println("circumference is: "+ PI*(2*radius));

    }
}


