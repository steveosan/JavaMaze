package edu.wctc;

public interface Exitable {
    static String exit(Player player){
        player.addToScore(100);
        return "Congratulations! you got out of the maze!";
    }

}
