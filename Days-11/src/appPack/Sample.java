package appPack;

import java.util.*;

public class Sample {
    public static void main(String[] args) {

        //ArrayList üretilirken Ata Tür olan List kullanılır.
        List<String> ls = new ArrayList<>();
        ArrayList<String> lsx = new ArrayList<>();


        //Hashmap üretilirken Ata Tür olan Map kullanılır.
        Map<String, String> hm = new HashMap<>();
        HashMap<String, String> hmx = new HashMap<>();

        //Set -> Benzersiz değerleri bir liste altında tutmak için kullanılır.
        Set<String> set = new HashSet<>();

        //LinkedHashMap -> Sıralama algoritmasının önemli olduğu Map olaylarında kullanılır.
        Map<String, Object> mp = new LinkedHashMap<>();

        //LinkedHashSet -> Sıralama ve benzersizliğin önemli olduğu collection olaylarında kullanılır.
        Set<String> linkedHashSet = new LinkedHashSet<>();

        //Enum -> Anahtar -> Key
        Map<EKeys, Object> hmt = new HashMap<>();
        hmt.put(EKeys.name, "Ali");
        hmt.put(EKeys.surname, "Bilmem");
        hmt.put(EKeys.age, 30);
        System.out.println(hmt);
    }
}
