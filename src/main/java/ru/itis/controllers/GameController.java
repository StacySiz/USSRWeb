package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.converters.StringToGameConverter;
import ru.itis.models.Game;
import ru.itis.models.forms.GameForm;
import ru.itis.services.GameService;

@Controller
public class GameController {
    @Autowired
    private StringToGameConverter gameConverter;
    @Autowired
    GameService gameService;

    @GetMapping("/addGame")
    public String getPage(){
        return "game-form";
    }

    @PostMapping("/addGame")
    public String addGame(GameForm gameForm){
        gameService.createGame(gameForm);
        return "redirect:/index";
    }
    @GetMapping("/game/{id}")
    public String findGame(@PathVariable("id") Game game, Model model){
//        Game game = new Game();
//        game = gameConverter.convert(id);
        model.addAttribute("game",game.getGameTitle());
        return "redirect:/index";
    }
}
