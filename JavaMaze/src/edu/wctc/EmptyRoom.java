package edu.wctc;

public class EmptyRoom extends Room implements Exitable{
    String description;

    public EmptyRoom(String name, String description) {
        super(name);
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

