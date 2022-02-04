package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Player implements Interactabble, Lootable, Exitable {

    private int score;

    private List<String> inventory=new ArrayList<String>();

    public void addToInventory(String addedToInventory){}

    public void addToScore(int addedScore){}

    public String getInventory(){
        return null;
    }

    public int getScore(){
        return 0;
    }


    public void interact(){
        System.out.println("room interaction");
    }

    public void loot(){
        System.out.println("room was looted");
    }

    public void exit(){
        System.out.println("The player has exited");
    }
}
