package com.astudio.sportsclubdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class GameSubscription {
    @Id
    @GeneratedValue
    private int id;
    private String date;

    @ManyToOne
    @JoinColumn(name ="player_id")
    private Player player;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Games game;
}
