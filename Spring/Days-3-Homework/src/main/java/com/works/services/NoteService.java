package com.works.services;

import com.works.prop.Note;
import com.works.utils.DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NoteService {

    public List<Note> notes() {
        List<Note> nls = new ArrayList<>();
        DB db = new DB();
        try {
            String sql = "select * from notes";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                Note note = new Note();
                note.setNoteId(rs.getInt("noteId"));
                note.setTitle(rs.getString("title"));
                note.setDetail(rs.getString("detail"));
                nls.add(note);
            }
        } catch (Exception ex) {
            System.err.println("Notes error: " + ex);
        } finally {
            db.close();
        }
        return nls;
    }

    public int noteSave(Note note) {
        int status = 0;
        DB db = new DB();
        try {
            String sql = "insert into notes(noteId,title,detail) values (null,?,?)";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1, note.getTitle());
            pre.setString(2, note.getDetail());
            status = pre.executeUpdate();
        } catch (Exception ex) {
            System.err.println("Users Save Error : " + ex);
        } finally {
            db.close();
        }
        return status;
    }

    public int noteDelete(int noteId) {
        int status = 0;
        DB db = new DB();
        try {
            String sql = "delete from notes where noteId=?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1, noteId);
            status = pre.executeUpdate();
        } catch (Exception ex) {
            System.err.println("Users Save Error : " + ex);
        } finally {
            db.close();
        }
        return status;
    }
}
