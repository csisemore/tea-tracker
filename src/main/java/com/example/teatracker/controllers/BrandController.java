package com.example.teatracker.controllers;

import com.example.teatracker.models.Brand;
import com.example.teatracker.models.data.BrandDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;

@Controller
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandDao brandDao;

    @RequestMapping(value = "")
    public  String index(Model model){
        model.addAttribute("title", "Tea Brands");
        model.addAttribute("brand", brandDao.findAll());

        return "brand/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
          public String displayAddBrandForm(Model model){
              model.addAttribute("title", "Add Brand");
              model.addAttribute(new Brand());

              return "brand/add";
         }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddBrandForm(@ModelAttribute @Valid Brand brand, Errors errors, Model model){
        if (errors.hasErrors()){
                  model.addAttribute("title", "Add Brand");
                  return "brand/add";
              }
        brandDao.save(brand);
        return "redirect:";
    }


}

