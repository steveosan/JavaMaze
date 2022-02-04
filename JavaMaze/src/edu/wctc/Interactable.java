package edu.wctc;

public interface Interactable {
    static String interact(Player player){
        player.addToScore(-25);
        return "Would you look at that, A bottle with a old message in it. Lets see what it says, \"You are farthest from the exit.\"" +
                "well, that wasn't much help, was it!";
    }
}
