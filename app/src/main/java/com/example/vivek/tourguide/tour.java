package com.example.vivek.tourguide;

public class tour {

    private int image;

    private int location;

    public tour(int place, int attract) {
        image = place;
        location = attract;
    }

    public int getPlace(){
        return image;
    }

    public int getAttract(){
        return location;
    }
}
