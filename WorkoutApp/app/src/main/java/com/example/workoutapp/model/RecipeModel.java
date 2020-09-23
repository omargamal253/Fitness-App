package com.example.workoutapp.model;

public class RecipeModel
{
    private String title , description1 , description2;
    private int img;

    public RecipeModel() {
        this.title = title;
        this.description1 = description1;
        this.description2 = description2;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public RecipeModel(String title, String description1, String description2, int img) {
        this.title = title;
        this.description1 = description1;
        this.description2 = description2;
        this.img = img;
    }
}
