package com.example.workoutapp.UI;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.workoutapp.R;

public class LevelActivity extends AppCompatActivity {
    RelativeLayout r1,r2,r3; boolean x1=false,x2=false,x3=false;
    TextView bt1_txt1,bt1_txt2,bt2_txt1,bt2_txt2,bt3_txt1,bt3_txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        r1=(RelativeLayout)findViewById(R.id.txt_button1);
        bt1_txt1=(TextView)findViewById(R.id.btn1_text1);
        bt1_txt2=(TextView)findViewById(R.id.btn1_text2);

        r2=(RelativeLayout)findViewById(R.id.txt_button2);
        bt2_txt1=(TextView)findViewById(R.id.btn2_text1);
        bt2_txt2=(TextView)findViewById(R.id.btn2_text2);

        r3=(RelativeLayout)findViewById(R.id.txt_button3);
        bt3_txt1=(TextView)findViewById(R.id.btn3_text1);
        bt3_txt2=(TextView)findViewById(R.id.btn3_text2);

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x1=true; x2=false; x3=false;
                r1.setBackground(getResources().getDrawable(R.drawable.text_back));
                bt1_txt1.setTextColor(Color.WHITE);
                bt1_txt2.setTextColor(Color.WHITE);
                r2.setBackground(getResources().getDrawable(R.drawable.normal_back));
                bt2_txt1.setTextColor(Color.parseColor("#818080"));
                bt2_txt2.setTextColor(Color.parseColor("#818080"));
                r3.setBackground(getResources().getDrawable(R.drawable.normal_back));
                bt3_txt1.setTextColor(Color.parseColor("#818080"));
                bt3_txt2.setTextColor(Color.parseColor("#818080"));
            }
        });


        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x1=false; x2=true; x3=false;
                r1.setBackground(getResources().getDrawable(R.drawable.normal_back));
                bt1_txt1.setTextColor(Color.parseColor("#818080"));
                bt1_txt2.setTextColor(Color.parseColor("#818080"));
                r2.setBackground(getResources().getDrawable(R.drawable.text_back));
                bt2_txt1.setTextColor(Color.WHITE);
                bt2_txt2.setTextColor(Color.WHITE);
                r3.setBackground(getResources().getDrawable(R.drawable.normal_back));
                bt3_txt1.setTextColor(Color.parseColor("#818080"));
                bt3_txt2.setTextColor(Color.parseColor("#818080"));
            }
        });


        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x1=false; x2=false; x3=true;
                r1.setBackground(getResources().getDrawable(R.drawable.normal_back));
                bt1_txt1.setTextColor(Color.parseColor("#818080"));
                bt1_txt2.setTextColor(Color.parseColor("#818080"));
                r2.setBackground(getResources().getDrawable(R.drawable.normal_back));
                bt2_txt1.setTextColor(Color.parseColor("#818080"));
                bt2_txt2.setTextColor(Color.parseColor("#818080"));
                r3.setBackground(getResources().getDrawable(R.drawable.text_back));
                bt3_txt1.setTextColor(Color.WHITE);
                bt3_txt2.setTextColor(Color.WHITE);
            }
        });


    }
}