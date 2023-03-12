package com.knoldus.task9;

// drawing different shapes using polymorphism
public class Shape {
    public void draw(){
        System.out.println("Drawing different shapes");
    }
}
class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("circle is drawn here..");
    }
}
class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle is drawn here");
    }
}
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Triangle is drawn here");
    }
}
class DrawShapes{
    public static void main(String args[])
    {
        Circle circle1 = new Circle();
        circle1.draw();
        Rectangle rectangle1 = new Rectangle();
        rectangle1.draw();
        Triangle triangle1 = new Triangle();
        triangle1.draw();
    }
}

