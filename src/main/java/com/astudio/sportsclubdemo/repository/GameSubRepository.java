package com.astudio.sportsclubdemo.repository;

import com.astudio.sportsclubdemo.entity.GameSubscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameSubRepository extends JpaRepository<GameSubscription,Integer> {
}
