package com.astudio.sportsclubdemo.repository;

import com.astudio.sportsclubdemo.entity.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<Drink,Integer> {
}
