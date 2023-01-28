package appPack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseLinkedHashMap {
    public static void main(String[] args) {

        Map<String, Object> hm = new LinkedHashMap<>();
        hm.put("name", "Ali");
        hm.put("surname", "Bilmem");
        hm.put("age", 30);
        hm.put("status", true);

        System.out.println(hm);

        Map<String, Object> hmx = new HashMap<>();
        hmx.put("name", "Ali");
        hmx.put("surname", "Bilmem");
        hmx.put("age", 30);
        hmx.put("status", true);

        System.out.println(hmx);

    }
}
