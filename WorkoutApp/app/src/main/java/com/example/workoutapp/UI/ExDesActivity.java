package com.example.workoutapp.UI;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.workoutapp.R;
import com.example.workoutapp.adapter.ExercisesAdapter;
import com.example.workoutapp.model.Exercise;

import java.util.List;

public class ExDesActivity extends AppCompatActivity {
    RecyclerView ExerciseRecyclerView;
    com.example.workoutapp.adapter.ExercisesAdapter ExercisesAdapter;
    List<Exercise> Exercises ;
    Toolbar toolbar;
    String ExerciseName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_des);


        Exercises =(List<Exercise>)  getIntent().getSerializableExtra("ExerciseList");

        ExerciseName =getIntent().getStringExtra("ExerciseName");
        toolbar = findViewById(R.id.Toolbar);
        toolbar.setTitle(ExerciseName);

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
        ExercisesAdapter =new ExercisesAdapter(this,  Exercises,2 );

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                this , LinearLayoutManager.VERTICAL,false
        );
        ExerciseRecyclerView.setLayoutManager(layoutManager);
       ExerciseRecyclerView.setItemAnimator(new DefaultItemAnimator());



        ExerciseRecyclerView.setAdapter(ExercisesAdapter);


     /*  for (int i =0 ;i<Exercises.size();i++)
            ExercisesAdapter.AddNewExercise(Exercises.get(i));*/

      /*  AddNewExercise("STANDING BICYCLE CRUNCHES EXERCISE","Start in the squat position, then jump up using your abdominal muscles for strength. This exercise works your abdomen.",R.drawable.gif1);
        AddNewExercise("SUMO SIDE BENDS ILLUSTRATED EXERCISE GUIDE","Lie on your back with your knees up at a 90 degree angle and your hands behind your head. Lift your upper body and thighs, and then stretch out. Repeat this exercise.",R.drawable.gif2);
        AddNewExercise("EXERCISE FOR SEXY LEAN & SCULPTED BICEPS","The up and down plank strengthens and tones your core, glutes, arms, wrists, and shoulders. This exercise helps to improve your posture, tightens the midsection and boosts weight loss.",R.drawable.gif3);

        AddNewExercise("SKI ABS | ILLUSTRATED EXERCISE GUiDE","The up and down plank strengthens and tones your core, glutes, arms, wrists, and shoulders. This exercise helps to improve your posture, tightens the midsection and boosts weight loss.",R.drawable.gif4);
        AddNewExercise("Cinch The Waist & Sculpt Your Obliques","Sit on the floor with your knees bent, feet lifted a little bit and back tilted backwards.Then hold your hands together and twist from side to side.",R.drawable.gif5);
*/
    }

    public void AddNewExercise(String name , String Des , int resId ){
        Exercise exercise = new Exercise();
        exercise.setExName(name);
        exercise.setExDes(Des);
        exercise.setResId(resId);
        ExercisesAdapter.AddNewExercise(exercise);
    }

}