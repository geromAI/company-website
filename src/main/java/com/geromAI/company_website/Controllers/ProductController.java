package com.geromAI.company_website.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/products", "/{lang:en|el|fr}/products"})
public class ProductController {

    @GetMapping
    public String products(Model model) {
        model.addAttribute("currentPage", "products");

        return "website/products";
    }
}