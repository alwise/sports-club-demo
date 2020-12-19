package com.astudio.sportsclubdemo.repository;

import com.astudio.sportsclubdemo.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Integer> {
}
