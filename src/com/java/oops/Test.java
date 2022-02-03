package com.java.oops;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee[] a = {new Employee(),new Employee(),new Employee()};

        for(int i=0;i<a.length;i++){
            System.out.println("set e"+(i+1)+" job: ");
            a[i].setJob( scan.nextLine());
            System.out.println(a[i].getJobDescription());
        }
    }
}