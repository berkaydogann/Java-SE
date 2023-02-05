package com.works;

public class MainMethod {
    public static void main(String[] args) {
        //Nesne üretimi
        Action action = new Action();
        action.noParameter();
        action.noReturn("Berkay", 22);
        System.out.println(action.age);
        int count = action.size("Bugün günlerden JAVA");
        System.out.println(count);
        if (action.size("Fenerbahçe") >= 10) {
            System.out.println("Şampiyon Fenerbahçe");
        }

        //Arr function call
        Object[] objArr = {10, 2, "adana", "true", 6, 10.5, "Stack"};
        System.out.println(action.arrFunc(objArr));

        //All params
        System.out.println(action.addressLines("Berkay", "Java", "Ahmet"));

        //Object use
        Settings settings = new Settings();
        System.out.println(action.useSetting(settings));
    }
}
