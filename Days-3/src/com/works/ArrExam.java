package com.works;

import java.util.Scanner;

public class ArrExam {
    public static void main(String[] args) {

        //Kullanıcının stok girişi
        //Kaç kalem ürün olduğunu kullanıcı belirler:
        //1.Aşama -> Kaç ürününüz var
        //2.Aşama -> 6
        //3.Aşama -> 1.ürünün adet sayısını giriniz
        //4.Aşama -> 25 geldi diyelim
        //
        //Toplam Adet sayınız: 1677 dir;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Kac adet ürününüz oldugunu giriniz:");
            int kalemAdet = scanner.nextInt();
            if (kalemAdet > 0) {
                int[] products = new int[kalemAdet];
                for (int i = 0; i < kalemAdet; i++) {
                    System.out.print((i + 1) + ".Ürünün Adet Sayısı Giriniz:");
                    products[i] = scanner.nextInt();
                }
                int sum = 0;
                for (int product : products) {
                    sum = sum + product;
                }
                System.out.println("Toplam Adet Sayınız:" + sum);

            } else {
                System.err.println("0'dan büyük bir değer giriniz!");

            }
        }


    }
}
