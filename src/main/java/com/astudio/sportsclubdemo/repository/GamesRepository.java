package com.astudio.sportsclubdemo.repository;

import com.astudio.sportsclubdemo.entity.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepository extends JpaRepository<Games,Integer> {
}
