package com.example.airbnbapi.entities;

public class Room {
    int id;
    String type;
    Bed[] beds;

    public Room(int id, String type, Bed[] beds) {
        this.id = id;
        this.type = type;
        this.beds = beds;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Bed[] getBeds() {
        return this.beds;
    }

    public void setBeds(Bed[] beds) {
        this.beds = beds;
    }

}