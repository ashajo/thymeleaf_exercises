package se.lexicon.thymeleaf_exercises.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import se.lexicon.thymeleaf_exercises.dto.TempService;


@Controller
public class Fever {
    @GetMapping("/feverHome")

    public String FeverPage(Model model){
        TempService tempService=new TempService();
        model.addAttribute("tempService",tempService);
        return "FeverHome";
    }


}
