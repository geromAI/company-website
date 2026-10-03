package com.geromAI.company_website.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/contact", "/{lang:en|el|fr}/contact"})
public class ContactController {

    @GetMapping
    public String contact() {
        return "website/contact";
    }
}