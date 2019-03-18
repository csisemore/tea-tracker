package com.example.teatracker.controllers;


import com.example.teatracker.models.data.BrandDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandDao brandDao;

    @RequestMapping(value = "")
    public  String index(Model model){
        model.addAttribute("title", "Brands");
        //model.addAttribute("brands", brandDao.findAll());
        model.addAttribute("brand_name", brandDao.findAll());


        return "brand/index";
    }
}
