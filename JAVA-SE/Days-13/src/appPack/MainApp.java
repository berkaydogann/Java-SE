package appPack;

import java.util.Locale;
import java.util.spi.LocaleServiceProvider;

public class MainApp {
    public static void main(String[] args) {

        String words = "Hello Word";
        String wordx = new String("Hello Word");
        String java = "Java Programming     ";
        String data = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a " +
                "galley of type and scrambled it to make a type specimen book.";

        System.out.println("Size:" + data.length());

        char[] arr = data.toCharArray();
        boolean isDigit = true;
        for (char item : arr) {
            if (!Character.isDigit(item)) {
                //System.out.println(item);
                isDigit = false;
            }
        }
        System.out.println("isDigit: " + isDigit);

        byte[] bytes = data.getBytes();
        System.out.println(bytes[0]);

        String lower = data.toLowerCase(new Locale("tr", "TR"));
        System.out.println(lower);

        String[] wordsArr = data.split("\\.");
        System.out.println(wordsArr.length);

        boolean status = data.contains("make");
        System.out.println(status);

        int typeNo = data.compareToIgnoreCase("type");
        System.out.println(typeNo);

        if ("Hello word".equalsIgnoreCase(words)) {
            System.out.println("EqualsIgnoreCase true");
        } else {
            System.out.println("EqualsIgnoreCase false");
        }

        int index = data.indexOf("dummy");
        System.out.println("index: " + index);

        String newString = data.replaceAll("Lorem", "Berkay");
        System.out.println(newString);

        String subString = data.substring(index, index + "dummy".length());
        System.out.println(subString);

        String newJava = java.trim();
        System.out.println(newJava);
    }
}
