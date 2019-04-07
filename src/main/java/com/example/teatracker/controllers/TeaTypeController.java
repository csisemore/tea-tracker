package com.example.teatracker.controllers;


import com.example.teatracker.models.TeaType;
import com.example.teatracker.models.data.TeaDao;
import com.example.teatracker.models.data.TeaTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("teatype")
public class TeaTypeController {

    @Autowired
    private TeaTypeDao teaTypeDao;

    @Autowired
    private TeaDao teaDao;

//    private Object teatype;

    @RequestMapping(value = "")
    public String index(Model model, Object TeaType, Object add){
        model.addAttribute("title","Tea Types");
        model.addAttribute("tea types", teaTypeDao.findAll());

//        return "teatype/add";
        //return "/teatype/index";
        return "teatype/index";
    }
    @RequestMapping(value = "add", method = RequestMethod.GET)
    //@RequestMapping(value = "/add", method = RequestMethod.GET)
    public String displayAddTeaTypeForm(Model model){
        model.addAttribute("title", "Add Tea Type");
        model.addAttribute(new teaType());

        return "teatype/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)

    public String processAddTeaTypeForm(@ModelAttribute @Valid TeaType teaType, Errors errors, Model model){
        if (errors.hasErrors()){
            model.addAttribute("title", "Add Brand");
            return "teatype/add";
        }
        teaTypeDao.save(teaType);
        return "redirect:";
    }

    private class teaType {
    }
}
