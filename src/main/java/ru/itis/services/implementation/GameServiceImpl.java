package ru.itis.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.models.Game;
import ru.itis.models.forms.GameForm;
import ru.itis.repositories.GameRepository;
import ru.itis.services.GameService;

@Service
public class GameServiceImpl implements GameService {
    @Autowired
    GameRepository gameRepository;

    @Override
    public Game createGame(GameForm gameForm) {
        Game newGame = new Game();
        newGame.setGameTitle(gameForm.getGameTitle());
        newGame.setGenre(gameForm.getGenre());
        newGame.setCompany(gameForm.getCompany());
        newGame.setReleaseDate(gameForm.getReleaseDate());
        newGame.setPlatform(gameForm.getPlatform());
        gameRepository.save(newGame);
        return newGame;
    }
}
