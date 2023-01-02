package com.works;

public class MainLoop {
    public static void main(String[] args) {
        //for loop
        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.println("i:" + i);
        }
        System.out.println("i end:" + i);

        // ++,--
        int x = 0;
        //System.out.println(x++); -> 0
        System.out.println(++x);

        String[] cities = {"Ankara", "İstanbul", "Adana", "İzmir", "Bursa"};
        for (int j = 0; j < cities.length; j++) {
            System.out.println(cities[j]);
        }

        //foreach
        for (String city : cities) {
            System.out.println(city);
        }

        //Icice dizi
        String[] sections = {"Kış", "İlkbahar", "Yaz", "Sonbahar"};
        String[][] months = {{"Aralık", "Ocak", "Şubat"}, {"Mart", "Nisan", "Mayıs"}, {"Haziran", "Temmuz", "Ağustos"}, {"Eylül", "Ekim", "Kasım"}};
        String ay = "Nisan";
        label:
        for (int j = 0; j < months.length; j++) {
            for (int k = 0; k < months[j].length; k++) {
                if (months[j][k].equals(ay)) {
                    System.out.println(sections[j]);
                    break label;
                }
            }
        }

        //Break
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                break;
            }
            System.out.println("Break:" + j);
        }
    }
}
