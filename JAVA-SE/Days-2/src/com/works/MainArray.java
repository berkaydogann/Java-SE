package com.works;

import java.util.Arrays;

public class MainArray {
    public static void main(String[] args) {
        //Array
        //Diziler
        //String[] diziAdi = {"Deger -1", "Deger -2",....};
        String[] users = new String[5];
        users[0] = "Erkan";

        String[] cities = {"Ankara", "İstanbul", "Adana", "İzmir", "Bursa"};
        String ist = "İstanbul";
        System.out.println(cities);
        System.out.println(ist);
        //Single item
        //index -> 0'dan başlar.
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        //Item value change
        cities[1] = "Antalya";
        System.out.println(Arrays.toString(cities));
        int i = 5;

        if (i >= 0 && cities.length > 5) {
            System.out.println(cities[i]);
        } else {
            System.err.println("Not Found Index: " + i);
        }


    }
}
