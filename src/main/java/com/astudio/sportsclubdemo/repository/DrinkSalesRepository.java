package com.astudio.sportsclubdemo.repository;

import com.astudio.sportsclubdemo.entity.Drink;
import com.astudio.sportsclubdemo.entity.DrinkSales;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DrinkSalesRepository extends JpaRepository<DrinkSales,Integer> {

}
