package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.models.User;
import ru.itis.services.UserAuthenticationService;

@Controller
public class SignInController {

    @Autowired
    private UserAuthenticationService authenticationService;

    @GetMapping("/signIn")
    public String showSignIn(Authentication authentication) {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        User user1 = (User) auth.getPrincipal();
//        System.out.println("THIS PRINCIPAL IS FROM SIGN IN " + user1.getEmail());
//        System.out.println("THIS IS FROM SIGN IN" +name);
//        if (name!=null){
//            return "redirect:/";
//
//        }
        if (authentication!=null) {
            User user = authenticationService.getUserByAuthentication(authentication);
            System.out.println("THIS IS FROM SIGN IN CONTROLLER " + user.getEmail());
            return "redirect:/profile";
        }
//        System.out.println("AUTH IS NULL");

        return "signIn";
    }

    @PostMapping("/signIn")
    public String root(Authentication authentication) {
        if (authentication != null) {
            User user = authenticationService.getUserByAuthentication(authentication);
            System.out.println("THIS IS FROM SIGN IN CONTROLLER " + user.getEmail());
//
//            return "redirect:/profile";
        }
        return "redirect:/profile";
    }
//    @PostMapping("/signIn")
//    public String auth(Model model) {
////        User user = authenticationService.getUserByAuthentication(authentication);
////        System.out.println("THIS IS FROM SIGN IN CONTROLLER " +user.getEmail() );
//
//        return "index";
//    }
}
