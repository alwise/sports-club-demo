package com.astudio.sportsclubdemo.controller;

import com.astudio.sportsclubdemo.entity.DrinkSales;
import com.astudio.sportsclubdemo.service.DrinkSalesServices;
import com.astudio.sportsclubdemo.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sale")
public class SalesController {

    @Autowired
    private DrinkSalesServices drinkService;

    @PostMapping("/sell")
    public DrinkSales create(@RequestBody DrinkSales drinkSales){
        return drinkService.addSales(drinkSales);
    }


    @GetMapping("/sales")
    public List<DrinkSales> getSales(){
        return drinkService.getAll();
    }





}
