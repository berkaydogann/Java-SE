package com.example.day1.restcontrollers;

import com.example.day1.entities.User;
import com.example.day1.utils.ERest;
import com.example.day1.utils.Result;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserRestController {
    List<User> ls = new ArrayList<>();
    Result rs = new Result();

    public UserRestController() {
        ls = rs.users();
    }

    //http://localhost:8080/user/list
    @GetMapping("/list")
    public Map getAllUser(@RequestParam(defaultValue = "") String name) {
        Map<ERest, Object> hm = new LinkedHashMap<>();
        hm.put(ERest.status, true);
        hm.put(ERest.message, "Success");
        hm.put(ERest.result, ls);
        return hm;
    }

    @GetMapping("/list/{data}")
    public Map getUser(@PathVariable String data) {
        Map<ERest, Object> hm = new LinkedHashMap<>();
        hm.put(ERest.status, true);
        hm.put(ERest.message, "Success");
        hm.put(ERest.result, rs.userSearch(data, ls));
        return hm;
    }

    @PostMapping("/save")
    public Map userSave(@RequestBody User u) {
        Map<ERest, Object> hm = new LinkedHashMap<>();
        ls.add(u);
        hm.put(ERest.status, true);
        hm.put(ERest.message, "Success");
        hm.put(ERest.result, ls);
        return hm;
    }

    @DeleteMapping("/delete/{index}")
    public Map userDeleteById(@PathVariable int index) {
        Map<ERest, Object> hm = new LinkedHashMap<>();
        try {
            ls.remove(index);
            hm.put(ERest.status, true);
            hm.put(ERest.message, "Success");
        } catch (Exception ex) {
            hm.put(ERest.status, false);
            hm.put(ERest.message, "Delete Fail: " + ex.getMessage());
        }
        return hm;
    }
}
