package arrayListDemo;

import java.lang.reflect.Array;
import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.Collections;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(11);
        sayilar.add(5);
        sayilar.add(124);
        sayilar.add(128);

        Collections.sort(sayilar);
        for (Object item : sayilar) {
            System.out.println(item);
        }


        ArrayList<Customer> customers = new ArrayList<>();
        /*Fakat customer1 degiskeni oluşturup bunu remove et dersek bu sefer aynı referans numarası oldugu için siler!*/
        Customer customer1 = new Customer(2, "Ahmet", "Bilmem");
        customers.add(new Customer(1, "Berkay", "Aydogan"));
        customers.add(customer1);
        customers.add(new Customer(3, "Zeynep", "Bilir"));

        /*Burada new diyip yeni bir referans tip oluşturduğumuz için yukarıdaki berkay'ı silmez!!*/
        customers.remove(new Customer(1, "Berkay", "Aydogan"));
        customers.remove(customer1);
        for (Customer customer : customers) {
            System.out.println(customer.lastName);
        }
    }
}
