package Static.Example;

public class ProductManager {
    public void add(Product product) {

        if (ProductValidator.isValid(product)) {
            System.out.println(product.name + " isimli ürün " + product.price + " fiyatı ile eklendi.");
        } else {
            System.err.println("Ürün bilgileri geçersizdir.");
        }

    }
}
