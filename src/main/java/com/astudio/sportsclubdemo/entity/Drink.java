package com.astudio.sportsclubdemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Drink {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double price;
    private String date;

    @OneToMany(mappedBy = "drink")
    @JsonIgnore
    private List<DrinkSales> drinkSales;
}
