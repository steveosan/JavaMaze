package edu.wctc;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Player newPlayer = new Player();
//        newPlayer.interact();
//        newPlayer.loot();
//        newPlayer.exit();



        Scanner sc = new Scanner(System.in);



        //MENU

        System.out.println("\n");
        System.out.println("\t################################");
        System.out.println("\t#\t Simple Maze Concept       #");
        System.out.println("\t################################");
        System.out.println("\n");

        Player newPlayer = new Player();
        Maze thisMaze = new Maze(newPlayer);


        System.out.println("You have entered the " + thisMaze.getCurrentRoomDescription());
        System.out.println("which direction?");

//      User Input initial direction //

        String input = sc.next();
        char direction = input.charAt(0);

        System.out.println("you can go in " + thisMaze.getAdjoiningRoom(direction));


    }

}
