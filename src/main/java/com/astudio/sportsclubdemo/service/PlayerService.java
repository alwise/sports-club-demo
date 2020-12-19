package com.astudio.sportsclubdemo.service;

import com.astudio.sportsclubdemo.entity.Player;
import com.astudio.sportsclubdemo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public Player addPlayer(Player player){
        return playerRepository.save(player);
    }

    public List<Player> getPlayers(){
        return playerRepository.findAll();
    }

}
