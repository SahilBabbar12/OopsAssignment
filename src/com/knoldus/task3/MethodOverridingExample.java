package com.knoldus.task3;

class Animal{
    void speak(){
        System.out.println("animals speak through sounds and gestures");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Cat meows");
    }
}
public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Dog dog=new Dog();
        Cat cat=new Cat();

        animal.speak();
        dog.speak();
        cat.speak();
    }
}
