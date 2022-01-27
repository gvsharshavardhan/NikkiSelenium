package com.java.arrays;

public class FunctionsDemo {

    static double incometaxcalculator(double sal) {
        if (sal > 1000) {
            sal = sal + (sal * 0.6);
        }
        sal = sal - (sal * 0.3);
        return sal;
    }

    public static void main(String[] args) {

        double salaries[] = {1000,2000,3000};

        for(int i=0;i<salaries.length;i++){
            System.out.println(incometaxcalculator(salaries[i]));
        }
    }
}