package com.example.customerapplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    Customerrepository customerrepository;

    @RequestMapping("/")
    public String listCustomer(Model model){
      //model.addAttribute("customers", customerrepository.findByName(lastname));
        model.addAttribute("customers", customerrepository.findAll());
        return "index";
    }
//    @GetMapping("/search")
//    public String searchpage(Model model){
//        model.addAttribute("customer", new Customer());
//        return("search");
//    }
    @PostMapping("/search")
   public String loadFromPage(@RequestParam("lastname") String lastname, Model model){
        model.addAttribute("customers", customerrepository.findBylastname(lastname));
        return "search";
    }
}
