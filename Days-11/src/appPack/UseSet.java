package appPack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UseSet {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Ali");
        set.add("Ali");
        set.add("Ali");
        set.add("Ali");
        set.add("Hasan");
        set.add("Hasan");
        set.add("Zeynep");
        System.out.println(set);

        Set<String> setOrder = new LinkedHashSet<>();
        setOrder.add("Ali");
        setOrder.add("Ali");
        setOrder.add("Ali");
        setOrder.add("Ali");
        setOrder.add("Hasan");
        setOrder.add("Hasan");
        setOrder.add("Zeynep");
        System.out.println(setOrder);

        Set<User> setUser = new LinkedHashSet<>();
        User u1 = new User();
        u1.setName("Ali");
        u1.setAge(30);
        setUser.add(u1);

        User u2 = new User();
        u2.setName("Ali");
        u2.setAge(30);
        setUser.add(u2);

        System.out.println(setUser.size()); //2 olur.

    }
}
