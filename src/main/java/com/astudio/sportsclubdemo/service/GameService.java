package com.astudio.sportsclubdemo.service;

import com.astudio.sportsclubdemo.entity.Games;
import com.astudio.sportsclubdemo.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GamesRepository gamesRepository;

    public Games addGame(Games games){
        return gamesRepository.save(games);
    }

    public List<Games> getAll(){
        return gamesRepository.findAll();
    }
}
