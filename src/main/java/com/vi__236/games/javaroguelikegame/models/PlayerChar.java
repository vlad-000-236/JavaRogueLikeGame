package com.vi__236.games.javaroguelikegame.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class PlayerChar {

    @Getter
    private int health;

    @Getter
    @Setter
    private int currentHealth;

    @Getter
    @Setter
    private int mana;

    @Getter
    @Setter
    private int dmg;

    @Setter
    @Getter
    private int [][] coordinates;

    /*
    Было бы классно в боёвку добавить очки действия, чтобы можно было более разнообразные бои устраивать.
     */
}
