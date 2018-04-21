package ru.itis.controllers;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.itis.models.forms.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import ru.itis.services.implementation.UserRegistrationServiceImpl;
import ru.itis.utils.UserValidator;

import javax.validation.Valid;


@Controller
public class RegistrationController {

    @Autowired
    private UserValidator userValidator;

    @Autowired
    private UserRegistrationServiceImpl userService;

    @InitBinder("regForm")
    public void addValidator(WebDataBinder dataBinder){
        dataBinder.addValidators(userValidator);
    }

    @GetMapping(value = "/registration")
    public String showRegForm(){
        return "registration";
    }

    @PostMapping(value = "/registration")
    public String registerUser(@Valid @ModelAttribute(name = "regForm") RegistrationForm registrationForm,
                                     BindingResult result, RedirectAttributes attributes) {
//        userValidator.validate(registrationForm,result);
//        if(result.hasErrors()){
////            attributes.addFlashAttribute("error", result.getAllErrors().get(0).getDefaultMessage());
//            attributes.addAttribute("error",result.getAllErrors());
//
//            return "registration";
//        }
        System.out.println("This name is from controller's regForm "  + registrationForm.getFirstName());
        System.out.println("This password is  from controller's regForm "  + registrationForm.getPassword());
        userService.registration(registrationForm);
        return "redirect:/index";
    }
}
