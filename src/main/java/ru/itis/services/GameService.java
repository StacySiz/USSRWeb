package ru.itis.services;

import ru.itis.models.Game;
import ru.itis.models.forms.GameForm;

import java.util.List;

public interface GameService {
    Game createGame(GameForm gameForm);

    Game getGameByTitle(String gameTitle);

    List<Game> getAllGames();
}
