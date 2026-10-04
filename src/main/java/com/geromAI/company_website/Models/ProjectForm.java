package com.geromAI.company_website.Models;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
public class ProjectForm {

    @NotBlank(message = "Please enter your name.")
    @Size(max = 100)
    private String name;


    @NotBlank(message = "Please enter your email address.")
    @Email(message = "Please enter a valid email address.")
    @Size(max = 254)
    private String email;


    @Size(max = 150)
    private String company;


    @Size(max = 100)
    private String role;


    @Size(max = 150)
    private String projectName;


    @NotBlank(message = "Please select a project type.")
    private String projectType;


    private List<String> services = new ArrayList<>();


    @NotBlank(message = "Please select the current project stage.")
    private String stage;


    @NotBlank(message = "Please select a target timeline.")
    private String timeline;


    private String budget;


    @NotBlank(message = "Please tell us about your project.")
    @Size(
            min = 20,
            max = 8000,
            message = "Project description must contain between 20 and 8000 characters."
    )
    private String description;


    @Size(max = 500)
    private String reference;


    @AssertTrue(
            message = "Please accept this before submitting your project."
    )
    private boolean privacyAccepted;
}