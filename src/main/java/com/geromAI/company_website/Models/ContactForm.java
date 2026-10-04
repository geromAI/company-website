package com.geromAI.company_website.Models;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ContactForm {

    @NotBlank(message = "Please enter your name.")
    @Size(max = 100, message = "Name must be 100 characters or fewer.")
    private String name;


    @NotBlank(message = "Please enter your email address.")
    @Email(message = "Please enter a valid email address.")
    @Size(max = 254, message = "Email address is too long.")
    private String email;


    @Size(max = 150, message = "Company name must be 150 characters or fewer.")
    private String company;


    @NotBlank(message = "Please select a topic.")
    private String subject;


    @NotBlank(message = "Please enter a message.")
    @Size(
            min = 10,
            max = 5000,
            message = "Message must contain between 10 and 5000 characters."
    )
    private String message;


    @AssertTrue(message = "Please accept this before sending your message.")
    private boolean privacyAccepted;

}