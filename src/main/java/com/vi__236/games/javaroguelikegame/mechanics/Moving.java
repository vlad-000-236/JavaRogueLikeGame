package com.vi__236.games.javaroguelikegame.mechanics;

import java.lang.invoke.SwitchPoint;

public class Moving {

    private int newCoordinates;
    public int moving(int currentCoordinate, int stepsNum, String course){

        switch(course){

            case ("up"):
                newCoordinates = currentCoordinate - 10;
            break;

            case ("down"):
                newCoordinates = currentCoordinate + 10;
            break;

            case ("left"):
                newCoordinates = currentCoordinate - 1;
            break;

            case ("right"):
                newCoordinates = currentCoordinate + 1;
            break;

        }


        return newCoordinates;
    }
}
