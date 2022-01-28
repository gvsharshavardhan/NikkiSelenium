package com.java.arrays;

public class CustomReplace {

    public static void main(String[] args) {
        System.out.println(replaceSecondOccarance("nikhila",'I','b'));

    }

    static String replaceSecondOccarance(String str, char old, char latest) {

        int counter = 0;
        char[] arr = str.toCharArray();//converting string to charArray

        for (int i = 0; i < arr.length; i++) {
            if (String.valueOf(arr[i]).equalsIgnoreCase(String.valueOf(old)) && counter == 1) {
                arr[i] = latest;
                counter++;
            }
            else if(String.valueOf(arr[i]).equalsIgnoreCase(String.valueOf(old))){
                counter++;
            }
        }
        return String.valueOf(arr);//converting charArray to String
    }
}
