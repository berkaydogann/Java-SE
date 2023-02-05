package useFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DataStore {
    private final String fileName;
    private final File file;
    private final String folderName = fncDate();

    public DataStore(String fileName) {
        folderControl(folderName);
        this.fileName = folderName + "/" + fileName + ".txt ";
        file = new File(this.fileName);
    }

    public String fncDate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        int year = localDateTime.getYear();
        String month = localDateTime.getMonthValue() > 9 ? "" + localDateTime.getMonthValue() : "0" + localDateTime.getMonthValue();
        int day = localDateTime.getDayOfMonth();
        String nowDate = day + "_" + month + "_" + year;
        return nowDate;
    }

    public void folderControl(String folderName) {
        File file = new File(folderName);
        if (!file.exists()) {
            file.mkdir();
        }

    }

    public boolean createFile() {

        try {
            deleteFile();
            return file.createNewFile();
        } catch (Exception ex) {
            System.err.println("createFile Error: " + ex);
        }
        return false;
    }

    public boolean deleteFile() {
        try {
            if (file.exists()) {
                return file.delete();
            }
        } catch (Exception ex) {
            System.err.println("deleteFile Error: " + ex);
        }
        return false;
    }

    public void addData(String data) {
        try {
            if (file.canWrite()) {
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.append(data + System.lineSeparator());
                fileWriter.close();
            }
        } catch (Exception ex) {
            System.err.println("addData: " + ex);
        }
    }

    public List<String> readData() {
        List<String> ls = new ArrayList<>();
        try {
            if (file.canRead()) {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    ls.add(line);
                }
                scanner.close();
            }
        } catch (Exception ex) {
            System.err.println("readData: " + ex);
        }
        return ls;
    }

    public List<String> allReadData() {
        List<String> ls = new ArrayList<>();
        try {
            File file = new File(folderName);
            File[] files = file.listFiles();
            for (File item : files) {
                String type = item.getName().substring(item.getName().length() - 4);
                if (type.equals(".txt")) {
                    Scanner scanner = new Scanner(item);

                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        ls.add(line);
                    }
                }

            }
        } catch (Exception ex) {
            System.err.println("allReadData err: " + ex);
        }
        return ls;
    }
}
