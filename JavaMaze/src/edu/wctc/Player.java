package edu.wctc;

import java.util.ArrayList;
import java.util.List;


public class Player {
    private int score;
    private List<String> inventory = new ArrayList<String>();

    public void addToInventory(String item){
        inventory.add(item);
    }

    public void addToScore(int ammountToAdd){
        score += ammountToAdd;
    }

    public String getInventory(){
        if (inventory.size() > 0){
            String items = "";
            for(String item:inventory){
                items += item;
            }
            return items;
        } else {
            return "You inventory is empty";
        }
    }

    public int getScore(){
        return score;
    }
}