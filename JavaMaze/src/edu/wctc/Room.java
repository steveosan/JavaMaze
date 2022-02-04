package edu.wctc;

public abstract class Room {

    private String name;
    private Room north,south,east,west,up,down;

    public Room(String name) {
        this.name = name;

    }

    protected Room() {
    }

    public abstract String getDescriptiuon();

    public Room getAdjoiningRoom(char direction){
        return null;
    }

    public String getExits() {
        return null;
    }

    public String getName(){
        return null;
    }

    public String isValidDirection(char direction) {
        return null;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public void setDown(Room down) {
        this.down = down;
    }


}
