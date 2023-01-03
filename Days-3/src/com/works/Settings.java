package com.works;

public class Settings {
    public String profilName(int userId) {
        String data = "";
        if (userId == 10) {
            data = "Ali Bilmem";
        } else if (userId == 20) {
            data = "Erkan Bilsin";
        } else if (userId == 30) {
            data = "Zehre Kas";
        }
        return data;
    }
}
