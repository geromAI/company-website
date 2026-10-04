package com.geromAI.company_website.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/about", "/{lang:en|el|fr}/about"})
public class AboutController {

    @GetMapping
    public String about(Model model) {
        model.addAttribute("currentPage", "about");
        return "website/about";
    }
}