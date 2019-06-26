package com.example.airbnbapi.entities;

public class Bed {
    int id;
    String type;
    int qty;


    public Bed(int id, String type, int qty) {
        this.id = id;
        this.type = type;
        this.qty = qty;
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

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

}