package com.astudio.sportsclubdemo.controller;

import com.astudio.sportsclubdemo.entity.Games;
import com.astudio.sportsclubdemo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {
    @Autowired
    private GameService gameService;

    @PostMapping("/create")
    public Games create(@RequestBody Games games){
        return gameService.addGame(games);
    }


    @GetMapping("/games")
    public List<Games> getAll(){
        return gameService.getAll();
    }

}
