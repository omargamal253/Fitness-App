package com.example.workoutapp.data;

import androidx.lifecycle.ViewModel;

import com.example.workoutapp.R;
import com.example.workoutapp.model.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ExData extends ViewModel {

    private static ExData exData;
    List<Exercise> ClassicExercises ;
    private ExData() {


    }
    public  static ExData getInstance(){
        if(exData==null);
            exData = new ExData();
        return exData;
    }

    public  List<Exercise> getClassicExercises(){
        ClassicExercises = new ArrayList<>();
        AddNewExercise("STANDING BICYCLE CRUNCHES EXERCISE",
                "Start in the squat position, then jump up using your abdominal muscles for strength. This exercise works your abdomen."
                , R.drawable.gif1, "https://www.youtube.com/watch?v=p4FnJBr7j88",ClassicExercises);


        AddNewExercise("SUMO SIDE BENDS ILLUSTRATED EXERCISE GUIDE"
                ,"Lie on your back with your knees up at a 90 degree angle and your hands behind your head. Lift your upper body and thighs, and then stretch out. Repeat this exercise."
                ,R.drawable.gif3,"https://www.youtube.com/watch?v=p4FnJBr7j88",ClassicExercises);
        AddNewExercise("EXERCISE FOR SEXY LEAN & SCULPTED BICEPS"
                ,"The up and down plank strengthens and tones your core, glutes, arms, wrists, and shoulders. This exercise helps to improve your posture, tightens the midsection and boosts weight loss."
                ,R.drawable.gif2,"https://www.youtube.com/watch?v=p4FnJBr7j88",ClassicExercises);

        AddNewExercise("SKI ABS | ILLUSTRATED EXERCISE GUiDE"
                ,"The up and down plank strengthens and tones your core, glutes, arms, wrists, and shoulders. This exercise helps to improve your posture, tightens the midsection and boosts weight loss."
                ,R.drawable.gif4,"https://www.youtube.com/watch?v=p4FnJBr7j88",ClassicExercises);
        AddNewExercise("Cinch The Waist & Sculpt Your Obliques"
                ,"Sit on the floor with your knees bent, feet lifted a little bit and back tilted backwards.Then hold your hands together and twist from side to side."
                ,R.drawable.gif5,"https://www.youtube.com/watch?v=p4FnJBr7j88",ClassicExercises);

        AddNewExercise("SUMO SIDE BENDS ILLUSTRATED EXERCISE GUIDE"
                ,"Lie on your back with your knees up at a 90 degree angle and your hands behind your head. Lift your upper body and thighs, and then stretch out. Repeat this exercise."
                ,R.drawable.abs1,"https://www.youtube.com/watch?v=p4FnJBr7j88",ClassicExercises);
        AddNewExercise("SKI ABS | ILLUSTRATED EXERCISE GUiDE"
                ,"The up and down plank strengthens and tones your core, glutes, arms, wrists, and shoulders. This exercise helps to improve your posture, tightens the midsection and boosts weight loss."
                ,R.drawable.gif1,"https://www.youtube.com/watch?v=p4FnJBr7j88",ClassicExercises);

return ClassicExercises;
    }

    public void AddNewExercise(String  name , String Des , int resId , String Url , List<Exercise> exercises){
        List<Exercise> Exercises = exercises;
        Exercise exercise = new Exercise();
        exercise.setExName(name);
        exercise.setExDes(Des);
        exercise.setResId(resId);
        exercise.setExUrl(Url);
        exercise.setExCount("x26");
        Exercises.add(exercise);
    }
}
