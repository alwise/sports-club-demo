package com.astudio.sportsclubdemo.service;

import com.astudio.sportsclubdemo.entity.Drink;
import com.astudio.sportsclubdemo.entity.DrinkSales;
import com.astudio.sportsclubdemo.repository.DrinkRepository;
import com.astudio.sportsclubdemo.repository.DrinkSalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkSalesServices {
    @Autowired
    private DrinkSalesRepository drinkRepository;

    public DrinkSales addSales(DrinkSales drinkSales){
        return drinkRepository.save(drinkSales);
    }

    public List<DrinkSales> getAll(){
        return drinkRepository.findAll();
    }

}
