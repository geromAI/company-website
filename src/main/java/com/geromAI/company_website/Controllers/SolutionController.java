package com.geromAI.company_website.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/solutions", "/{lang:en|el|fr}/solutions"})
public class SolutionController {

    @GetMapping
    public String solutions() {
        return "website/solutions";
    }
}