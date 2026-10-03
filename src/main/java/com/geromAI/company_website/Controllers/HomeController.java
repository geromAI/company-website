package com.geromAI.company_website.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/{lang:en|el|fr}"})
public class HomeController {

    @GetMapping
    public String home() {
        return "website/home";
    }
}