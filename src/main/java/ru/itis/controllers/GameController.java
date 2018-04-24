package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.converters.StringToGameConverter;
import ru.itis.exceptions.NotFoundExc;
import ru.itis.models.Game;
import ru.itis.models.forms.GameForm;
import ru.itis.services.GameService;

@Controller
public class GameController {
    @Autowired
    private StringToGameConverter gameConverter;
    @Autowired
    private GameService gameService;

    @GetMapping("/addGame")
    public String getPage(){
        return "game-form";
    }

//    @GetMapping("/game")
//    public String getGames(){
//        return "game";
//    }

    @PostMapping("/addGame")
    public String addGame(GameForm gameForm){
        gameService.createGame(gameForm);
        return "redirect:/index";
    }
    @GetMapping("/game/{id}")
    public String findGame(@PathVariable("id") Long id, Model model){
        Game game = gameService.getGameById(id);
        if(game==null) {
            throw new NotFoundExc("game");
        }
        model.addAttribute("game",game);
        return "game";
    }
    @GetMapping("/games")
    public String showGames(Model model){
        model.addAttribute("allGames",gameService.getAllGames());
        return "games";
    }
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
