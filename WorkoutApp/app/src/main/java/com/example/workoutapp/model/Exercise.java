package com.example.workoutapp.model;

import java.io.Serializable;

public class Exercise implements Serializable {
   public String exName,exCount;
   public String exDes,exUrl;
    public int resId;

    public String getExUrl() {
        return exUrl;
    }

    public void setExUrl(String exUrl) {
        this.exUrl = exUrl;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getExName() {
        return exName;
    }

    public void setExName(String exName) {
        this.exName = exName;
    }

    public String getExCount() {
        return exCount;
    }

    public void setExCount(String exCount) {
        this.exCount = exCount;
    }

    public String getExDes() {
        return exDes;
    }

    public void setExDes(String exDes) {
        this.exDes = exDes;
    }
}
