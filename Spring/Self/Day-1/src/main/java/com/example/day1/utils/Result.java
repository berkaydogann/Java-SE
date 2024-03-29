package com.example.day1.utils;

import com.example.day1.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Result {

    public List<User> users() {
        List<User> ls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User u = new User(i, "name" + i, "surname" + i, "email@mail.com" + i);
            ls.add(u);
        }
        return ls;
    }

    public List userSearch(String q, List<User> ls) {
        return ls
                .stream()
                .filter(item -> item.getName().toLowerCase().contains(q.toLowerCase()))
                .collect(Collectors.toList());
    }
}
