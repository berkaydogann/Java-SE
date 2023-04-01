import models.User;

import java.sql.PreparedStatement;

public class UserService {
    DB db = new DB();

    public int save(User user) {
        int status = 0;
        try {
            String sql = "insert into users value(null,?,?,?,?,?,?, now() )";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1, user.getName());
            pre.setString(2, user.getSurname());
            pre.setString(3, user.getEmail());
            pre.setString(4, user.getPassword());
            pre.setBoolean(5, user.getStatus());
            pre.setInt(6, user.getAge());
            status = pre.executeUpdate();

        } catch (Exception ex) {
            System.err.println("Save Error: " + ex);
        } finally {
            db.close();
        }
        return status;
    }
    
}
