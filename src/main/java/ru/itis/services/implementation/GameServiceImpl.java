package ru.itis.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.models.Game;
import ru.itis.models.Image;
import ru.itis.models.forms.GameForm;
import ru.itis.repositories.GameRepository;
import ru.itis.services.GameService;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {
    @Autowired
    private GameRepository gameRepository;

    Image defaultImage = Image.builder().id(8L).build();

    @Override
    public Game createGame(GameForm gameForm) {
        Game newGame = Game.builder()
        .gameTitle(gameForm.getGameTitle())
        .genre(gameForm.getGenre())
        .company(gameForm.getCompany())
        .releaseDate(gameForm.getReleaseDate())
        .image(defaultImage)
        .build();
        gameRepository.save(newGame);
        return newGame;
    }
    public Game getGameByTitle(String gameTitle){
        return gameRepository.findByGameTitle(gameTitle);
    }
    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }
}
