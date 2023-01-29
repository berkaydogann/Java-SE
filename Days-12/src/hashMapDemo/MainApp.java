package hashMapDemo;

import java.util.HashMap;
import java.util.HashSet;

public class MainApp {
    public static void main(String[] args) {
        HashMap<String, String> sozluk = new HashMap<>();
        sozluk.put("book", "kitap");
        sozluk.put("table", "masa");
        sozluk.put("computer", "bilgisayar");

        for (String item : sozluk.keySet()){
            System.out.println(item + "-" + sozluk.get(item));
        }



    }
}
