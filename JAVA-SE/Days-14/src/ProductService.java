import models.Product;

import java.sql.PreparedStatement;

public class ProductService {
    DB db = new DB();

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
}
