package com.company;

//Napisz metodę, która sprawdzi czy temperatura przekazana jako argument jest dodatnia.

public class Temperature {
    public static void main(String[] args) {

        double temperature = -18;

        if (temperature > 0) {
            System.out.println("Temperature " + temperature + " is positive.");
        } else {
            System.out.println("Temperature " + temperature + " is not positive");
        }
    }


}