package property;

import java.util.ArrayList;

public class Product {

    private String title;
    private int forexSell;
    private int price;
    private ArrayList<String> images;

    public Product() {

    }
    public Product(String title, int forexSell, int price) {
        this.title = title;
        this.forexSell = forexSell;
        this.price = price;
    }
    public Product(String title, int forexSell, int price, ArrayList<String> images) {
        this.title = title;
        this.forexSell = forexSell;
        this.price = price;
        this.images = images;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getForexSell() {
        return forexSell;
    }

    public void setForexSell(int forexSell) {
        this.forexSell = forexSell;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", forexSell=" + forexSell +
                ", price=" + price +
                ", images=" + images +
                '}';
    }
}
