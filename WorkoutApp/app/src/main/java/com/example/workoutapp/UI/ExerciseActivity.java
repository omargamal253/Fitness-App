package com.example.workoutapp.UI;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.workoutapp.R;
import com.example.workoutapp.adapter.ExercisesAdapter;
import com.example.workoutapp.model.Exercise;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExerciseActivity extends AppCompatActivity {

RecyclerView ExerciseRecyclerView;
 com.example.workoutapp.adapter.ExercisesAdapter ExercisesAdapter;
    List<Exercise> Exercises ;
    Toolbar toolbar;
    String ExerciseName;
    TextView trainTime,trainNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        ExerciseName =getIntent().getStringExtra("ExerciseName");
        Exercises =(List<Exercise>)  getIntent().getSerializableExtra("ExerciseList");

        toolbar = findViewById(R.id.Toolbar);
        toolbar.setTitle(ExerciseName);
        toolbar.setTitleTextColor(Color.parseColor("#000000"));

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        ExerciseRecyclerView = findViewById(R.id.ExerciseRecyclerView);

        ExercisesAdapter =new ExercisesAdapter(this,  Exercises,1 );

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                this , LinearLayoutManager.VERTICAL,false
        );
        ExerciseRecyclerView.setLayoutManager(layoutManager);
        ExerciseRecyclerView.setItemAnimator(new DefaultItemAnimator());

        ExerciseRecyclerView.setAdapter(ExercisesAdapter);
        trainNum =findViewById(R.id.trainNum);
        trainTime = findViewById(R.id.trainTime);

        trainNum.setText(String.valueOf(Exercises.size()));
        trainTime.setText(String.valueOf((double)Exercises.size()+(double) Exercises.size()*1/2));
    }



    public void GoExercise(View view) {

        Intent intent = new Intent(this ,TimerActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.putExtra("ExerciseList", (Serializable) ExercisesAdapter.Exercises);
        startActivity(intent);

    }
}