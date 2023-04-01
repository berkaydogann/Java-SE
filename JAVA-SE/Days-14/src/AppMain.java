import models.Product;
import models.User;

public class AppMain {
    public static void main(String[] args) {
        /*DB db = new DB();
        Connection con1 = db.connect();
        db.close();
        System.out.println( con1.hashCode() );
        */

        User u = new User("Sultan", "Bilirim", "sultan@mail.com", "sulto", true, 56);
        Product p = new Product("Kalem", 123);
        UserService userService = new UserService();
        ProductService productService = new ProductService();
        int status = userService.save(u);

        if (status > 0) {
            System.out.println(status);
        } else {
            System.out.println("Duplicate Email entry Problem");
        }

    }
}
