package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.itis.models.User;
import ru.itis.services.UserAuthenticationService;

@Controller
public class SignInController {

    @Autowired
    UserAuthenticationService authenticationService;

    @GetMapping("/signIn")
    public String showSignIn(){
        return "signIn";
    }

    @PostMapping("/signIn")
    public String auth(Authentication authentication,Model model) {
            User user = authenticationService.getUserByAuthentication(authentication);

            return "index";
    }
}
