package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.models.User;
import ru.itis.services.UserAuthenticationService;

@Controller
public class ProfileController {

    @Autowired
    private UserAuthenticationService authenticationService;

    @GetMapping("/profile")
    public String showProfile(Authentication authentication, Model model){
        if(authentication!=null) {
            User user = authenticationService.getUserByAuthentication(authentication);
            System.out.println("THIS IS FROM PROFILE CONTROLLER " + user.getEmail());
            model.addAttribute("user",user);
            return "profile";
        }
        return "redirect:/index";
    }
}
