package ru.itis.controllers;

import ru.itis.models.User;
import ru.itis.models.forms.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import ru.itis.services.UserServiceImpl;
import ru.itis.utils.UserValidator;


@Controller
public class RegistrationController {
//
//    @Autowired
//    @Qualifier("validator")
//    private UserValidator userValidator;

    @Autowired
    private UserServiceImpl userService;

//    @InitBinder("regForm")
//    public void addValidator(WebDataBinder dataBinder){
//        dataBinder.addValidators(userValidator);
//    }

    @GetMapping(value = "/registration")
    public String showRegForm(WebRequest request,Model model){
//        User newUser = new User();
//        model.addAttribute("user",newUser);
        return "registration";
    }

    @PostMapping(value = "/registration")
    public String registerUser(@ModelAttribute("user") User usAc,
                                      RegistrationForm registrationForm,
                                     BindingResult result, Errors errors) {
//        userValidator.validate(registrationForm,result);
//        registrationForm.re
//        if(result.hasErrors()){
//            return "registration";
//        }
        userService.registration(registrationForm);
        return "index";
    }
}
