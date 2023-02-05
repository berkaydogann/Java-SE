package com.works;

import java.util.Scanner;

public class MainObject {
    public static void main(String[] args) {

        //Object Türü
        //Her türlü veriyi içerisine alabilen türdür.

        Object obj = null;
        obj = 10;
        obj = true;
        obj = new Scanner(System.in);
        obj = "İstanbul";

        if (obj instanceof String) {
            String st = String.valueOf(obj);
            System.out.println("String: " + st);

        } else if (obj instanceof Integer) {
            int x = (int) obj;
            System.out.println("Int:" + x);
        }

        Object num1 = 10;
        Object num2 = 120;
        int sum = (int) num1 + (int) num2;
        System.out.println(sum);

        int[] numbers = {30, 56, 65, 45, 42};
        Object[] objects = {"Ali", 30, 42, true, 'A', false, 77};
        int sum_obj = 0;
        for (Object item : objects) { //Burada item.getClass() dersek degerlerin tipini döndürür.
            if (item instanceof Integer) {
                int num = (int) item;
                System.out.println(num);
                sum_obj = sum_obj + (int) item;
            }
        }
        System.out.println("Toplam sonuc : " + sum_obj);

    }
}
