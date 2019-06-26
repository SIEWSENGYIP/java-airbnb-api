package com.example.airbnbapi.entities;

public class Owner {
    int id;
    String name;
    String description;
    String joined;
    String languages;
    int responseRate;
    String responseTime;
    String email;
    String phone;

    public Owner(int id, String name, String description, String joined, String languages, int responseRate, String responseTime, String email, String phone) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.joined = joined;
        this.languages = languages;
        this.responseRate = responseRate;
        this.responseTime = responseTime;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJoined() {
        return this.joined;
    }

    public void setJoined(String joined) {
        this.joined = joined;
    }

    public String getLanguages() {
        return this.languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getResponseRate() {
        return this.responseRate;
    }

    public void setResponseRate(int responseRate) {
        this.responseRate = responseRate;
    }

    public String getResponseTime() {
        return this.responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}