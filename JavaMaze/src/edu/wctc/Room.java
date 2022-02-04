package edu.wctc;

public abstract class Room {

    private String name;
    private Room north,south,east,west,up,down;

    public Room(String name) {
        this.name = name;
    }


    public abstract String getDescription();

    public Room getAdjoiningRoom(char direction){
        switch(direction) {
            case 'n':
                return north;
            case 's':
                return south;
            case 'e':
                return east;
            case 'w':
                return west;
            case 'u':
                return up;
            case 'd':
                return down;
            default:
        return null;
        }
    }

    public String getExits(){
        StringBuilder sb = new StringBuilder();
        sb.append("Exits: ");
        sb.append(north != null ? "North " : "");
        sb.append(south != null ? "South " : "");
        sb.append(east != null ? "East " : "");
        sb.append(west != null ? "West " : "");
        sb.append(up != null ? "Up " : "");
        sb.append(down != null ? "Down " : "");

        return sb.toString();
    }

    public String getName(){
        return name;
    }

    public boolean isValidDirection(char direction){
        switch (direction) {
            case 'n':
                if (north != null){
                    return true;
                }
            case 's':
                if (south != null){
                    return true;
                }
            case 'e':
                if (east != null){
                    return true;
                }
            case 'w':
                if (west != null){
                    return true;
                }
            case 'u':
                if (up != null){
                    return true;
                }
            case 'd':
                if (down != null){
                    return true;
                }
            default:
                return false;
        }
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
