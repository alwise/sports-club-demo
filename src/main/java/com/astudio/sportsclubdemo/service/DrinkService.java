package com.astudio.sportsclubdemo.service;

import com.astudio.sportsclubdemo.entity.Drink;
import com.astudio.sportsclubdemo.repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkService {
    @Autowired
    private DrinkRepository drinkRepository;

    public Drink addDrink(Drink drink){
        return drinkRepository.save(drink);
    }

    public List<Drink> getDrinks(){
        return drinkRepository.findAll();
    }
}
