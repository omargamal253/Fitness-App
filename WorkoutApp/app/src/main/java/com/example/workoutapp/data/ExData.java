package com.example.workoutapp.data;

import androidx.lifecycle.ViewModel;

import com.example.workoutapp.R;
import com.example.workoutapp.model.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ExData extends ViewModel {

    private static ExData exData;
    List<Exercise> ClassicExercises ;
    List<Exercise> ButtExercise;
    List<Exercise> LegExercise;
    List<Exercise> ArmExercise;


    private ExData() {


    }
    public  static ExData getInstance(){
        if(exData==null);
            exData = new ExData();
        return exData;
    }
    public void AddNewExercise(String  name , String Des , int resId , String Url ,String count, List<Exercise> exercises){
        List<Exercise> Exercises = exercises;
       /* Exercise exercise = new Exercise();
        exercise.setExName(name);
        exercise.setExDes(Des);
    //    exercise.setResId(resId);
        exercise.setVideoUrl(Url);
        exercise.setExCount(count);
        Exercises.add(exercise);*/
    }
    public  List<Exercise> getClassicExercises(){
        ClassicExercises = new ArrayList<>();
        AddNewExercise("STANDING BICYCLE CRUNCHES EXERCISE",
                "Start in the squat position, then jump up using your abdominal muscles for strength. This exercise works your abdomen."
                , R.drawable.gif1, "https://www.youtube.com/watch?v=p4FnJBr7j88","x26",ClassicExercises);

        AddNewExercise("SUMO SIDE BENDS ILLUSTRATED EXERCISE GUIDE"
                ,"Lie on your back with your knees up at a 90 degree angle and your hands behind your head. Lift your upper body and thighs, and then stretch out. Repeat this exercise."
                ,R.drawable.gif3,"https://www.youtube.com/watch?v=p4FnJBr7j88","x26",ClassicExercises);
        AddNewExercise("EXERCISE FOR SEXY LEAN & SCULPTED BICEPS"
                ,"The up and down plank strengthens and tones your core, glutes, arms, wrists, and shoulders. This exercise helps to improve your posture, tightens the midsection and boosts weight loss."
                ,R.drawable.gif2,"https://www.youtube.com/watch?v=p4FnJBr7j88","x26",ClassicExercises);

        AddNewExercise("SKI ABS | ILLUSTRATED EXERCISE GUiDE"
                ,"The up and down plank strengthens and tones your core, glutes, arms, wrists, and shoulders. This exercise helps to improve your posture, tightens the midsection and boosts weight loss."
                ,R.drawable.gif4,"https://www.youtube.com/watch?v=p4FnJBr7j88","x26",ClassicExercises);
        AddNewExercise("Cinch The Waist & Sculpt Your Obliques"
                ,"Sit on the floor with your knees bent, feet lifted a little bit and back tilted backwards.Then hold your hands together and twist from side to side."
                ,R.drawable.gif5,"https://www.youtube.com/watch?v=p4FnJBr7j88","x26",ClassicExercises);

        AddNewExercise("SUMO SIDE BENDS ILLUSTRATED EXERCISE GUIDE"
                ,"Lie on your back with your knees up at a 90 degree angle and your hands behind your head. Lift your upper body and thighs, and then stretch out. Repeat this exercise."
                ,R.drawable.abs1,"https://www.youtube.com/watch?v=p4FnJBr7j88","x26",ClassicExercises);
        AddNewExercise("SKI ABS | ILLUSTRATED EXERCISE GUiDE"
                ,"The up and down plank strengthens and tones your core, glutes, arms, wrists, and shoulders. This exercise helps to improve your posture, tightens the midsection and boosts weight loss."
                ,R.drawable.gif1,"https://www.youtube.com/watch?v=p4FnJBr7j88","x26",ClassicExercises);

return ClassicExercises;
    }
    public  List<Exercise> getButtExercises(){

        ButtExercise = new ArrayList<>();
        AddNewExercise("Single Leg Deadlift ",
                "Single leg deadlift exercise guide with instructions, demonstration, calories burned and muscles worked. Learn proper form, discover all health benefits and choose a workout"
                , R.drawable.butt1, "https://www.youtube.com/watch?v=HtHxnWmMgzM","x22",ButtExercise);


        AddNewExercise("sumo Squat",
                "The sumo squat is a lower body strength exercise. The wide stance emphasizes the muscles of the inner thigh. The movement also allows for use of heavier resistance loads vs. the traditional squat."
                , R.drawable.butt2, "https://www.youtube.com/watch?v=sqDGkIBYPAk","x26",ButtExercise);

        AddNewExercise("BulGerian Split Squat",
                "Stand a couple feet in front of a chair. Prop one foot on the chair and lift your arms up. Perform a split squat by lowering to 90 degrees. Keep your standing foot rooted as you raise back up. Switch legs halfway through"
                , R.drawable.butt3, "https://www.youtube.com/watch?v=RCWkvwz7DoU","x22",ButtExercise);

        AddNewExercise("Squat Kickback",
                "Single-leg squat. When coming up kick back leg up a bit."
                , R.drawable.butt4, "https://www.youtube.com/watch?v=Omb53Sqf598","x22",ButtExercise);


        AddNewExercise("Step Up",
                "Start with one foot fully on a box with the other foot on the floor. Powerfully drive off of your box foot and jump straight up into the air. Switch legs while you are in the air and land soft. Repeat as soon as you land, alternating legs."
                , R.drawable.butt5, "https://www.youtube.com/watch?v=dQqApCGd5Ss","x22",ButtExercise);

        AddNewExercise("Side Lunge to Curtsy Lunge",
                "The curtsy lunge targets the main muscles involved in a lunge — the quads and glutes — but also engages some additional movers."
                , R.drawable.butt6, "https://www.youtube.com/watch?v=Y6U998ea0-8","x18",ButtExercise);

        AddNewExercise("Hamstring curls",
                "Lay down on your belly with the resistance bands tucked at ground level, closed in a loop around your ankles. Curl your legs to a 90 degrees angle."
                , R.drawable.butt7, "https://www.youtube.com/watch?v=bSlCgbL5HZ8","x22",ButtExercise);

        AddNewExercise("Side Lying Hip Abduction",
                "Let's begin by lying down on a flat surface on either side. Let's begin with your right side. Place your left arms extended out resting on your left leg. Your left leg will be on top of your right leg. Toes point out."
                , R.drawable.butt8, "https://www.youtube.com/watch?v=ifF1BPzUwU4","x22",ButtExercise);
        AddNewExercise("Glute Bridge",
                "Lie on the floor with your knees bent and feet flat on the floor." +
                        "Push your hips into the air using your buttocks muscles and keep your back straight and in alignment with your hips. Avoid arching your back."
                , R.drawable.butt9, "https://www.youtube.com/watch?v=wPM8icPu6H8","x26",ButtExercise);
        AddNewExercise("Clamshell",
                "Can Glute Exercises for women at home aid in achieving a firm, round and lifted rear? Basing on how your behind is structured, following is discussion on the exercises, how best to do them plus tips on what to eat to get quick results."
                , R.drawable.butt10, "https://www.youtube.com/watch?v=7iXpLxKs1sY","x20",ButtExercise);

        return  ButtExercise;
    }
    public  List<Exercise> getLegExercises() {
        LegExercise = new ArrayList<>();
        /*
         AddNewExercise("",
                ""
                , R.drawable.butt1, "","x22",ButtExercise);

        */
        AddNewExercise("High Knees",
                "High knees exercise guide with instructions, demonstration, calories burned and muscles worked. Learn proper form, discover all health benefits and choose a workout."
                , R.drawable.leg1, "https://www.youtube.com/watch?v=tx5rgpDAJRI","x22",LegExercise);

        AddNewExercise("Bulgarian Split Squat",
                "This challenge starts with a full-body strength-training workout that will keep you moving for about 40 minutes. Best of all, you don't need any equipment for"
                , R.drawable.leg2, "https://www.youtube.com/watch?v=QD4P9Di7L20","x20",LegExercise);

        AddNewExercise("Walking Lunges",
                "Walking lunges are a functional exercise that can be used to take your lunges to the next level. We share the benefits of this exercise, plus provide steps to do a basic walking lunge in addition to a couple variations."
                , R.drawable.butt3, "https://www.youtube.com/watch?v=L8fvypPrzzs","x26",LegExercise);
        AddNewExercise("180 Jump Squats",
                "To Full Engage Your Quads When Doing Squats or Modified Version,Like the 180 Jump Squat ,Keep Your Torso as Upright as Possible and Maintain a Maintain a narrow Stance."
                , R.drawable.butt4, "https://www.youtube.com/watch?v=M41E8-KcNH8","x18",LegExercise);

        AddNewExercise("Skating Windmill",
                "This intense Cardiovascular move improves Muscle Endurance and Strength, Promotes Weight Loss and Tones the glutes and quads."
                , R.drawable.butt5, "https://www.youtube.com/watch?v=0-Kw0wbtmSM","x22",LegExercise);

        AddNewExercise("Rolling Squat",
                "The Rolling Squat Strengthens Your Quads, Core, legs and qlutes,improves Your Balance and Coordination and increases Your Stamina."
                , R.drawable.butt6, "https://www.youtube.com/watch?v=5XcJ4KS2hhI","x16",LegExercise);


        AddNewExercise("Bear Squat",
                "The bear Squat is a Low Impact Exercise that tragets Your Quads and improves posture and flexibility. This exercise helps Sculpt Your Thighs,Strengthens The Hips,Tightens Your Core and elongates the Spine."
                , R.drawable.butt7, "https://www.youtube.com/watch?v=0-oY0WxtHyk","x18",LegExercise);
        AddNewExercise("Forward Jump Shuffle Back",
                "if You're Tring to increase Speed,agility and explosiveness and get a great cardio boost while also working Your quads,add the Forward Jump Shuffle back to your workouts."
                , R.drawable.butt8, "https://www.youtube.com/watch?v=p7RcBP6VM5c","x22",LegExercise);
        return  LegExercise;
    }

    public  List<Exercise> getArmExercises(){
        ArmExercise = new ArrayList<>();
              /*
         AddNewExercise("",
                ""
                , R.drawable.arm, "","x22",ArmExercise);

        */
        AddNewExercise("1.Dumbbell Lateral Raise",
                "Stand with your feet shoulder width apart.Raise your arms to the sides at shoulder height, then put them down. Repeat the exercise. Keep your arms straight during the exercise."
                , R.drawable.arm1, "https://youtu.be/ww0r9xZunDM","x18",ArmExercise);
        AddNewExercise("2.Push Up",
                "Lay prone on the ground with arms supporting your body. Keep your body straight while raising and lowering your body with your arms. This exercise works the chest, shoulders, triceps, back and legs."
                , R.drawable.arm2, "https://youtu.be/Eh00_rniF8E","x20",ArmExercise);
        AddNewExercise("3.Tricep Dips",
                "For the start position, sit on the chair. Then move your hip off the chair with your hands holding the edge of the chair. Slowly bend and stretch your arms to make your body go up and down. This is a great exercise for the triceps."
                , R.drawable.arm3, "https://youtu.be/0326dy_-CzM","x22",ArmExercise);

        AddNewExercise("4.Staggered Arm Push Up",
                "With your legs extended back, place the hands staggered, with one being higher than the other and slightly wider than shoulder width apart.Start bending your elbows and lower your chest until it's just above the floor.Extend your arms to push back up and then reverse your hand position."
                , R.drawable.arm4, "https://www.youtube.com/watch?v=YEuQAAZJJbg","x24",ArmExercise);
        AddNewExercise("5.Punches",
                "Stand with your legs shoulder width apart and your knees bent slightly.Bend your elbows and clench your fists in front of your face.Extend one arm forward with the palm facing the floor. Take the arm back and repeat with the other arm."
                , R.drawable.arm5, "https://youtu.be/NJxjWnbCEJk","x22",ArmExercise);
        AddNewExercise("6.Up and Down plank",
                "Start in the straight arm plank position. Then bend your right arm and place your forearm on the ground with your elbow under your shoulder, then bend your left arm and come down into the traditional plank position. Then reverse and come back to the start position. Repeat the exercise.Keep your body straight during the exercise. Inhale when you come down and exhale when you come up.It's a great exercise for the quadriceps, triceps and abdominal muscles."
                , R.drawable.arm6, "https://youtu.be/L4oFJRDAU4Q","x26",ArmExercise);
        AddNewExercise("7.Bicep Curls",
                "Start standing with a dumbbell in each hand. Your elbows should rest at your sides and your forearms should extend out in front of your body. Your knees should stay slightly bent and your belly button should draw into the spine.Bring the dumbbells all the way up to your shoulders by bending your elbows. Once at the top, hold for a second by squeezing the muscle.Reverse the curl slowly and repeat."
                , R.drawable.arm7, "https://youtu.be/ykJmrZ5v0Oo","x20",ArmExercise);

        AddNewExercise("8.Big Arm Circles",
                "Stand with your feet shoulder-width apart and extend your arms parallel to the floor.Circle your arms forward using small controlled motions, gradually making the circles bigger until you feel a stretch in your triceps.Reverse the direction of the circles after about 10 seconds."
                , R.drawable.arm8, "https://youtu.be/OV6toXTWzR8","x22",ArmExercise);

        AddNewExercise("9.Concentration Curls",
                "Sit on a bench that’s set at a height so your knees are bent at 90° with your feet flat on the floor. Pick up a dumbbell in your right hand and place the back of your upper right arm on the inner part of your right thigh. Your arm should be extended holding the weight off the floor.Slowly curl the weight up, only moving your forearms – the position of your upper arm on your thigh will help you keep it still during the exercise. At the top of the move, pause for a beat and squeeze your biceps, then slowly lower the weight back to the start. Do all your reps on one arm, then switch to the other."
                , R.drawable.arm9, "https://youtu.be/Jvj2wV0vOYU","x18",ArmExercise);
        AddNewExercise("10.Plank Shoulder Taps",
                "Start in the straight arm plank position.Lift your right hand to tap your left shoulder. Return to the start position and repeat with the other hand."
                , R.drawable.arm10, "https://youtu.be/hEGUul8mWnU","x22",ArmExercise);
        AddNewExercise("11.Dumbbell Triceps Kickback",
                "-Stand with your knees bent and lean forward slightly, with a dumbbell in each hand. Keeping your back straight, bend your dumbell-holding arm 90 degrees at the elbow so your triceps are aligned with your back and your biceps are perpendicular to the floor. Engage your core and your triceps and hinge at the elbow, lifting the dumbbell up and back as you try and straighten your arm. Your triceps should stay still; only your elbow moves. Guide the weight upward until your arm is straight, pause, then lower back to 90 degrees. That's one rep."
                , R.drawable.arm11, "https://youtu.be/ShCYaoHmWmk","x20",ArmExercise);
        AddNewExercise("12.lying tricep",
                "Lie faceup on a flat bench with your feet flat on the floor. Grasp a dumbbell in each hand and hold them directly above you with your palms facing inward (neutral grip) and your arms extended."
                , R.drawable.arm12, "https://youtu.be/2XDPNh7a8p8","x22",ArmExercise);
        return ArmExercise;
    }
}
