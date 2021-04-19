package se.lexicon.thymeleaf_exercises.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import se.lexicon.thymeleaf_exercises.dto.Contact;


import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Home {
   List<Contact>contactList=new ArrayList<>();

   @PostConstruct
   public void init(){
       contactList=new ArrayList<>();

   }

    @GetMapping("/index")
    public String Index() {
        return "index";
    }

    @GetMapping("/contact")
    public String Contact(Model model){
       Contact contact=new Contact();
       model.addAttribute("contact",contact);
        return "contact";

    }
    @GetMapping("/contactList")
    public String contactList(Model model){
    model.addAttribute("contactList",contactList);
       return "contact";

    }

    @GetMapping("/about")
    public String About(){
        return "about";
    }

}







