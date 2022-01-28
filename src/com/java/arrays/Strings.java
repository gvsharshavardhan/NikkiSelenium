package com.java.arrays;

public class Strings {

    public static void main(String[] args) {
        String fname = "Nikhila";
        String lname = "Kunapareddy";

        //concatenation
        String fullName = fname+lname;
        System.out.println(fullName);

        String name = fname.concat(lname);
        System.out.println(name);

        //length
        int size = fname.length();
        System.out.println(size);

        //equality
        int a = 10;
        int b = 10;
        boolean f = a==b;
        System.out.println(f);

        boolean ans = fname.equals(lname);
        System.out.println(ans);

        //equal ignore case
        String x = "harsha";
        String y = "HARSHA";
        System.out.println(x.equals(y));
        System.out.println(x.equalsIgnoreCase(y));

        //contains
        System.out.println("********* CONTAINS **********");
        String college = "humber";
        System.out.println(college.contains("bmu"));

        //substring(start index-included, end index-excluded)
        String animal = "elephantschool";
        System.out.println(animal.substring(animal.length()-4,animal.length()));


        //replace
        String color = "blabk";
        System.out.println(color.replace("b","h"));




    }
}
