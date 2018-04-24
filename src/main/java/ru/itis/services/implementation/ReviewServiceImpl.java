package ru.itis.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.models.Review;
import ru.itis.models.User;
import ru.itis.models.forms.ReviewForm;
import ru.itis.repositories.GameRepository;
import ru.itis.repositories.ReviewRepository;
import ru.itis.repositories.UserRepository;
import ru.itis.services.ReviewService;

import java.util.Date;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private GameRepository gameRepository;

    public Review createReview(ReviewForm reviewForm,User reviewAuthor){
        Date date = new Date();
        User user = userRepository.findById(5);

        Review newReview = Review.builder()
//                .user(user)
                .user(reviewAuthor)
                .game(gameRepository.findByGameTitle(reviewForm.getGameTitle()))
                .reviewName(reviewForm.getReviewName())
                .reviewDate(String.valueOf(date))
                .description(reviewForm.getDescription())
                .score(reviewForm.getScore())
                .build();
        System.out.println("THE AUTHOR OF REVIEW IS " + newReview.getUser().getFirstName());
        System.out.println("THE GAME NAME IS " + newReview.getGame().getGameTitle());
        System.out.println("THE REVIEW NAME IS " + newReview.getReviewName());
        System.out.println("THE REVIEW'S DESCRIPTION IS " + newReview.getDescription());
        System.out.println("THE REVIEW'S SCORE IS " + newReview.getScore());

        reviewRepository.save(newReview);
        return newReview;
    }

    public List<Review> getAllReviews(){
        return reviewRepository.findAll();
    }

}
