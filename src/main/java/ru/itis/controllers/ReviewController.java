package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.models.Review;
import ru.itis.models.User;
import ru.itis.models.forms.ReviewForm;
import ru.itis.repositories.ReviewRepository;
import ru.itis.services.ReviewService;
import ru.itis.services.UserAuthenticationService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @Autowired
    private UserAuthenticationService authenticationService;

    private List<User> authors = new ArrayList<>();


    @GetMapping("/addReview")
    public String getPage(Authentication authentication, ReviewForm reviewForm) {
    if (authentication==null){
        return "redirect:/signIn";
    }

        return "review-form";
    }

    @PostMapping("addReview")
    public String sendReview(Authentication authentication, ReviewForm reviewForm){
        User reviewAuthor = authenticationService.getUserByAuthentication(authentication);
        System.out.println("THE USER FROM REVIEW CONTROLLER IS " + reviewAuthor);
        reviewService.createReview(reviewForm,reviewAuthor);

        return "redirect:/reviews";
    }

    @GetMapping("/reviews")
    public String getAllReviews(Model model){
        List<Review> allReviews = reviewService.getAllReviews();
        model.addAttribute("allReviews",allReviews);

        for (Review review : allReviews){
            User author = review.getUser();
//            System.out.println("LET'S ADD AN AUTHOR "+author.getEmail());
                authors.add(author);
        }

        model.addAttribute("allAuthors",authors);
        System.out.println("THESE ARE THE AUTHORS "+ authors);

        return "reviews";
    }

}
