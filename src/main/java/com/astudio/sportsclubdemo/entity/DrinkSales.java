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
public class DrinkSales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double amount;
    private int quantity;
    private String date;
    @ManyToOne
    @JoinColumn(name ="player_id")
    private Player player;

    @ManyToOne
    @JoinColumn(name ="drink_id")
    private Drink drink;

}
