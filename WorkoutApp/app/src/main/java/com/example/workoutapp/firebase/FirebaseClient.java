package com.example.workoutapp.firebase;

import com.example.workoutapp.model.Exercise;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class FirebaseClient {
    public static void AddProductTo_FireBase(Exercise exercise, String Workout){


        HashMap map  = new HashMap<>();

        map.put("exName" , exercise.getExName());
        map.put("exCount" , exercise.getExCount());
        map.put("exDes" , exercise.getExDes());
        map.put("videoUrl" ,exercise.getVideoUrl());
        map.put("gifUrl" , exercise.getGifUrl());

        // key product.getTitle()+product.getBrand()+product.getColor()
        FirebaseDatabase.getInstance().getReference().child(Workout).push()
                .updateChildren(map);
        map.clear();
    }
}
