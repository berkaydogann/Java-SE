package com.works.prop;

import lombok.Data;

@Data
public class User {
    private int uid;
    private String name;
    private String surname;
    private String email;
    private String password;
    private Integer age;
    private String date;
    private int deleteStatus;
    private String remember;
}
