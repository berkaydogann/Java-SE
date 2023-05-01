package com.works.controllers;

import com.works.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    UserService service = new UserService();
    int status = -1;
    int duid = 0;
    String message = "";
    int deleteStatus = 0;
    int timeStatu = 0;

    @GetMapping("/")
    public String home(Model model, @RequestParam(defaultValue = "1") int p) {
        model.addAttribute("users", service.users(p));
        model.addAttribute("status", status);
        model.addAttribute("message", message);
        model.addAttribute("duid", duid);
        int count = service.totalCount();
        model.addAttribute("count", count);
        int page = count % 50 == 0 ? count / 50 : (count / 50) + 1;
        model.addAttribute("page", page);
        model.addAttribute("p",p);
        status = -1;
        message = "";
        duid = 0;
        return "home";
    }

    @GetMapping("/userUndoDelete/{uid}")
    public String deleteUndoUserById(@PathVariable int uid, Model model) {
        status = service.deleteUndoUserById(uid);
        if (status > 0) {
            message = "Delete Success - " + uid;
            duid = uid;

        } else {
            message = "Delete Error - " + uid;
        }
        return "redirect:/";
    }

    @GetMapping("timer")
    public String timer() throws InterruptedException {
        timeStatu = service.timeStatu();
        return "redirect:/";
    }

    @GetMapping("/userDelete/{uid}")
    public String deleteUserById(@PathVariable int uid, Model model) {
        status = service.deleteUserById(uid);
        if (status > 0) {
            message = "Delete Success - " + uid;
        } else {
            message = "Delete Error - " + uid;
        }
        return "redirect:/";
    }

    @GetMapping("/undolast/{uid}")
    public String undoLastById(@PathVariable int uid, Model model) {
        deleteStatus = service.undoLastById(uid);
        if (deleteStatus > 0) {
            message = "Deleted data has been restored. -  " + uid;
        } else {
            message = "Deleted data could not be restored. - " + uid;
        }
        return "redirect:/";
    }

}
