package com.java.opps_static;

public class Appartment {

    static String stove = "Prestige";
    String bedroomSize = "master bed room";
    private String balcony = "sea side view";

    void onLightInBedroom(){
        System.out.println(this.bedroomSize + " light on!!");
    }

    static void onStoveInKitchen(){
        System.out.println(Appartment.stove + " stove on");
    }

    void useBalcony(){
        if(this.bedroomSize.contains("master")){
            System.out.println("using "+balcony);
        }else {
            System.out.println("you don't have access to balcony");
        }
    }
}