package ru.itis.repositories;

import ru.itis.models.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends CrudRepository<Game,Long> {
    Game findById(Long id);
    Game findByGameTitle(String gameTitle);
    List<Game> findAll();
}
