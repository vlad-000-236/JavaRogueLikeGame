package com.vi__236.games.javaroguelikegame.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class MonsterChar {

    @Getter
    private String name;

    @Getter
    private int health;

    @Setter
    @Getter
    private int currentHealth;

    @Getter
    private int dmg;

    @Setter
    @Getter
    private  int coordinates;
}
