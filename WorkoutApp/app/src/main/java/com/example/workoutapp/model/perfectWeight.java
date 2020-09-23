package com.example.workoutapp.model;

public class perfectWeight
{
    private float weight;
    private float height;
    private float perf_weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public  float calc_weight (float height)
    {
        perf_weight = height - 100 ;
        return perf_weight;
    }
}
