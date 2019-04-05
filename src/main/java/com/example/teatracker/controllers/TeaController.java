package com.example.teatracker.controllers;

import com.example.teatracker.models.Tea;
import com.example.teatracker.models.data.BrandDao;
import com.example.teatracker.models.data.TeaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("tea")
public class TeaController {

    @Autowired
    private TeaDao teaDao;

    @Autowired
    private BrandDao brandDao;


    @RequestMapping(value = "")
    public  String index(Model model){
        model.addAttribute("title", "Teas");
        model.addAttribute("tea", teaDao.findAll());

        return "tea/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddTeaForm(Model model){
        model.addAttribute("title", "Add Tea");
        model.addAttribute(new Tea());

        return "tea/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddTeaForm(@ModelAttribute @Valid Tea tea, Errors errors, Model model){
        if (errors.hasErrors()){
            model.addAttribute("title", "Add Brand");
            return "tea/add";
        }


//        Brand brand = BrandDao.findOne(brand_id);
//        newTea.setBrand(brand);
//        teaDao.save(newTea);

        return "redirect:";

    }
}

