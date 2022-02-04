package edu.wctc;

public class Maze extends Room{



    private Room currentRoom;
    private Player player;
    private boolean isFinished;

    public Maze(Player PlayerName){
        PlayerName = player;

        Room entrance = new Room("entrance") {
            @Override
            public String getDescriptiuon() {
                return "Entrance description";
            }
        };
        currentRoom = entrance;


        Room secondRoom = new Room("Hallway"){
            @Override
            public String getDescriptiuon() {
                return "Entrance description";
            }
        };;
        Room center = new Room("Dungeon"){
            @Override
            public String getDescriptiuon() {
                return "Entrance description";
            }
        };;
        Room centerUp = new Room("Attic"){
            @Override
            public String getDescriptiuon() {
                return "Entrance description";
            }
        };;
        Room centerDown = new Room("Basement"){
            @Override
            public String getDescriptiuon() {
                return "Entrance description";
            }
        };;
        Room exit = new Room("Parlor"){
            @Override
            public String getDescriptiuon() {
                return "Entrance description";
            }
        };;

        entrance.setEast(secondRoom);
        secondRoom.setEast(center);
        secondRoom.setWest(entrance);
        center.setEast(exit);
        center.setUp(centerUp);
        center.setDown(centerDown);
        center.setWest(secondRoom);
        centerUp.setDown(center);
        centerDown.setUp(center);
        exit.setWest(center);
    }

    public String exitCurrentRoom(){
        return null;
    }
    public String getCurrentRoomDescription(){
        return currentRoom.getDescriptiuon();
    }
    public String getCurrentRoomExits(){
        return null;
    }

    public String getPlayerInventory(){
        return null;
    }

    public int getPlayerScore(){
        return 0;
    }

    public String interactWithCurrentRoom(){
        return null;
    }

    public boolean isFinished(){
        return true;
    }

    public String lootCurrentRoom(){
        return null;
    }

    public Boolean move (char direction){
        return true;
    }


    @Override
    public String getDescriptiuon() {
        return null;
    }
}
