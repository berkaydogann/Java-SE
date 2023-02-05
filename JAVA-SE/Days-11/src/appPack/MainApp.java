package appPack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {

        ArrayList<Map<String, String>> ls = new ArrayList<>();
        Map<String, String> hm1 = new HashMap<>();
        hm1.put("name", "Ali Bilmem");
        hm1.put("age", "30");
        ls.add(hm1);

        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("name", "Ahmet Bilmem");
        hm2.put("age", "10");
        ls.add(hm2);

        HashMap<String, String> hm3 = new HashMap<>();
        hm3.put("name", "Mehmet Bilmem");
        hm3.put("age", "23");
        ls.add(hm3);

        HashMap<String, String> hmx = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hmx.put("name", "Person-" + i);
            hmx.put("age", "" + (23 + i));
            ls.add(hmx);
        }

        for (Map<String, String> item : ls) {
            System.out.println(item);
        }
    }
}
