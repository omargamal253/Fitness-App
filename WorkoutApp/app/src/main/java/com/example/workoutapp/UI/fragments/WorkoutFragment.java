package com.example.workoutapp.UI.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.workoutapp.R;
import com.example.workoutapp.adapter.AdapterWorkout;
import com.example.workoutapp.model.Workout_Item;

import java.util.ArrayList;

public class WorkoutFragment extends Fragment {
    private RecyclerView recyclerview_workout;
    private AdapterWorkout mAdapter;
    private ArrayList<Workout_Item> Type;
   private  Workout_Item item;
    public WorkoutFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_workout_, container, false);
        recyclerview_workout=v.findViewById(R.id.recyclerview_WorkoutType);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity());
        recyclerview_workout.setLayoutManager(layoutManager);
        Type=new ArrayList<Workout_Item>();
        item=new Workout_Item("https://images.unsplash.com/photo-1517130038641-a774d04afb3c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"
                ,"Scientifically Proven to assist weight loss and improv\nCardiovascular function",
                "Classic");
        Type.add(item);


        item=new Workout_Item("https://images.unsplash.com/photo-1577221084712-45b0445d2b00?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=643&q=80",
                "Get Sexy, flat and firm abdominal muscles Using Effective Abs Training Methods",
                "Abs Workout");
        Type.add(item);
        item=new Workout_Item("https://images.unsplash.com/photo-1585834830884-392089dfd9f6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60",
                "In Only 7 Minuts, These 12 Typical Exercises Will Give You The Tight But you've Always Dreamed of",
                "Butt Workout");
        Type.add(item);
        item=new Workout_Item("https://images.unsplash.com/photo-1434608519344-49d77a699e1d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60",
                "Want Slim and Sexy Legs? Strengthen and Tighten Your Lower Body Now!",
                "Leg Workout");
        Type.add(item);
        item=new Workout_Item("https://images.unsplash.com/photo-1583454122781-8cf8f5af9d2b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60",
                "Several Minutes a Day to Have Nice And Toned Arms in no Time!",
                "Arm Workout");
        Type.add(item);
        item=new Workout_Item("https://images.unsplash.com/flagged/photo-1573556291531-a5d957d7e4e7?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60",
                "Relax Yourself and Get a High_Quality Sleep",
                "Sleepy Time Stretch");
        Type.add(item);
        mAdapter=new AdapterWorkout(Type,getActivity());
        recyclerview_workout.setAdapter(mAdapter);
        return v;


    }
}