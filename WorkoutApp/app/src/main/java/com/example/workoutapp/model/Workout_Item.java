package com.example.workoutapp.model;

public class Workout_Item {
    public String img;
    public String Desc;
    public String Type;

    public Workout_Item(String img, String desc, String type) {
        this.img = img;
        Desc = desc;
        Type = type;
    }

    public String getImg() {
        return img;
    }

    public String getDesc() {
        return Desc;
    }

    public String getType() {
        return Type;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public void setType(String type) {
        Type = type;
    }
}
