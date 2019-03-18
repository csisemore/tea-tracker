package com.example.teatracker.controllers;

import com.example.teatracker.models.data.TeaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tea")
public class TeaController {
    @Autowired
    private TeaDao teaDao;

    @RequestMapping(value = "")
    public  String index(Model model){
        model.addAttribute("title", "Teas");
        model.addAttribute("brands", teaDao.findAll());

        return "tea/index";
    }
}

