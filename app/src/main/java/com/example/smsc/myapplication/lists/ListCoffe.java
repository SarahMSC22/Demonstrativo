package com.example.smsc.myapplication.lists;

import java.io.Serializable;

public class ListCoffe implements Serializable {
    private final String title;
    private String description;
    private int imgId;
    private int numStars;


    public ListCoffe(String title, int imgId, int numStars, String description) {
        this.description = description;
        this.title = title;
        this.imgId = imgId;
        this.numStars = numStars;

    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public int getNumStars() {
        return numStars;
    }
}
