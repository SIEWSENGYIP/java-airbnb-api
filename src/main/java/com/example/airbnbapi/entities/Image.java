package com.example.airbnbapi.entities;

public class Image {
    int id;
    String label;
    String url;


    public Image(int id, String label, String url) {
        this.id = id;
        this.label = label;
        this.url = url;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}