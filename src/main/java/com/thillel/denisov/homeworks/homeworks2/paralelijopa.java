package com.thillel.denisov.homeworks.homeworks2;

public class paralelijopa {
    public static void main(String[] args) {
      int a = 10;
      int b = 3;
      double h = 2.4;
        System.out.println("Значение сторон параллелепипеда");
        System.out.println("a = 10");
        System.out.println("b = 3");
        System.out.println("h = 2.4");
// Формула объема прямоугольного параллелепипеда: прямоугольного параллелепипед V = a · b · h
       double V = a*b*h;
        System.out.println("Объем параллелепипеда = " + (int)V);
        double length = (a+b+h)*4;
        System.out.println("Сумарная длина всех сторон = " + length);

    }
}
