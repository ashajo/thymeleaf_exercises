package se.lexicon.thymeleaf_exercises.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Home {


    @GetMapping("/index")
    public String Index() {
        return "index";
    }
}







