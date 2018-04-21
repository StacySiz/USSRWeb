package ru.itis.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import ru.itis.models.Game;
import ru.itis.repositories.GameRepository;

public class StringToGameConverter implements Converter<String, Game> {
    @Autowired
    GameRepository gameRepository;

    @Override
    public Game convert(String id) {
        try {
            Long gameId = Long.valueOf(id);
            return gameRepository.findById(gameId);
        } catch (NumberFormatException e) {
            return null;
        }
    }

}
