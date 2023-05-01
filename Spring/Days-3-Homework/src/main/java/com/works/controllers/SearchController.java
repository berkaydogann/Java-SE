package com.works.controllers;

import com.works.prop.User;
import com.works.services.SearchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {
    SearchService searchService = new SearchService();

    @GetMapping("/search")
    public String search(@RequestParam(defaultValue = "") String q, Model model) {
        List<User> ls = searchService.search(q);
        model.addAttribute("users", ls);
        model.addAttribute("q", q);
        return "search";
    }
}
