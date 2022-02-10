package com.java.opps_static;


public class Demo {

    public static void main(String[] args) {
        Appartment room1 = new Appartment();
        Appartment room2 = new Appartment();
        room2.bedroomSize = "kids";

        room1.stove = "LG";
        room1.onStoveInKitchen();
        room2.onStoveInKitchen();

        room1.useBalcony();
        room2.useBalcony();


    }
}
