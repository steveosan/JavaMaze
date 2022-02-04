package edu.wctc;

public class GalleryRoom extends Room implements Interactable{
    String description;

    public GalleryRoom(String name, String description) {
        super(name);
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

