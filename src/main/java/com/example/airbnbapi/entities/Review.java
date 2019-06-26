package com.example.airbnbapi.entities;

public class Review {
    int id;
    String description;
    String userName;
    String reviewAt;


    public Review(int id, String description, String userName, String reviewAt) {
        this.id = id;
        this.description = description;
        this.userName = userName;
        this.reviewAt = reviewAt;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getReviewAt() {
        return this.reviewAt;
    }

    public void setReviewAt(String reviewAt) {
        this.reviewAt = reviewAt;
    }

}