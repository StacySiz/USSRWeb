package controllers;

import models.User;
import models.forms.RegistrationForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import services.UserServiceImpl;
import utils.UserValidator;

import javax.validation.Valid;


@Controller
public class RegistrationController {

    private UserValidator userValidator;
    UserServiceImpl userService;
//    RegistrationForm

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String showRegForm(WebRequest request,Model model){
        User newUser = new User();
        model.addAttribute("user",newUser);
        return "registration";
    }

    @RequestMapping(value = "/registration",method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("user") @Valid User usAc,
                                     RegistrationForm registrationForm,
                                     BindingResult result, Errors errors) {
        userValidator.validate(registrationForm,result);
//        registrationForm.re
        if(result.hasErrors()){
            return "registration";
        }
        userService.registration(registrationForm);
        return "index";
    }
}
