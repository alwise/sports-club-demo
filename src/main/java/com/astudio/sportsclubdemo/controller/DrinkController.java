package com.astudio.sportsclubdemo.controller;

import com.astudio.sportsclubdemo.entity.Drink;
import com.astudio.sportsclubdemo.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drink")
public class DrinkController {
    @Autowired
    DrinkService drinkService;
    @PostMapping("/add")
    public Drink addDrink(@RequestBody Drink drink){
        return drinkService.addDrink(drink);
    }

    @GetMapping("/drinks")
    public List<Drink> drinks(){
        return drinkService.getDrinks();
    }

}
