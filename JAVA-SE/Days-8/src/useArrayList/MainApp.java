package useArrayList;

import java.util.*;

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

        //Remove items
        //list.remove("Antalya");
        //list.remove(0);
        //list.removeAll(Arrays.asList("İstanbul","Ankara));

        //All items clear
        //list.clear();

        //Add with index
        list.add(0, "Berkay");

        //contains -> liste için var mı
        boolean containsStatus = list.contains("Ankara");
        System.out.println(containsStatus);

        // addAll -> Bir listenin başka listeye eklenmesi için
        List<String> ls = new ArrayList<>();
        ls.add("Gaziantep");
        ls.add("Şanlıurfa");
        ls.add("Elazığ");
        ls.add("Gaziantep");
        list.addAll(ls);

        //indexOf -> bir değerin liste içindeki index'ini döner
        System.out.println(list.indexOf("Antalya"));

        //lastIndexOf -> var olan değerin dışında aynı değerin sondaki index'ini getirir
        System.out.println(list.lastIndexOf("Gaziantep"));

        //Var olan bir index değerini değiştirmeye yarar.
        list.set(0, "newİstanbul");

        //Sıralama
        Collections.sort(list); // A-Z
        Collections.reverse(list); //Z-A

        //Listeyi Diziye dönüstürme
        Object[] objects = list.toArray();

        String[] arrx = {"Van", "Ağrı"};
        List<String> newList = Arrays.asList(arrx);

        //to iterator
        System.out.println("=================");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(list);


    }
}
