package com.astudio.sportsclubdemo.service;

import com.astudio.sportsclubdemo.entity.GameSubscription;
import com.astudio.sportsclubdemo.repository.GameSubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionService {
    @Autowired
    private GameSubRepository gameSubRepository;

    public GameSubscription create(GameSubscription gameSubscription){
        return gameSubRepository.save(gameSubscription);
    }

    public List<GameSubscription> getAll(){
        return gameSubRepository.findAll();
    }
}
