import models.Product;
import models.User;

import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        /*DB db = new DB();
        Connection con1 = db.connect();
        db.close();
        System.out.println( con1.hashCode() );
        */

        /*User u = new User("Sultan", "Bilirim", "sultan@mail.com", "sulto", true, 56);
        Product p = new Product("Kalem", 123);
        UserService userService = new UserService();
        ProductService productService = new ProductService();
        int statusInsert = userService.save(u);
        int statusDelete = userService.delete(101);
        if (statusInsert > 0) {
            System.out.println(statusInsert);
        } else {
            System.out.println("Duplicate Email entry Problem");
        }
        System.out.println("statusDelete: " + statusDelete);

        User u = new User("Sultan", "Bilirim", "sultan@mail.com", "newAswv", true, 56);
        u.setUid(1101);
        UserService userService = new UserService();
        userService.update(u);

        UserService userService = new UserService();
        List<User> ls = userService.allList();
        for (User item : ls) {
            System.out.println("uid: " + item.getUid() + " Name: " + item.getName() + " surname: " + item.getSurname() + " password: " + item.getPassword());
        }
        */
        UserService userService = new UserService();
        List<User> ls = userService.userSearch("ali");
        for (User item : ls) {
            System.out.println("uid: " + item.getUid() + " Name: " + item.getName() + " surname: " + item.getSurname() + " email: " + item.getEmail());
        }
    }
}
