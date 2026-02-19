package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/root")
public class HomeController {


    @GetMapping("/home")
    public String openHomePage(Model model) {
        ArrayList<Item> allItems = DBManager.getAllItems();
        model.addAttribute("items", allItems);
        return "home";
    }






}
