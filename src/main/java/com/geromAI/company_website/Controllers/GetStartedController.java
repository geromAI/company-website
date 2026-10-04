package com.geromAI.company_website.Controllers;

import com.geromAI.company_website.Models.ProjectForm;

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
@RequestMapping({"/get-started", "/{lang:en|el|fr}/get-started"})
public class GetStartedController {


    @GetMapping
    public String getStarted(Model model) {

        model.addAttribute("currentPage", "get-started");


        if (!model.containsAttribute("projectForm")) {

            model.addAttribute("projectForm", new ProjectForm());

        }


        return "website/get-started";
    }


    @PostMapping
    public String submitProject(

            @Valid @ModelAttribute("projectForm") ProjectForm projectForm,

            BindingResult bindingResult,

            Model model,

            RedirectAttributes redirectAttributes) {

        model.addAttribute("currentPage", "get-started");

        if (bindingResult.hasErrors()) {

            return "website/get-started";

        }

        /*
         * Later:
         *
         * projectEnquiryService.submit(projectForm);
         *
         * This can:
         *
         * 1. Save the enquiry in the database
         * 2. Email geromAI
         * 3. Send confirmation to the customer
         */


        redirectAttributes.addFlashAttribute("projectSuccess", true);


        return "redirect:/get-started";
    }

}