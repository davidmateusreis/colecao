package com.david.gamecollection.controllers;

import com.david.gamecollection.models.Game;
import com.david.gamecollection.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class GameController {

    @Autowired
    GameRepository gameRepository;

    @GetMapping("/games")
    public List<Game> showAllGames() {
        return gameRepository.findAll();
    }

    @GetMapping("/game")
    public Game showASingleGame(@PathVariable(value = "id") long id) {
        return gameRepository.findById(id);
    }

    @PostMapping("/game")
    public Game saveAGame(@RequestBody Game game) {
        return gameRepository.save(game);
    }

    @DeleteMapping("/game")
    public void deleteAGame(@RequestBody Game game){
        gameRepository.delete(game);
    }

    @PutMapping("/game")
    public Game updateAGame(@RequestBody Game game){
        return gameRepository.save(game);
    }
}
