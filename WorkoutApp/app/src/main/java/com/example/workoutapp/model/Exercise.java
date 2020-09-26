package com.example.workoutapp.model;

import java.io.Serializable;

public class Exercise implements Serializable {
   public String exName,exCount;
   public String exDes, videoUrl;
   public String gifUrl;
   // public int resId;

    public Exercise() {
    }

    public Exercise(String exName, String exCount, String exDes, String videoUrl, String gifUrl) {
        this.exName = exName;
        this.exCount = exCount;
        this.exDes = exDes;
        this.videoUrl = videoUrl;
        this.gifUrl = gifUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getGifUrl() {
        return gifUrl;
    }

    public void setGifUrl(String gifUrl) {
        this.gifUrl = gifUrl;
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
