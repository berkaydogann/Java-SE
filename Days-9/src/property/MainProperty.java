package property;

import java.util.ArrayList;

public class MainProperty {
    public static void main(String[] args) {

        ArrayList<String> ls = new ArrayList<>();
        ls.add("Product-1");
        ls.add("Product-2");
        ls.add("Product-3");
        ls.add("Product-4");
        ls.add("Product-5");
        ls.add("Product-6");

        for (String item : ls) {
            System.out.println(item);
        }

        System.out.println("================");

        Product product = new Product();
        product.setTitle("Ürün - 1");
        product.setPrice(89);
        product.setForexSell(100);

        System.out.println(product.getTitle());
        System.out.println(product.getPrice());
        System.out.println(product.getForexSell());

        //Property For ArrayList
        //<> generic type denir.
        System.out.println("\n----Property For ArrayList----");
        ArrayList<Product> list = new ArrayList<>();

        Product p1 = new Product("Ürün - 2", 1000, 1100);
        list.add(p1);

        Product p2 = new Product("Ürün - 3", 16000, 14500);
        list.add(p2);

        Product p3 = new Product("Ürün - 4", 8000, 7000);
        list.add(p3);

        ArrayList<String> images = new ArrayList<>();
        images.add("img-1.jpg");
        images.add("img-2.jpg");
        images.add("img-3.jpg");
        Product p4 = new Product();
        p4.setTitle("Ürün -5");
        p4.setPrice(14124);
        p4.setForexSell(15000);
        p4.setImages(images);
        list.add(p4);

        System.out.println("Size: " + list.size());

        for (Product item : list) {
            System.out.println(item);
        }

    }

}
