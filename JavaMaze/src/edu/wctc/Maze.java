package edu.wctc;

public class Maze{
    private Room currentRoom;
    private Player player;
    private boolean isFinished;

    public Maze(Player player) {
        this.player = player;
        Room one = new EmptyRoom("One", "You don't really see much in here, there seems to be a hatch " +
                "that you could climb into");
        Room two = new StorageRoom("Two", "you enter a dimly lit room. you can see some light coming from the room to the south. But, wait! Whats that??? A chest??.");
        Room three = new GalleryRoom("Three", "huh. its bright in here... Also is that a bottle on the floor.. Not suspicious at all! ");

        one.setSouth(two);
        two.setNorth(one);
        two.setSouth(three);
        three.setNorth(two);

        currentRoom = two;
    }

    public String exitCurrentRoom(){
        if (currentRoom instanceof Exitable){
            isFinished = true;
            return Exitable.exit(player);
        } else {
            return "You do NOT see a way out, eeeek!!!!.";
        }
    }

    public String interactWithCurrentRoom(){
        if (currentRoom instanceof Interactable) {
            return Interactable.interact(player);
        } else {
            return "Nothing of interest that you can see!";
        }
    }

    public String lootCurrentRoom(){
        if (currentRoom instanceof Lootable) {
            return Lootable.loot(player);
        } else {
            return "No point in looting the dust, Right?? ";
        }
    }

    public boolean move(char direction){
        if (currentRoom.isValidDirection(direction)){
            currentRoom = currentRoom.getAdjoiningRoom(direction);
            return true;
        } else {
            return false;
        }
    }

    public int getPlayerScore(){
        return player.getScore();
    }

    public String getPlayerInventory(){
        return player.getInventory();
    }

    public String getCurrentRoomDescription(){
        return currentRoom.getDescription();
    }

    public String getCurrentRoomExits(){
        return currentRoom.getExits();
    }

    public boolean isFinished(){
        return isFinished;
    }
}
