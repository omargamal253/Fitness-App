package com.example.workoutapp.UI;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.androchef.happytimer.countdowntimer.CircularCountDownView;
import com.androchef.happytimer.countdowntimer.HappyTimer;
import com.bumptech.glide.Glide;
import com.example.workoutapp.R;
import com.example.workoutapp.model.Exercise;

import java.util.List;

public class TimerActivity extends AppCompatActivity {
      CircularCountDownView Timer;
      int RestTime = 5, TrainTime = 5;
    Toolbar toolbar;
    String TitleName;

    ImageView gifImageView;
    TextView ExName ,ExCount,Message;
    List<Exercise> Exercises;

    int CurrentEx ;
    boolean Rest ;

      MediaPlayer player ;
    ImageView StopWatch ,TrainVideo ;
  //  boolean media = false ;

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CurrentUser","onStop");
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        Log.d("CurrentUser","onDestroy");
        player.release();
        Timer.stopTimer();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CurrentUser","onResume");
try{
            player.start();
              Timer.resumeTimer();
        }catch (Exception e ){
            Log.d("CurrentUser",e.getMessage());
        }

    }

    @Override
    protected  void onPause() {

        super.onPause();
        Log.d("CurrentUser","onPause");
        player.pause();
        Timer.pauseTimer();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        toolbar = findViewById(R.id.Toolbar);

        player =  MediaPlayer.create(this, R.raw.clock_tick_tock);

        Exercises =(List<Exercise>)  getIntent().getSerializableExtra("ExerciseList");
       TitleName ="1"+"/"+ String.valueOf(Exercises.size());
        toolbar.setTitle(TitleName);
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorwhite));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        gifImageView = findViewById(R.id.gif);
        ExName = findViewById(R.id.trainName);
        ExCount = findViewById(R.id.Train_Count);
        Message = findViewById(R.id.Message);
     //   gifImageView.setImageResource(Exercises.get(0).getResId());
        Glide.with(this).load(Exercises.get(0).getGifUrl()
        ).into(gifImageView);

        ExName.setText(Exercises.get(0).getExName());
        ExCount.setText(Exercises.get(0).getExCount());
        StopWatch = findViewById(R.id.StopWatch);
        TrainVideo = findViewById(R.id.TrainVideo);


        TrainVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   media = true;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(Exercises.get(CurrentEx).videoUrl));
                startActivity(intent);
            }
        });

        Timer = findViewById(R.id.circularCountDownView);

        Timer.initTimer(TrainTime);
        Timer.startTimer();

        CurrentEx =0; Rest = false;
        player.start();
        //set OnTickListener for getting updates on time. [Optional]
        Timer.setOnTickListener(new HappyTimer.OnTickListener() {
            @Override
            public void onTick(int completedSeconds, int remainingSeconds) {

            //    Log.d("completedSeconds", String.valueOf(completedSeconds));


            }

            @Override
            public void onTimeUp() {
              player.pause();


                if(CurrentEx==Exercises.size()-1){
                    Timer.stopTimer();
                    Message.setVisibility(View.VISIBLE);
                    Message.setText("Well Done");
                    gifImageView.setVisibility(View.INVISIBLE);
                    player.release();
                }else{


                    if(Rest==false){

                        Rest = true;
                        Message.setVisibility(View.VISIBLE);
                        Timer.initTimer(RestTime);
                        Timer.startTimer();
                        gifImageView.setVisibility(View.INVISIBLE);
                        TrainVideo.setVisibility(View.INVISIBLE);

                        StopWatch.setVisibility(View.VISIBLE);



                    }else {
                        player.start();
                                Rest = false;
                        Message.setVisibility(View.INVISIBLE);
                        gifImageView.setVisibility(View.VISIBLE);
                        TrainVideo.setVisibility(View.VISIBLE);
                        Timer.initTimer(TrainTime);
                        Timer.startTimer();
                        CurrentEx++;
                 //       gifImageView.setImageResource(Exercises.get(CurrentEx).getResId());
                        Glide.with(getApplicationContext()).load(Exercises.get(CurrentEx).getGifUrl()
                        ).into(gifImageView);
                        StopWatch.setVisibility(View.INVISIBLE);

                        ExName.setText(Exercises.get(CurrentEx).getExName());
                        ExCount.setText(Exercises.get(CurrentEx).getExCount());

                        TitleName =(CurrentEx+1) +"/"+ String.valueOf(Exercises.size());
                        toolbar.setTitle(TitleName);

                    }


                }


            }
        });


        Timer.setStateChangeListener(new HappyTimer.OnStateChangeListener() {
            @Override
            public void onStateChange(HappyTimer.State state, int completedSeconds, int remainingSeconds) {

            }
        });




    }
}