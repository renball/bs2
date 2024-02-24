package org.example;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

@WebService
public class BattleshipServer {

    static final List<Integer> cur = new ArrayList<>();
    static int numberOfPlayers = 0;
    static int lastMove = -1;
    static int lastPlayerMove = -1;

    public BattleshipServer() {

    }

    @WebMethod
    public int ConnectPlayer(){
        numberOfPlayers += 1;
        return numberOfPlayers;
    }


    @WebMethod
    public int getCur(){
        return cur.get(0);
    }

    @WebMethod
    public void setCur(int temp){
        cur.set(0, temp);
    }

    @WebMethod
    public void makeMove(int move, int player){
        lastMove = move;
        lastPlayerMove = player;
        System.out.println("" + lastMove + "   " + lastPlayerMove);
    }

    @WebMethod
    public int getLastMove(){
        return lastMove;
    }

    @WebMethod
    public int getLastPlayerMove(){
        return lastPlayerMove;
    }

    public static void main(String[] args) {

        cur.add(1);


        BattleshipServer virusWarServerApp = new BattleshipServer();
        Endpoint.publish("http://localhost:8080/battleship", virusWarServerApp);
    }





}


