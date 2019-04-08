package com.example.teatracker.controllers;

import com.example.teatracker.models.Brand;
import com.example.teatracker.models.Tea;
import com.example.teatracker.models.TeaType;
import com.example.teatracker.models.data.BrandDao;
import com.example.teatracker.models.data.TeaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("tea", teaDao.findAll());
        model.addAttribute("title", "Teas");

        return "tea/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddTeaForm(Model model){
        model.addAttribute("title", "Add Tea");
        model.addAttribute(new Tea());
        model.addAttribute("brands", brandDao.findAll());

        return "tea/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    //public String processAddTeaForm(@ModelAttribute @Valid Tea newTea, Errors errors, @RequestParam int brandId, Model model){
    public String processAddTeaForm(@ModelAttribute @Valid Tea newTea, Errors errors, @RequestParam int brand_id, Model model){
    //public String processAddTeaForm(@ModelAttribute @Valid Tea newTea, Errors errors, @RequestParam int id, Model model){
    //public String processAddTeaForm(@ModelAttribute @Valid Tea newTea, Errors errors, @RequestParam int, Model model){
        if (errors.hasErrors()){
            model.addAttribute("title", "Add Tea");
            return "tea/add";
        }


        //Brand brand = brandDao.findOne(brandId);
        Brand brand = brandDao.findOne(brand_id);
        //Brand brand = brandDao.findOne(brand.id);
        newTea.setBrand(brand);
        teaDao.save(newTea);

        //return "tea/add";
        return "redirect:";

    }
}

