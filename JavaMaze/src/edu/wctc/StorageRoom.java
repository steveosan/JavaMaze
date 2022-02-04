package edu.wctc;


public class StorageRoom extends Room implements Lootable{
    String description;

    public StorageRoom(String name, String description) {
        super(name);
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

