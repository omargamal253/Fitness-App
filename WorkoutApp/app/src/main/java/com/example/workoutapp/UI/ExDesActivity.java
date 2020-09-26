package com.example.workoutapp.UI;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.workoutapp.R;
import com.example.workoutapp.adapter.ExercisesAdapter;
import com.example.workoutapp.model.Exercise;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ExDesActivity extends AppCompatActivity {
    RecyclerView ExerciseRecyclerView;
    com.example.workoutapp.adapter.ExercisesAdapter ExercisesAdapter;
    List<Exercise> Exercises;
    Toolbar toolbar;
    String ExerciseName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_des);


        // Exercises =(List<Exercise>)  getIntent().getSerializableExtra("ExerciseList");
        Exercises = new ArrayList<>();
        ExerciseName = getIntent().getStringExtra("ExerciseName");
        toolbar = findViewById(R.id.Toolbar);
        toolbar.setTitle(ExerciseName + " Workout");

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ExerciseRecyclerView = findViewById(R.id.ExerciseRecyclerView);
        ExercisesAdapter = new ExercisesAdapter(this, Exercises, 2);

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false
        );
        ExerciseRecyclerView.setLayoutManager(layoutManager);
        ExerciseRecyclerView.setItemAnimator(new DefaultItemAnimator());


        ExerciseRecyclerView.setAdapter(ExercisesAdapter);
        getMyList();

    }

    public void getMyList() {

        //  Exercise exercise = new Exercise();
        DatabaseReference myRef = FirebaseDatabase.getInstance().getReference().child(ExerciseName);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot data : dataSnapshot.getChildren()) {
                    Exercise exercise = data.getValue(Exercise.class);
                    if (exercise != null) {
                        Log.d("CurrentUser", exercise.getExName());

                        ExercisesAdapter.AddNewExercise(exercise);
                    }

                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.d("CurrentUser", databaseError.getMessage());
            }
        });

    }
}