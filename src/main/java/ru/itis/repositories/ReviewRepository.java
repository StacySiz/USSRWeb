package ru.itis.repositories;

import ru.itis.models.Game;
import ru.itis.models.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.itis.models.User;

import java.util.List;

@Repository
public interface ReviewRepository extends CrudRepository<Review,Long> {
    List<Review> findAll();

}
