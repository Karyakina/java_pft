package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        double a=6;
        double b=10;
        System.out.println("Площадь прямоугольника со сторонами "+a+" и "+b+" равна "+area(a, b));
    }
    public static double area(double a, double b) {
       return a*b;
    }
}