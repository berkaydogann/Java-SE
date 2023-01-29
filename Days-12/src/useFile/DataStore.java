package useFile;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataStore {
    File file = new File("note.txt");

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
}
