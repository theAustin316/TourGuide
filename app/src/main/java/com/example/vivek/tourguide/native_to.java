package com.example.vivek.tourguide;

public class native_to {

    private int image;

    private int name;

    public native_to(int place, int attract) {
        image = place;
        name = attract;
    }

    public int getPlace(){
        return image;
    }

    public int getAttract(){
        return name;
    }

}
