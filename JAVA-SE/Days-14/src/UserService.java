import models.User;

import java.sql.Connection;
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

    public int delete(int uid) {
        int status = 0;
        try {
            String sql = "delete from users where uid = ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1, uid);
            status = pre.executeUpdate();
        } catch (Exception ex) {
            System.err.println("Delete Error: " + ex);
        } finally {
            db.close();
        }
        return status;
    }

    public int update(User user) {
        int status = 0;
        try {
            String sql = "update users set name = ?, surname = ?, email = ?, password = ?, status = ?, age = ? where uid = ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1, user.getName());
            pre.setString(2, user.getSurname());
            pre.setString(3, user.getEmail());
            pre.setString(4, user.getPassword());
            pre.setBoolean(5, user.getStatus());
            pre.setInt(6, user.getAge());
            pre.setInt(7, user.getUid());
            status = pre.executeUpdate();
        } catch (Exception ex) {
            System.err.println("Update Error: " + ex);
        } finally {
            db.close();
        }
        return status;
    }
}
