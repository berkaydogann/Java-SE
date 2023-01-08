package useArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //Add Item
        list.add("İstanbul");
        list.add("Ankara");
        list.add("Antalya");
        list.addAll(Arrays.asList("İzmir", "Adana", "Bursa"));

        System.out.println(list);
        //Get Item
        String item = list.get(0);
        System.out.println(item);

        //Total size
        int listSize = list.size();
        System.out.println(listSize);

        //Total Items
        for (String city : list) {
            System.out.println(city);
        }

    }
}
