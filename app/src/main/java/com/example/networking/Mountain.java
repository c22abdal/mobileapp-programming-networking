package com.example.networking;

public class Mountain {
    private String name;
    private String location;
    private int height;

    public Mountain(){
        name = "No name";
        location = "No Location";
        height = -1;
    }

    public Mountain(String name, String location, int height){
        this.name = name;
        this.location = location;
        this.height = height;
    }
}
