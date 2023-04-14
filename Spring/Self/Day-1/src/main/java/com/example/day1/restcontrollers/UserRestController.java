package com.example.day1.restcontrollers;

import com.example.day1.entities.User;
import com.example.day1.utils.ERest;
import com.example.day1.utils.Result;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserRestController {
    List<User> user;
    Result rs = new Result();

    public UserRestController() {
        user = rs.users();
    }

    //http://localhost:8080/user/list
    @GetMapping("user/list")
    public Map getAllUser(@RequestParam(defaultValue = "") String name) {
        Map<ERest, Object> hm = new LinkedHashMap<>();
        hm.put(ERest.status, true);
        hm.put(ERest.message, "Success");
        hm.put(ERest.result, rs.userSearch(name));
        return hm;
    }

    @GetMapping("user/list/{data}")
    public Map getUser(@PathVariable String data) {
        Map<ERest, Object> hm = new LinkedHashMap<>();
        hm.put(ERest.status, true);
        hm.put(ERest.message, "Success");
        hm.put(ERest.result, rs.userSearch(data));
        return hm;
    }

    @PostMapping("/user/save")
    public Map userSave(@RequestParam int id, @RequestParam String name, @RequestParam String surname, @RequestParam String email) {
        Map<ERest, Object> hm = new LinkedHashMap<>();
        User u = new User(id,name,surname,email);
        user.add(u);
        hm.put(ERest.status, true);
        hm.put(ERest.message, "Success");
        hm.put(ERest.result,u);
        return hm;
    }
}
