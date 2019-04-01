package com.example.teatracker.controllers;


import com.example.teatracker.models.data.TeaDao;
import com.example.teatracker.models.data.TeaTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("TeaType")
public class TeaTypeController {

    @Autowired
    private TeaTypeDao teaTypeDao;

    @Autowired
    private TeaDao teaDao;

//    private Object TeaType;

    @RequestMapping(value = "")
    public String index(Model model, Object TeaType, Object add){
        model.addAttribute("title","Tea Types");
        model.addAttribute("tea types", teaTypeDao.findAll());

        return "TeaType/add";
    }

}
