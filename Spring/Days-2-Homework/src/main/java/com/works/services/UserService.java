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
            String sql = "select * from users where deleteStatu=0";
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

}
