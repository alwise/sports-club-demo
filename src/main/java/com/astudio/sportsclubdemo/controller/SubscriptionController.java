package com.astudio.sportsclubdemo.controller;

import com.astudio.sportsclubdemo.entity.GameSubscription;
import com.astudio.sportsclubdemo.entity.Staff;
import com.astudio.sportsclubdemo.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscription")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @PostMapping("/subscribe")
    public GameSubscription register(@RequestBody GameSubscription gameSubscription){
        return subscriptionService.create(gameSubscription);
    }


    @GetMapping("/subscriptions")
    public List<GameSubscription> getAll(){
        return subscriptionService.getAll();
    }

}
