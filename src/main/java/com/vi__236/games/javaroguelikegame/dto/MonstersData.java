package com.vi__236.games.javaroguelikegame.dto;

import com.vi__236.games.javaroguelikegame.models.MonsterChar;

import java.util.ArrayList;

public class MonstersData {

    ArrayList<MonsterChar> monstersList;
    {
        monstersList.add(new MonsterChar("Goblin", 15, 15, 2, 0));
        monstersList.add(new MonsterChar( "Slime", 10, 10, 1, 0));
        monstersList.add(new MonsterChar("Live Armor", 25, 25, 10, 0));
        monstersList.add(new MonsterChar("Demon", 50, 50, 10, 0));
    }

    public MonsterChar getRandomMonster(int id){
        return monstersList.get(id);
    }

    public int listLengthGetter(){
        return monstersList.size();
    }
}
