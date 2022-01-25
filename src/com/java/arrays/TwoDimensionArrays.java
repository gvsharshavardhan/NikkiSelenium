package com.java.arrays;

import java.util.Scanner;

public class TwoDimensionArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many students do you have:");
        int no_students = sc.nextInt();
        System.out.println("how many subjects do you have:");
        int no_marks = sc.nextInt();
        int[][] students = new int[no_students][no_marks];

        double student_total = 0.0;
        double class_total = 0.0;

        //input of marks
        for(int i=0;i<students.length;i++){
            System.out.println("*****Enter student "+(i+1)+" marks*****");
            for(int j=0;j<students[i].length;j++){
                System.out.println("enter sub "+(j+1)+" marks: ");
                students[i][j] = sc.nextInt();
            }
        }
        //calculate total and avg
        for(int i=0;i<students.length;i++){
            for(int j=0;j<students[i].length;j++){
                student_total = student_total + students[i][j];
            }
            System.out.println("Student "+(i+1)+" total is "+ student_total);
            System.out.println("Student "+(i+1)+" avg is "+ student_total/students[i].length);
            class_total = class_total + student_total;
            student_total = 0.0;
        }

        System.out.println("class total : "+ class_total);
        System.out.println("class avg : "+ class_total/students.length);
    }
}
