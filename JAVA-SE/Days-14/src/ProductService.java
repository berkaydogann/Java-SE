import models.Product;
import models.ProductJoin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductService {
    private DB db = new DB();

    public int save(Product product) {
        int status = 0;
        try {
            String sql = "insert into product value(null, ?,?)";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1, product.getTitle());
            pre.setInt(2, product.getPrice());
            status = pre.executeUpdate();
        } catch (Exception ex) {
            System.err.println("Product save error: " + ex);
        } finally {
            db.close();
            ;
        }
        return status;
    }

    public void list() {
        Connection con = db.connect();
        try {
            String sql = "Select p.pid, p.title, p.price,c.ctitle from product as p inner join  product_category pc on p.pid = pc.pid inner join category c on pc.cid = c.cid";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int pid = rs.getInt("pid");
                String title = rs.getString("title");
                int price = rs.getInt("price");
                String ctitle = rs.getString("ctitle");

                ProductJoin p = new ProductJoin(pid, title, price, ctitle);
                System.out.println(p);
            }
        } catch (Exception ex) {
            System.err.println("Product List error: " + ex);
        } finally {
            db.close();
        }
    }
}
