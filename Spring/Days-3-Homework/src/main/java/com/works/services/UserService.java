package com.works.services;

import com.works.prop.User;
import com.works.utils.DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    public List<User> users() {
        List<User> ls = new ArrayList<>();
        DB db = new DB();
        try {
            String sql = "select * from users where deleteStatu=0 order by uid desc";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setUid(rs.getInt("uid"));
                u.setName(rs.getString("name"));
                u.setSurname(rs.getString("surname"));
                u.setEmail(rs.getString("email"));
                u.setDate(rs.getString("date"));
                u.setDeleteStatus(rs.getInt("deleteStatu"));
                ls.add(u);
            }
        } catch (Exception ex) {
            System.err.println("Users Error : " + ex);
        } finally {
            db.close();
        }
        return ls;
    }

    public int deleteUndoUserById(int uid) {
        int status = 0;
        DB db = new DB();
        try {
            String sql = "update users set `deleteStatu` = 1 where uid = ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1, uid);
            status = pre.executeUpdate();
        } catch (Exception ex) {
            System.err.println("Users Delete Error : " + ex);
        } finally {
            db.close();
        }
        return status;
    }

    public int timeStatu() throws InterruptedException {
        Thread.sleep(5000);
        return 1;
    }

    public int deleteUserById(int uid) {
        int status = 0;
        DB db = new DB();
        try {
            String sql = "delete from users where uid = ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1, uid);
            status = pre.executeUpdate();
        } catch (Exception ex) {
            System.err.println("Users Delete Error : " + ex);
        } finally {
            db.close();
        }
        return status;
    }

    public int undoLastById(int uid) {
        int deleteStatus = 0;
        DB db = new DB();
        try {
            String sql = "update users set `deleteStatu` = 0 where uid = ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1, uid);
            deleteStatus = pre.executeUpdate();
        } catch (Exception ex) {
            System.err.println("Users Delete Error : " + ex);
        } finally {
            db.close();
        }
        return deleteStatus;
    }

    public int userSave(User user){
        int status = 0;
        DB db = new DB();
        try {
            String sql = "insert into users(uid,name,surname,email,password,status,age,date,deleteStatu) values (null,?,?,?,?,1,?,now(),0)";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1,user.getName());
            pre.setString(2,user.getSurname());
            pre.setString(3,user.getEmail());
            pre.setString(4,user.getPassword());
            pre.setInt(5,user.getAge());
            status = pre.executeUpdate();
        } catch (Exception ex) {
            System.err.println("Users Save Error : " + ex);
        } finally {
            db.close();
        }
        return status;
    }

}
