package Static.Example;

public class ProductValidator {
    static {
        System.out.println("Static constructor çalıstı");
    }
    public ProductValidator(){
        System.out.println("Contrcutor çalıstı");
    }
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        }
        return false;
    }
}
