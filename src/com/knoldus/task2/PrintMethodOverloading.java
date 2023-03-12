package com.knoldus.task2;

import java.util.Scanner;

public class PrintMethodOverloading {
    public static void print(int number){     // print method to print an integer
        System.out.println("the integer value is: "+number);
    }
    public static  void print(String name){  // print method to print a String
        System.out.println("the string value is: "+name);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number");
        int number=input.nextInt();

        System.out.println("Enter your name");
        String name=input.next();

        print(number);
        print(name);
    }
}
