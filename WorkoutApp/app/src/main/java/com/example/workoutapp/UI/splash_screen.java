package com.example.workoutapp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.workoutapp.R;

public class splash_screen extends AppCompatActivity {
    TextView LoseWeight,in30days;
    View Line;
    Animation frombottom,fromrighttoleft,fromlefttoright;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        LoseWeight=findViewById(R.id.loseweight);
        in30days=findViewById(R.id.in30days);
        Line=findViewById(R.id.line);

        frombottom= AnimationUtils.loadAnimation(this,R.anim.frombottom);

        fromrighttoleft= AnimationUtils.loadAnimation(this,R.anim.fromrighttoleft);
        fromlefttoright= AnimationUtils.loadAnimation(this,R.anim.fromlefttoright);

        LoseWeight.setAnimation(fromrighttoleft);
        in30days.setAnimation(fromlefttoright);

        Line.animate().scaleX(1).setDuration(2000).start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               startActivity(new Intent(splash_screen.this, Login_Activity.class));
               finish();
            }
        },4000);

    }
}