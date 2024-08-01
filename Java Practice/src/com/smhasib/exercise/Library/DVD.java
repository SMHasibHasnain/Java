package com.smhasib.exercise.Library;

public class DVD extends LibraryItem {
    protected String duration;

    public DVD(String duration, String itemID) {
        this.duration = duration;
        this.itemID = itemID;
    }

}
