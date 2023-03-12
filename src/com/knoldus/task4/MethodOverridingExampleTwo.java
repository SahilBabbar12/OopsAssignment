package com.knoldus.task4;

import java.util.Scanner;

class Shape{

    void area(){
        System.out.println("Calculate area of different shapes");
    }
}
class Circle extends Shape{
    int radius;
    final double PI= 3.14;
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void area() {  // overriding method area that calculates the area of circle
        System.out.println("Area of Circle is : "+(PI * radius *radius));
    }
}
class Rectangle extends Shape{
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {  //overriding method area that calculates the area of rectangle
        System.out.println("Area of rectangle is: "+(length * breadth));
    }
}
public class MethodOverridingExampleTwo {
    public static void main(String[] args) {

        Shape shape=new Shape();
        shape.area();

        Scanner input =new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int radius=input.nextInt();

        Circle circle=new Circle(radius);
        circle.area();

        System.out.println("Enter the length of rectangle");
        int length=input.nextInt();
        System.out.println("Enter the breadth of rectangle");
        int breadth=input.nextInt();

        Rectangle rectangle=new Rectangle(length,breadth);
        rectangle.area();


    }
}
