package appPack;

import java.util.HashMap;
import java.util.Set;

public class MainApp {
    public static void main(String[] args) {
        HashMap<String, Object> hm = new HashMap<>();

        //Deger ekleme
        String name = "Erkan";
        String surname = "Bilmem";
        Integer age = 30;
        Boolean status = true;
        String address = "İstanbul";

        hm.put("name", name);
        System.out.println("name hascode: " + name.hashCode());
        hm.put("surname", surname);
        System.out.println("surname hascode: " + surname.hashCode());
        hm.put("age", age);
        System.out.println("age hascode: " + age.hashCode());
        hm.put("status", status);
        System.out.println("status hascode: " + status.hashCode());
        hm.put("address", address);
        System.out.println("Address hascode: " + address.hashCode());
        System.out.println(hm);

        //Deger alma
        System.out.println(hm.get("age"));

        //Tüm elemanları ayrı ayrı yazdırma
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + hm.get(key));
        }

        //Degeri silme
        Object statu = hm.remove("status");
        System.out.println(statu);

        //Tüm elemanları silme
        //hm.clear();
        //System.out.println(hm);

        //Eleman sayısı
        int size = hm.size();
        System.out.println(size);

        

    }
}
