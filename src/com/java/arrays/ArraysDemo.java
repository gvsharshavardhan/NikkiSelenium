package com.java.arrays;

import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        //5 students, each student - 3 subjects marks
        //each student - total, average
        //class total, average.


        int[] student1 = new int[3];
        int[] student2 = new int[3];
        int[] student3 = new int[3];
        int[] student4 = new int[3];
        int[] student5 = new int[3];
        double student_total = 0.0;
        double class_total = 0.0;

        Scanner sc = new Scanner(System.in);

        //collecting marks from students
        System.out.println("********** Student 1 ***********");
        for(int i=0;i<student1.length;i++){

            System.out.println("please enter marks of subject["+i+"]: ");
            student1[i] = sc.nextInt();
        }
        System.out.println("********** Student 2 ***********");
        for(int i=0;i<student2.length;i++){
            System.out.println("please enter marks of subject["+i+"]: ");
            student2[i] = sc.nextInt();
        }
        System.out.println("********** Student 3 ***********");
        for(int i=0;i<student3.length;i++){
            System.out.println("please enter marks of subject["+i+"]: ");
            student3[i] = sc.nextInt();
        }
        System.out.println("********** Student 4 ***********");
        for(int i=0;i<student4.length;i++){
            System.out.println("please enter marks of subject["+i+"]: ");
            student4[i] = sc.nextInt();
        }
        System.out.println("********** Student 5 ***********");
        for(int i=0;i<student5.length;i++){
            System.out.println("please enter marks of subject["+i+"]: ");
            student5[i] = sc.nextInt();
        }
        //calculate each student total and average
        for(int i=0;i<student1.length;i++){
            student_total = student_total + student1[i];
        }
        System.out.println("Student 1 total is : " + student_total);
        class_total = class_total + student_total;
        System.out.println("Student 1 average is : " + student_total/student1.length);
        student_total = 0.0;


        for(int i=0;i<student2.length;i++){
            student_total = student_total + student2[i];
        }
        System.out.println("Student 2 total is : " + student_total);
        class_total = class_total + student_total;
        System.out.println("Student 2 average is : " + student_total/student2.length);
        student_total = 0.0;


        for(int i=0;i<student3.length;i++){
            student_total = student_total + student3[i];
        }
        System.out.println("Student 3 total is : " + student_total);
        class_total = class_total + student_total;
        System.out.println("Student 3 average is : " + student_total/student3.length);
        student_total = 0.0;


        for(int i=0;i<student4.length;i++){
            student_total = student_total + student4[i];
        }
        System.out.println("Student 4 total is : " + student_total);
        class_total = class_total + student_total;
        System.out.println("Student 4 average is : " + student_total/student4.length);
        student_total = 0.0;


        for(int i=0;i<student5.length;i++){
            student_total = student_total + student5[i];
        }
        System.out.println("Student 5 total is : " + student_total);
        class_total = class_total + student_total;
        System.out.println("Student 5 average is : " + student_total/student5.length);


        System.out.println("#########################################");
        System.out.println("CLASS TOTAL: "+class_total);
        System.out.println("CLASS AVERAGE: "+class_total/5);

    }
}
