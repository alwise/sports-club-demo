package com.astudio.sportsclubdemo.controller;

import com.astudio.sportsclubdemo.entity.Games;
import com.astudio.sportsclubdemo.entity.Player;
import com.astudio.sportsclubdemo.service.GameService;
import com.astudio.sportsclubdemo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @PostMapping("/register")
    public Player create(@RequestBody Player player){
        return playerService.addPlayer(player);
    }


    @GetMapping("/players")
    public List<Player> getAll(){
        return playerService.getPlayers();
    }

}
