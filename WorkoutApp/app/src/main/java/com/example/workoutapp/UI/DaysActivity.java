package com.example.workoutapp.UI;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.workoutapp.R;

public class DaysActivity extends AppCompatActivity {
    int count=0; boolean is1=false,is2=false,is3=false,is4=false,is5=false,is6=false,is7=false;
    CheckBox r1,r2,r3,r4,r5,r6,r7;
    TextView t1,t2,t3,t4,t5,t6,t7,number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days);

        number=(TextView)findViewById(R.id.num);

        r1=(CheckBox)findViewById(R.id.sun);
        r2=(CheckBox)findViewById(R.id.mon);
        r3=(CheckBox)findViewById(R.id.tues);
        r4=(CheckBox)findViewById(R.id.wednes);
        r5=(CheckBox)findViewById(R.id.thurs);
        r6=(CheckBox)findViewById(R.id.fri);
        r7=(CheckBox)findViewById(R.id.satur);

        t1=(TextView)findViewById(R.id.sunday);
        t2=(TextView)findViewById(R.id.monday);
        t3=(TextView)findViewById(R.id.tuesday);
        t4=(TextView)findViewById(R.id.wednesday);
        t5=(TextView)findViewById(R.id.thursday);
        t6=(TextView)findViewById(R.id.friday);
        t7=(TextView)findViewById(R.id.saturday);


        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(is1){
                    is1=false; count--;
                    t1.setTextColor(Color.parseColor("#818080"));
                    number.setText(Integer.toString(count));
                }
                else {
                    t1.setTextColor(getResources().getColor(R.color.blue_color));
                    count++;
                    is1 = true;
                    number.setText(Integer.toString(count));
                    number.setTextColor(getResources().getColor(R.color.blue_color));
                }
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(is2){
                    is2=false; count--;
                    t2.setTextColor(Color.parseColor("#818080"));
                    number.setText(Integer.toString(count));
                }
                else {
                    t2.setTextColor(getResources().getColor(R.color.blue_color));
                    count++;
                    is2 = true;
                    number.setText(Integer.toString(count));
                    number.setTextColor(getResources().getColor(R.color.blue_color));
                }
            }
        });

        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(is3){
                    is3=false; count--;
                    t3.setTextColor(Color.parseColor("#818080"));
                    number.setText(Integer.toString(count));
                }
                else {
                    t3.setTextColor(getResources().getColor(R.color.blue_color));
                    count++;
                    is3 = true;
                    number.setText(Integer.toString(count));
                    number.setTextColor(getResources().getColor(R.color.blue_color));
                }
            }
        });


        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(is4){
                    is4=false; count--;
                    t4.setTextColor(Color.parseColor("#818080"));
                    number.setText(Integer.toString(count));
                }
                else {
                    t4.setTextColor(getResources().getColor(R.color.blue_color));
                    count++;
                    is4 = true;
                    number.setText(Integer.toString(count));
                    number.setTextColor(getResources().getColor(R.color.blue_color));
                }
            }
        });

        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(is5){
                    is5=false; count--;
                    t5.setTextColor(Color.parseColor("#818080"));
                    number.setText(Integer.toString(count));
                }
                else {
                    t5.setTextColor(getResources().getColor(R.color.blue_color));
                    count++;
                    is5 = true;
                    number.setText(Integer.toString(count));
                    number.setTextColor(getResources().getColor(R.color.blue_color));
                }
            }
        });

        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(is6){
                    is6=false; count--;
                    t6.setTextColor(Color.parseColor("#818080"));
                    number.setText(Integer.toString(count));
                }
                else {
                    t6.setTextColor(getResources().getColor(R.color.blue_color));
                    count++;
                    is6 = true;
                    number.setText(Integer.toString(count));
                    number.setTextColor(getResources().getColor(R.color.blue_color));
                }
            }
        });

        r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(is7){
                    is7=false; count--;
                    t7.setTextColor(Color.parseColor("#818080"));
                    number.setText(Integer.toString(count));
                }
                else {
                    t7.setTextColor(getResources().getColor(R.color.blue_color));
                    count++;
                    is7 = true;
                    number.setText(Integer.toString(count));
                    number.setTextColor(getResources().getColor(R.color.blue_color));
                }
            }
        });

        Button b= (Button)findViewById(R.id.next);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t=new Intent(DaysActivity.this, LevelActivity.class);
                startActivity(t);
            }
        });
    }
}