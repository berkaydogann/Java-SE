package exercise;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.print("Bir sayı giriniz: ");
            String sayi = scanner.nextLine();
            try {
                num = Integer.parseInt(sayi);
                System.out.println("Sayısal deger girdiniz.");
                break;
            } catch (Exception e) {
                System.err.println("Lütfen tam sayı giriniz. Girdiğiniz değer: " + sayi);

            }
        }
        num = num * 10;
        System.out.println(num);
    }

}
