package ru.itis.services;

import ru.itis.models.Review;
import ru.itis.models.User;
import ru.itis.models.forms.ReviewForm;

import java.util.List;

public interface ReviewService {
    Review createReview(ReviewForm reviewForm,User reviewAuthor);

    List<Review> getAllReviews();

}
