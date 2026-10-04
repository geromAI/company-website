package com.geromAI.company_website.Controllers;

import com.geromAI.company_website.Models.ContactForm;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping({"/contact", "/{lang:en|el|fr}/contact"})
public class ContactController {


    @GetMapping
    public String contact(Model model) {

        model.addAttribute("currentPage", "contact");

        if (!model.containsAttribute("contactForm")) {

            model.addAttribute("contactForm", new ContactForm());

        }

        return "website/contact";
    }


    @PostMapping
    public String submitContact(

            @Valid @ModelAttribute("contactForm") ContactForm contactForm,

            BindingResult bindingResult,

            Model model,

            RedirectAttributes redirectAttributes) {

        model.addAttribute("currentPage", "contact");


        /*
         * VALIDATION FAILED
         */

        if (bindingResult.hasErrors()) {

            return "website/contact";

        }

        /*
         * --------------------------------------------------
         * TODO
         * --------------------------------------------------
         *
         * Send email here.
         *
         * Later:
         *
         * contactService.send(contactForm);
         *
         */


        redirectAttributes.addFlashAttribute("contactSuccess", true);


        return "redirect:/contact";
    }

}