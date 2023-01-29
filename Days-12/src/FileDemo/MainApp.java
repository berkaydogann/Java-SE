package FileDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        //createFile();
        //getFileInfo();
        //readFile();
        writeFile();
    }

    public static void createFile() {
        File file = new File("students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu. Dosya yolu:" + file.getAbsolutePath());
            } else {
                System.out.println("Dosya zaten var. Dosya yolu: " + file.getAbsolutePath());
            }
        } catch (Exception ex) {
            System.err.println("Dosya olusturulurken hata meydana geldi. " + ex);
            ex.printStackTrace();
        }

    }

    public static void getFileInfo() {
        File file = new File("students.txt");
        if (file.exists()) {
            System.out.println("Dosya adi: " + file.getName());
            System.out.println("Dosya yolu: " + file.getAbsolutePath());
            System.out.println("Dosya okunur mu?: " + file.canRead());
            System.out.println("Dosya yazılabilir mi?: " + file.canWrite());
            System.out.println("Dosya boyutu: " + file.length());
        }
    }

    public static void readFile() {
        File file = new File("students.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (Exception ex) {
            System.err.println("Dosya okunurken hata alindi: " + ex);
        }
    }

    public static void writeFile() {

        try {
            FileWriter file = new FileWriter("students.txt", true);
            for (int i = 0; i < 10; i++) {
                file.append("Append Test" + i + System.lineSeparator());
            }

            file.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
