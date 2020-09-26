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
   private getdata data;
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
        data=new getdata(getContext());
        Type=data.getAllWourkout();
        mAdapter=new AdapterWorkout(Type,getActivity());
        recyclerview_workout.setAdapter(mAdapter);
        return v;


    }
}