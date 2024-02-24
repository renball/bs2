package org.example;

import java.util.Random;

public class BattleShipMaps {
    static final int FIELD_SIZE = 10;
    static char CF_ship ='H';
    static char CF_water ='~';
    static char CF_dmg ='X';
    static char CF_miss ='O';
    static char[][] firstPlayerTable = new char[FIELD_SIZE][FIELD_SIZE];
    static char[][] secondPlayerTable = new char[FIELD_SIZE][FIELD_SIZE];

    static char[][] createTablesFirstPlayer(){

        firstPlayerTable= new char[][]{
                {'~','H','~','~','~','~','~','~','~','~'},
                {'~','H','~','~','~','~','~','H','~','~'},
                {'~','~','~','~','~','~','~','~','~','~'},
                {'~','~','H','H','~','H','~','~','~','~'},
                {'~','~','~','~','~','~','~','~','H','~'},
                {'~','~','~','~','~','~','~','~','~','~'},
                {'~','H','~','H','H','H','~','~','~','~'},
                {'~','H','~','~','~','~','~','H','~','~'},
                {'~','H','~','~','~','~','~','H','~','~'},
                {'~','H','~','~','~','~','~','~','~','~'}
        };

        return firstPlayerTable;
    }

    static char[][] createTablesSecondPlayer(){
        secondPlayerTable= new char[][]{
                {'~','~','~','~','~','~','~','~','H','~'},
                {'~','~','~','~','H','~','~','~','H','~'},
                {'~','H','~','~','~','~','~','~','H','~'},
                {'~','~','~','~','~','~','~','~','~','~'},
                {'~','~','~','~','~','H','H','~','~','~'},
                {'~','~','~','H','~','~','~','~','~','~'},
                {'~','H','~','~','~','~','H','H','H','~'},
                {'~','~','~','H','~','~','~','~','~','~'},
                {'~','~','~','H','~','~','~','H','H','~'},
                {'~','~','~','~','~','~','~','~','~','~'}
        };
        return secondPlayerTable;
    }
}
