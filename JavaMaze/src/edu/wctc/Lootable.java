package edu.wctc;

public interface Lootable {
    static String loot(Player player){
        player.addToInventory("Coin");
        player.addToScore(250);
        return "You found a coin in the chest.";
    }
}
