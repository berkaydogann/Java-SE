package com.works;

import java.util.Scanner;

public class MainWhile {
    public static void main(String[] args) {

        //While(boolean)
        String[] users = {"Ali", "Serkan", "Mehmet", "Ahmet"};

        String data = "Bugün günlerden Pazar\nKahvaltı yapalım\nSonra sinemaya gidelim.";
        Scanner read = new Scanner(data);
        while (read.hasNext()) {
            System.out.println(read.nextLine());
        }
        System.out.println("----------");
        while (read.hasNext()) {
            System.out.println(read.nextLine());
        }

        int i = 0;
        while (i < 10) {
            System.out.println("While: " + i);
            i++;
        }

        //do - while
        int x = 0;
        do {
            System.out.println("Do while: " +x);
            x++;
        } while (x > 5);
    }
}
