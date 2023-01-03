package com.works;

public class Action {

    int age = 30;

    //No parameter no return
    //void -> return olmadıgını ifade eder
    public void noParameter() {
        System.out.println("noParametre() called.");
    }

    //No return
    public void noReturn(String data, int age) {
        System.out.println(data + ":" + age);
    }

    //Return
    public int size(String data) {
        return data.length();
    }

    //Array parameter func
    public String arrFunc(Object[] objects) {
        String data = "";
        for (Object item : objects) {
            if (item instanceof String) {
                String str = String.valueOf(item);
                data += str + " ";
            }
        }
        return data;
    }

    //All params

    /**
     * Kullanicidan gelen adres satırlarının eklenerek yazılmasını sağlar.
     *
     * @param arr String...
     * @return String
     */
    public String addressLines(String... arr) {
        String data = "";
        for (String item : arr) {
            data += item + " ";
        }
        return data;
    }

    //Object func
    public String useSetting(Settings settings) {
        String name = settings.profilName(10);
        return name;
    }
}
