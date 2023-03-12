package com.knoldus.task8;

class Student{
    private char grade; // encapsulate grade inside the class

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}
public class GradingSystem {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setGrade('B');

        //get grade of the student
        System.out.println("Grade of the student is "+student1.getGrade());
    }
}
