package ru.itis.services;

import ru.itis.models.Game;
import ru.itis.models.forms.GameForm;

public interface GameService {
    Game createGame(GameForm gameForm);
}
