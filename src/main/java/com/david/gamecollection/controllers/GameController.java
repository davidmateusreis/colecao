package com.david.gamecollection.controllers;

import com.david.gamecollection.models.Game;
import com.david.gamecollection.repositories.GameRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "Game List API REST")
@CrossOrigin(origins = "*")
public class GameController {

    @Autowired
    GameRepository gameRepository;

    @GetMapping("/games")
    @ApiOperation(value = "Shows a list of games.")
    public List<Game> showAllGames() {
        return gameRepository.findAll();
    }

    @GetMapping("/game")
    @ApiOperation(value = "Show a single game.")
    public Game showASingleGame(@PathVariable(value = "id") long id) {
        return gameRepository.findById(id);
    }

    @PostMapping("/game")
    @ApiOperation(value = "Add a game to the list.")
    public Game saveAGame(@RequestBody Game game) {
        return gameRepository.save(game);
    }

    @DeleteMapping("/game")
    @ApiOperation(value = "Remove a game from the list.")
    public void deleteAGame(@RequestBody Game game){
        gameRepository.delete(game);
    }

    @PutMapping("/game")
    @ApiOperation(value = "Update a game from the list.")
    public Game updateAGame(@RequestBody Game game){
        return gameRepository.save(game);
    }
}
