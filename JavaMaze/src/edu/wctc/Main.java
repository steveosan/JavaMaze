package edu.wctc;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //MENU

        Player newPlayer = new Player();
        Maze thisMaze = new Maze(newPlayer);

        System.out.println("\n");
        System.out.println("\t################################");
        System.out.println("\t#\t Simple Maze Concept       #");
        System.out.println("\t################################");
        System.out.println("\n");

        System.out.println("Hello and welcome to the maze.");
        System.out.println("Interact: i\nLoot: l\nInventory: v\nExit: x\n");
        System.out.println(thisMaze.getCurrentRoomDescription());
        System.out.println(thisMaze.getCurrentRoomExits());

        do{
            System.out.println("enter a direction");
            String input = sc.next();

            char direction = input.charAt(0);



            switch(direction) {
                case 'n':
                case 's':

                case 'e':
                case 'w':
                case 'u':
                case 'd':
                    if (!thisMaze.move(direction))
                        System.out.println("can't go that way");
                    else {
                    System.out.println(thisMaze.getCurrentRoomDescription());
                        System.out.println(thisMaze.getCurrentRoomExits());
                    }

                        break;
                case 'i':
                    System.out.println(thisMaze.interactWithCurrentRoom());
                        break;
                case 'l':
                    System.out.println(thisMaze.lootCurrentRoom());
                        break;
                case 'x':
                    System.out.println(thisMaze.exitCurrentRoom());
                        break;
                case 'v':
                    System.out.println(thisMaze.getPlayerInventory());

            }

        }while (!thisMaze.isFinished());
        System.out.print("Your Current Score" + thisMaze.getPlayerScore());
    }

}
