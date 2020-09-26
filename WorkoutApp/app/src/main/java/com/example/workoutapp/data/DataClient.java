package com.example.workoutapp.data;

import com.example.workoutapp.R;
import com.example.workoutapp.firebase.FirebaseClient;
import com.example.workoutapp.model.Exercise;

import java.util.ArrayList;
import java.util.List;

public class DataClient {

    public static void AddNewExercise(String  name , String Des , String videoUrl ,String count, String gifUrl,String Workout){
        Exercise exercise = new Exercise();
        exercise.setExName(name);
        exercise.setExDes(Des);
        exercise.setVideoUrl(videoUrl);
        exercise.setExCount(count);
        exercise.setGifUrl(gifUrl);
        FirebaseClient.AddProductTo_FireBase(exercise , Workout);
    }

    public  static void SetArmExercises(){

        AddNewExercise("1.Dumbbell Lateral Raise",
                "Stand with your feet shoulder width apart.Raise your arms to the sides at shoulder height, then put them down. Repeat the exercise. Keep your arms straight during the exercise."
                , "https://youtu.be/ww0r9xZunDM"
                ,"x18", "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Arm%2Farm1.gif?alt=media&token=88a3d307-ef73-4978-8d0d-dd2cfd372e87"
               ,"Arm" );


        AddNewExercise("2.Push Up",
                "Lay prone on the ground with arms supporting your body. Keep your body straight while raising and lowering your body with your arms. This exercise works the chest, shoulders, triceps, back and legs."
                ,"https://youtu.be/ww0r9xZunDM",
                "x18"
                ,"https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Arm%2Farm2.gif?alt=media&token=8df079e8-67b4-4c60-bb4d-283d5a2b0d72","Arm"

        );

        AddNewExercise("3.Tricep Dips",
                "For the start position, sit on the chair. Then move your hip off the chair with your hands holding the edge of the chair. Slowly bend and stretch your arms to make your body go up and down. This is a great exercise for the triceps."
                , "https://youtu.be/0326dy_-CzM",
                "x22",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Arm%2Farm3.gif?alt=media&token=76117c23-4467-4e77-ac16-adac14478345","Arm");

        AddNewExercise("4.Staggered Arm Push Up",
                "With your legs extended back, place the hands staggered, with one being higher than the other and slightly wider than shoulder width apart.Start bending your elbows and lower your chest until it's just above the floor.Extend your arms to push back up and then reverse your hand position."
                , "https://www.youtube.com/watch?v=YEuQAAZJJbg","x24"
                ,"https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Arm%2Farm4.gif?alt=media&token=0e41e5f2-4a93-46ee-8869-0e6637e9062d","Arm");

        AddNewExercise("5.Punches",
                "Stand with your legs shoulder width apart and your knees bent slightly.Bend your elbows and clench your fists in front of your face.Extend one arm forward with the palm facing the floor. Take the arm back and repeat with the other arm."
                , "https://youtu.be/NJxjWnbCEJk","x22",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Arm%2Farm5.gif?alt=media&token=5fc805a3-5a99-4e16-a3a0-fdf64c4dad91","Arm");

        AddNewExercise("6.Up and Down plank",
                "Start in the straight arm plank position. Then bend your right arm and place your forearm on the ground with your elbow under your shoulder, then bend your left arm and come down into the traditional plank position. Then reverse and come back to the start position. Repeat the exercise.Keep your body straight during the exercise. Inhale when you come down and exhale when you come up.It's a great exercise for the quadriceps, triceps and abdominal muscles."
                ,  "https://youtu.be/L4oFJRDAU4Q","x26",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Arm%2Farm6.gif?alt=media&token=4f6f0de0-9886-4449-87fe-b9c7bbf1eb48","Arm");

        AddNewExercise("7.Bicep Curls",
                "Start standing with a dumbbell in each hand. Your elbows should rest at your sides and your forearms should extend out in front of your body. Your knees should stay slightly bent and your belly button should draw into the spine.Bring the dumbbells all the way up to your shoulders by bending your elbows. Once at the top, hold for a second by squeezing the muscle.Reverse the curl slowly and repeat."
             , "https://youtu.be/ykJmrZ5v0Oo","x20"
                ,"https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Arm%2Farm7.gif?alt=media&token=2b89a532-ce50-4531-a476-7f58b5452946","Arm");

        AddNewExercise("8.Big Arm Circles",
                "Stand with your feet shoulder-width apart and extend your arms parallel to the floor.Circle your arms forward using small controlled motions, gradually making the circles bigger until you feel a stretch in your triceps.Reverse the direction of the circles after about 10 seconds."
                ,  "https://youtu.be/OV6toXTWzR8","x22",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Arm%2Farm8.gif?alt=media&token=a65e13b9-d839-4b0b-9a85-4bfed9c1f05c","Arm");

        AddNewExercise("9.Concentration Curls",
                "Sit on a bench that’s set at a height so your knees are bent at 90° with your feet flat on the floor. Pick up a dumbbell in your right hand and place the back of your upper right arm on the inner part of your right thigh. Your arm should be extended holding the weight off the floor.Slowly curl the weight up, only moving your forearms – the position of your upper arm on your thigh will help you keep it still during the exercise. At the top of the move, pause for a beat and squeeze your biceps, then slowly lower the weight back to the start. Do all your reps on one arm, then switch to the other."
             , "https://youtu.be/Jvj2wV0vOYU","x18",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Arm%2Farm9.gif?alt=media&token=b32c3f27-c6d7-4b24-a28d-1a428270af3e","Arm");

        AddNewExercise("10.Plank Shoulder Taps",
                "Start in the straight arm plank position.Lift your right hand to tap your left shoulder. Return to the start position and repeat with the other hand."
              , "https://youtu.be/hEGUul8mWnU","x22",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Arm%2Farm10.gif?alt=media&token=97f4cbf5-96a7-48b0-915b-64eee072ba17","Arm");

        AddNewExercise("11.Dumbbell Triceps Kickback",
                "-Stand with your knees bent and lean forward slightly, with a dumbbell in each hand. Keeping your back straight, bend your dumbell-holding arm 90 degrees at the elbow so your triceps are aligned with your back and your biceps are perpendicular to the floor. Engage your core and your triceps and hinge at the elbow, lifting the dumbbell up and back as you try and straighten your arm. Your triceps should stay still; only your elbow moves. Guide the weight upward until your arm is straight, pause, then lower back to 90 degrees. That's one rep."
              , "https://youtu.be/ShCYaoHmWmk","x20",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Arm%2Farm11.gif?alt=media&token=0743b9c8-1be9-4cd7-a503-ef43af5f74c7","Arm");
        AddNewExercise("12.lying tricep",
                "Lie faceup on a flat bench with your feet flat on the floor. Grasp a dumbbell in each hand and hold them directly above you with your palms facing inward (neutral grip) and your arms extended."
             , "https://youtu.be/2XDPNh7a8p8","x22",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Arm%2Farm12.gif?alt=media&token=9522726d-53ad-4f24-8c4f-24d4ddb803c3","Arm");



    }
    public static void SetLegExercises(){
        AddNewExercise("High Knees",
                "High knees exercise guide with instructions, demonstration, calories burned and muscles worked. Learn proper form, discover all health benefits and choose a workout."
              , "https://www.youtube.com/watch?v=tx5rgpDAJRI","x22",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Leg%2Fleg1.gif?alt=media&token=7ef3de91-0c55-40ac-9fe7-5fc5737725a2"
                ,"Leg");

        AddNewExercise("Bulgarian Split Squat",
                "This challenge starts with a full-body strength-training workout that will keep you moving for about 40 minutes. Best of all, you don't need any equipment for"
              , "https://www.youtube.com/watch?v=QD4P9Di7L20","x20",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Leg%2Fleg2.gif?alt=media&token=ea886d75-79d2-45c8-8588-789346d0f33a"
        ,"Leg");

        AddNewExercise("Walking Lunges",
                "Walking lunges are a functional exercise that can be used to take your lunges to the next level. We share the benefits of this exercise, plus provide steps to do a basic walking lunge in addition to a couple variations."
               , "https://www.youtube.com/watch?v=L8fvypPrzzs","x26",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Leg%2Fleg3.gif?alt=media&token=ee7e087a-a42d-4813-8608-4af2a5dff0cd"
                ,"Leg"
                );
        AddNewExercise("180 Jump Squats",
                "To Full Engage Your Quads When Doing Squats or Modified Version,Like the 180 Jump Squat ,Keep Your Torso as Upright as Possible and Maintain a Maintain a narrow Stance."
             ,"https://www.youtube.com/watch?v=M41E8-KcNH8","x18",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Leg%2Fleg4.gif?alt=media&token=b1daff9d-88f5-43ae-8500-96d0a2acbbfe"
                ,"Leg");

        AddNewExercise("Skating Windmill",
                "This intense Cardiovascular move improves Muscle Endurance and Strength, Promotes Weight Loss and Tones the glutes and quads."
               , "https://www.youtube.com/watch?v=0-Kw0wbtmSM","x22","https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Leg%2Fleg5.gif?alt=media&token=4a2cd729-1b9b-4037-b832-01a1c03fd9fb"
                ,"Leg");

        AddNewExercise("Rolling Squat",
                "The Rolling Squat Strengthens Your Quads, Core, legs and qlutes,improves Your Balance and Coordination and increases Your Stamina."
                , "https://www.youtube.com/watch?v=5XcJ4KS2hhI","x16","https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Leg%2Fleg6.gif?alt=media&token=254a4d17-c62a-4217-b08e-3338bd268c69"
                ,"Leg");


        AddNewExercise("Bear Squat",
                "The bear Squat is a Low Impact Exercise that tragets Your Quads and improves posture and flexibility. This exercise helps Sculpt Your Thighs,Strengthens The Hips,Tightens Your Core and elongates the Spine."
                , "https://www.youtube.com/watch?v=0-oY0WxtHyk","x18","https://console.firebase.google.com/u/1/project/workout-app-e12e9/storage/workout-app-e12e9.appspot.com/files~2FLeg"
                ,"Leg");
        AddNewExercise("Forward Jump Shuffle Back",
                "if You're Tring to increase Speed,agility and explosiveness and get a great cardio boost while also working Your quads,add the Forward Jump Shuffle back to your workouts."
                , "https://www.youtube.com/watch?v=p7RcBP6VM5c","x22","https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Leg%2Fleg8.gif?alt=media&token=2b7c7f09-6cdc-4e54-be0e-fb1e0339396a"
                ,"Leg");

    }
    public static void SetButtExercises(){
        AddNewExercise("Single Leg Deadlift ",
                "Single leg deadlift exercise guide with instructions, demonstration, calories burned and muscles worked. Learn proper form, discover all health benefits and choose a workout"
              , "https://www.youtube.com/watch?v=HtHxnWmMgzM","x22",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Butt%2Fbutt1.gif?alt=media&token=26a7d455-b9f4-4a80-a776-170a91ee44b3",
                "Butt");


        AddNewExercise("sumo Squat",
                "The sumo squat is a lower body strength exercise. The wide stance emphasizes the muscles of the inner thigh. The movement also allows for use of heavier resistance loads vs. the traditional squat."
               , "https://www.youtube.com/watch?v=sqDGkIBYPAk","x26",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Butt%2Fbutt2.gif?alt=media&token=67a6c89f-60b0-42e5-b975-af141641f0d8",
                "Butt");

        AddNewExercise("BulGerian Split Squat",
                "Stand a couple feet in front of a chair. Prop one foot on the chair and lift your arms up. Perform a split squat by lowering to 90 degrees. Keep your standing foot rooted as you raise back up. Switch legs halfway through"
               , "https://www.youtube.com/watch?v=RCWkvwz7DoU","x22",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Butt%2Fbutt3.gif?alt=media&token=85007a2b-b053-4b72-af61-f91abe77a32e",
                "Butt");

        AddNewExercise("Squat Kickback",
                "Single-leg squat. When coming up kick back leg up a bit."
               , "https://www.youtube.com/watch?v=Omb53Sqf598","x22",
                "https://console.firebase.google.com/u/1/project/workout-app-e12e9/storage/workout-app-e12e9.appspot.com/files~2FButt",
                "Butt");


        AddNewExercise("Step Up",
                "Start with one foot fully on a box with the other foot on the floor. Powerfully drive off of your box foot and jump straight up into the air. Switch legs while you are in the air and land soft. Repeat as soon as you land, alternating legs."
                , "https://www.youtube.com/watch?v=dQqApCGd5Ss","x22",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Butt%2Fbutt5.gif?alt=media&token=ccf7dca8-6b1f-42ae-8e6a-e6bbd62c4885",
                "Butt"
                );

        AddNewExercise("Side Lunge to Curtsy Lunge",
                "The curtsy lunge targets the main muscles involved in a lunge — the quads and glutes — but also engages some additional movers."
           , "https://www.youtube.com/watch?v=Y6U998ea0-8","x18",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Butt%2Fbutt6.gif?alt=media&token=43a17f07-d311-4a3a-a29f-8a2faae81c15",
                "Butt");

        AddNewExercise("Hamstring curls",
                "Lay down on your belly with the resistance bands tucked at ground level, closed in a loop around your ankles. Curl your legs to a 90 degrees angle."
              , "https://www.youtube.com/watch?v=bSlCgbL5HZ8","x22",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Butt%2Fbutt7.gif?alt=media&token=bd071e2b-373a-4f36-8489-c209ebc0a490",
                "Butt");

        AddNewExercise("Side Lying Hip Abduction",
                "Let's begin by lying down on a flat surface on either side. Let's begin with your right side. Place your left arms extended out resting on your left leg. Your left leg will be on top of your right leg. Toes point out."
                , "https://www.youtube.com/watch?v=ifF1BPzUwU4","x22",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Butt%2Fbutt8.gif?alt=media&token=0a0c01c6-fa52-4a54-a5a9-1699ccea0862",
                "Butt");
        AddNewExercise("Glute Bridge",
                "Lie on the floor with your knees bent and feet flat on the floor." +
                        "Push your hips into the air using your buttocks muscles and keep your back straight and in alignment with your hips. Avoid arching your back."
               , "https://www.youtube.com/watch?v=wPM8icPu6H8","x26",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Butt%2Fbutt9.gif?alt=media&token=6f4729e4-674d-4b02-b1b6-d852ed5acb30",
                "Butt");
        AddNewExercise("Clamshell",
                "Can Glute Exercises for women at home aid in achieving a firm, round and lifted rear? Basing on how your behind is structured, following is discussion on the exercises, how best to do them plus tips on what to eat to get quick results."
               , "https://www.youtube.com/watch?v=7iXpLxKs1sY","x20",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Butt%2Fbutt10.gif?alt=media&token=b73676bf-9345-404c-b1c0-278ab60c1037",
                "Butt");

    }
    public static void SetAbsExercise(){
        AddNewExercise("1/8.JUMPING SQUATS",
                "Start in the squat position, then jump up using your abdominal muscles for strength. This exercise works your abdomen."
                , "https://www.youtube.com/watch?v=U4s4mEQ5VqU","x16",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Abs%2Fabs1.gif?alt=media&token=14aa85c2-5022-4cff-b7ca-eee2f5434b69",
                "Abs");
        AddNewExercise("2/8.REVERSE CRUNCHES",
                "Lie on your back with your knees up at a 90 degree angle and your hands behind your head. Lift your upper body and thighs, and then stretch out. Repeat this exercise."
                , "https://www.youtube.com/watch?v=hyv14e2QDq0","x22",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Abs%2Fabs2.gif?alt=media&token=9e301f7d-ec21-4271-98e1-19074cb24a40",
                "Abs");
        AddNewExercise("3/8.Up Down Plank",
                "The up and down plank strengthens and tones your core, glutes, arms, wrists, and shoulders. This exercise helps to improve your posture, tightens the midsection and boosts weight loss."
                , "https://www.youtube.com/watch?v=L4oFJRDAU4Q","x18",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Abs%2Fabs3.gif?alt=media&token=f0b373d6-fb44-45c7-b16d-773d5dbb7909",
                "Abs");
        AddNewExercise("4/8.RUSSIAN TWIST",
                "Sit on the floor with your knees bent, feet lifted a little bit and back tilted backwards.Then hold your hands together and twist from side to side."
                , "https://www.youtube.com/watch?v=wkD8rjkodUI","x24",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Abs%2Fabs4.gif?alt=media&token=45eac26d-953a-4224-8310-40762b581870",
                "Abs");
        AddNewExercise("5/8.BIRD DOG",
                "Start with your knees under your butt and your hands under your shoulders. Then stretch your right leg and left arm at the same time. Hold for five seconds, then go back and repeat with the other side."
                , "https://www.youtube.com/watch?v=wiFNA3sqjCA","x22",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Abs%2Fabs5.gif?alt=media&token=d82744a1-5419-4892-9b33-fe9610f87731",
                "Abs");

        AddNewExercise("6/8.SURFER BURPEES ",
                "Stand with your feet shoulder width apart, then put your hands on the ground and kick your feet backward. Do a quick push-up and then jump up."
                , "https://www.youtube.com/watch?v=wPVQ8EMfbrQ","x26",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Abs%2Fabs6.gif?alt=media&token=2e943e8c-e713-459b-961f-3ea6c08f4014",
                "Abs");
        AddNewExercise("7/8.Bent Leg Jackknife ",
                "The bent leg jackknife fully engages the abdominal wall and helps to strengthen and tighten the core. This exercise also challenges your back muscles, improve posture and prevents lower back pain injury."
                , "https://www.youtube.com/watch?v=CWOZyf8kaH0","x20",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Abs%2Fabs7.gif?alt=media&token=b97b4eb1-b14d-4223-aa58-a1d03ccf8a12",
                "Abs");
        AddNewExercise("8/8.PUSH-UPS",
                "Lay prone on the ground with arms supporting your body. Keep your body straight while raising and lowering your body with your arms. This exercise works the chest, shoulders, triceps, back and legs."
                , "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Abs%2Fabs9.gif?alt=media&token=78da18e5-851c-4a1e-9fb8-6b222994a8d2","x22",
                "https://www.youtube.com/watch?v=1Bj5PPxgEwo",
                "Abs");

}
    public  static void SetClassicExercise(){

    AddNewExercise("1/8.Big Arm Circles",
            "Stand with your feet shoulder-width apart and extend your arms parallel to the floor.Circle your arms forward using small controlled motions, gradually making the circles bigger until you feel a stretch in your triceps.Reverse the direction of the circles after about 10 seconds."
            ,  "https://youtu.be/OV6toXTWzR8","x22",
            "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Arm%2Farm8.gif?alt=media&token=a65e13b9-d839-4b0b-9a85-4bfed9c1f05c","Classic");

    AddNewExercise("2/8.Concentration Curls",
            "Sit on a bench that’s set at a height so your knees are bent at 90° with your feet flat on the floor. Pick up a dumbbell in your right hand and place the back of your upper right arm on the inner part of your right thigh. Your arm should be extended holding the weight off the floor.Slowly curl the weight up, only moving your forearms – the position of your upper arm on your thigh will help you keep it still during the exercise. At the top of the move, pause for a beat and squeeze your biceps, then slowly lower the weight back to the start. Do all your reps on one arm, then switch to the other."
            , "https://youtu.be/Jvj2wV0vOYU","x18",
            "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Arm%2Farm9.gif?alt=media&token=b32c3f27-c6d7-4b24-a28d-1a428270af3e","Classic");

    AddNewExercise("3/8.Up Down Plank",
            "The up and down plank strengthens and tones your core, glutes, arms, wrists, and shoulders. This exercise helps to improve your posture, tightens the midsection and boosts weight loss."
            , "https://www.youtube.com/watch?v=L4oFJRDAU4Q","x18",
            "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Abs%2Fabs3.gif?alt=media&token=f0b373d6-fb44-45c7-b16d-773d5dbb7909",
            "Classic");
    AddNewExercise("4/8.RUSSIAN TWIST",
            "Sit on the floor with your knees bent, feet lifted a little bit and back tilted backwards.Then hold your hands together and twist from side to side."
            , "https://www.youtube.com/watch?v=wkD8rjkodUI","x24",
            "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Abs%2Fabs4.gif?alt=media&token=45eac26d-953a-4224-8310-40762b581870",
            "Classic");
    AddNewExercise("5/8.Forward Jump Shuffle Back",
            "if You're Tring to increase Speed,agility and explosiveness and get a great cardio boost while also working Your quads,add the Forward Jump Shuffle back to your workouts."
            , "https://www.youtube.com/watch?v=p7RcBP6VM5c","x22","https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Leg%2Fleg8.gif?alt=media&token=2b7c7f09-6cdc-4e54-be0e-fb1e0339396a"
            ,"Classic");
    AddNewExercise("6/8.Bulgarian Split Squat",
            "This challenge starts with a full-body strength-training workout that will keep you moving for about 40 minutes. Best of all, you don't need any equipment for"
            , "https://www.youtube.com/watch?v=QD4P9Di7L20","x20",
            "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Leg%2Fleg2.gif?alt=media&token=ea886d75-79d2-45c8-8588-789346d0f33a"
            ,"Classic");

    AddNewExercise("7/8.Side Lunge to Curtsy Lunge",
            "The curtsy lunge targets the main muscles involved in a lunge — the quads and glutes — but also engages some additional movers."
            , "https://www.youtube.com/watch?v=Y6U998ea0-8","x18",
            "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Butt%2Fbutt6.gif?alt=media&token=43a17f07-d311-4a3a-a29f-8a2faae81c15",
            "Classic");

    AddNewExercise("8/8.Hamstring curls",
            "Lay down on your belly with the resistance bands tucked at ground level, closed in a loop around your ankles. Curl your legs to a 90 degrees angle."
            , "https://www.youtube.com/watch?v=bSlCgbL5HZ8","x22",
            "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Butt%2Fbutt7.gif?alt=media&token=bd071e2b-373a-4f36-8489-c209ebc0a490",
            "Classic");

}
    public  static void SetSleepyExercise(){
        AddNewExercise("1/8.Bicep Curls",
                "Start standing with a dumbbell in each hand. Your elbows should rest at your sides and your forearms should extend out in front of your body. Your knees should stay slightly bent and your belly button should draw into the spine.Bring the dumbbells all the way up to your shoulders by bending your elbows. Once at the top, hold for a second by squeezing the muscle.Reverse the curl slowly and repeat."
                , "https://youtu.be/ykJmrZ5v0Oo","x20"
                ,"https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Arm%2Farm7.gif?alt=media&token=2b89a532-ce50-4531-a476-7f58b5452946","Sleepy");

        AddNewExercise("2/8.Big Arm Circles",
                "Stand with your feet shoulder-width apart and extend your arms parallel to the floor.Circle your arms forward using small controlled motions, gradually making the circles bigger until you feel a stretch in your triceps.Reverse the direction of the circles after about 10 seconds."
                ,  "https://youtu.be/OV6toXTWzR8","x22",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Arm%2Farm8.gif?alt=media&token=a65e13b9-d839-4b0b-9a85-4bfed9c1f05c","Sleepy");

        AddNewExercise("3/8. Jump Squats",
                "To Full Engage Your Quads When Doing Squats or Modified Version,Like the 180 Jump Squat ,Keep Your Torso as Upright as Possible and Maintain a Maintain a narrow Stance."
                ,"https://www.youtube.com/watch?v=M41E8-KcNH8","x18",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Leg%2Fleg4.gif?alt=media&token=b1daff9d-88f5-43ae-8500-96d0a2acbbfe"
                ,"Sleepy");

        AddNewExercise("4/8.Skating Windmill",
                "This intense Cardiovascular move improves Muscle Endurance and Strength, Promotes Weight Loss and Tones the glutes and quads."
                , "https://www.youtube.com/watch?v=0-Kw0wbtmSM","x22","https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Leg%2Fleg5.gif?alt=media&token=4a2cd729-1b9b-4037-b832-01a1c03fd9fb"
                ,"Sleepy");

        AddNewExercise("5/8.Side Lunge to Curtsy Lunge",
                "The curtsy lunge targets the main muscles involved in a lunge — the quads and glutes — but also engages some additional movers."
                , "https://www.youtube.com/watch?v=Y6U998ea0-8","x18",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Butt%2Fbutt6.gif?alt=media&token=43a17f07-d311-4a3a-a29f-8a2faae81c15",
                "Sleepy");

        AddNewExercise("6/8.Hamstring curls",
                "Lay down on your belly with the resistance bands tucked at ground level, closed in a loop around your ankles. Curl your legs to a 90 degrees angle."
                , "https://www.youtube.com/watch?v=bSlCgbL5HZ8","x22",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Butt%2Fbutt7.gif?alt=media&token=bd071e2b-373a-4f36-8489-c209ebc0a490",
                "Sleepy");
        AddNewExercise("7/8.Up Down Plank",
                "The up and down plank strengthens and tones your core, glutes, arms, wrists, and shoulders. This exercise helps to improve your posture, tightens the midsection and boosts weight loss."
                , "https://www.youtube.com/watch?v=L4oFJRDAU4Q","x18",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Abs%2Fabs3.gif?alt=media&token=f0b373d6-fb44-45c7-b16d-773d5dbb7909",
                "Sleepy");
        AddNewExercise("8/8.RUSSIAN TWIST",
                "Sit on the floor with your knees bent, feet lifted a little bit and back tilted backwards.Then hold your hands together and twist from side to side."
                , "https://www.youtube.com/watch?v=wkD8rjkodUI","x24",
                "https://firebasestorage.googleapis.com/v0/b/workout-app-e12e9.appspot.com/o/Abs%2Fabs4.gif?alt=media&token=45eac26d-953a-4224-8310-40762b581870",
                "Sleepy");


    }


}
