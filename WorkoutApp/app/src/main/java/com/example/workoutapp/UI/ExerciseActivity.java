package com.example.workoutapp.UI;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.TextView;
import android.widget.Toast;

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
      //  Exercises =(List<Exercise>)  getIntent().getSerializableExtra("ExerciseList");
Exercises = new ArrayList<>();
        toolbar = findViewById(R.id.Toolbar);
        toolbar.setTitle(ExerciseName+" Workout");
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

//        trainNum.setText(String.valueOf(Exercises.size()));
      //  trainTime.setText(String.valueOf((double)Exercises.size()+(double) Exercises.size()*1/2));
        getMyList();
    }


public void getMyList(){

      //  Exercise exercise = new Exercise();
    DatabaseReference myRef = FirebaseDatabase.getInstance().getReference().child(ExerciseName);
    myRef.addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            for(DataSnapshot data :  dataSnapshot.getChildren()){
                Exercise exercise   = data.getValue(Exercise.class);
                if (exercise!=null){
                    Log.d("CurrentUser",exercise.getExName() );

                    ExercisesAdapter.AddNewExercise(exercise);
                }

            }
            trainNum.setText(String.valueOf(ExercisesAdapter.Exercises.size()));
            trainTime.setText(String.valueOf((double)ExercisesAdapter.Exercises.size()+(double) ExercisesAdapter.Exercises.size()*1/2));

        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {
            Log.d("CurrentUser",databaseError.getMessage());
        }
    });
}


    public void GoExercise(View view) {

        Intent intent = new Intent(this ,TimerActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.putExtra("ExerciseList", (Serializable) ExercisesAdapter.Exercises);
        startActivity(intent);

    }
}