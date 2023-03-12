package com.knoldus.task1;

import java.util.Scanner;

public class AddMethodOverloading {

    // method to add 2 integers
    public static int add(int number1,int number2){
        return number1+number2;
    }

    //method to add 3 integers
    public static int add(int number1,int number2,int number3){
        return number1+number2+number3;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int number1=input.nextInt();

        System.out.println("Enter the 2nd number");
        int number2=input.nextInt();

        System.out.println("Enter the 3rd number");
        int number3=input.nextInt();

        System.out.println("Sum of first two numbers: "+add(number1,number2));
        System.out.println("Sum of first three numbers: "+add(number1,number2,number3));
    }
}
