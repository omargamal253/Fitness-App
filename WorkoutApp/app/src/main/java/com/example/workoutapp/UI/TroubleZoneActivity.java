package com.example.workoutapp.UI;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.workoutapp.R;

public class TroubleZoneActivity extends AppCompatActivity {

    TextView abs1,abs2,arm1,arm2,leg1,che1,che2;
    CheckBox ch_abs,ch_arm,ch_leg,ch_chest;
    RelativeLayout ab,ar,le,che;
    TextView t1,t2,t3,t4;
    boolean b1=false,b2=false,b3=false,b4=false;
    boolean boo_abs=false,boo_arm=false,boo_leg=false,boo_chest=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trouble_zone);


        ab=(RelativeLayout)findViewById(R.id.abs);
        ar=(RelativeLayout)findViewById(R.id.arm);
        le=(RelativeLayout)findViewById(R.id.leg);
        che=(RelativeLayout)findViewById(R.id.chest);

        //text of button
        t1=(TextView)findViewById(R.id.abs_text);
        t2=(TextView)findViewById(R.id.arm_text);
        t3=(TextView)findViewById(R.id.leg_text);
        t4=(TextView)findViewById(R.id.chest_text);

        abs1=(TextView)findViewById(R.id.aaa1);
        abs2=(TextView)findViewById(R.id.aaa2);
        arm1=(TextView)findViewById(R.id.arr);
        arm2=(TextView)findViewById(R.id.arr2);
        leg1=(TextView)findViewById(R.id.leg1);
        che1=(TextView)findViewById(R.id.chest1);
        che2=(TextView)findViewById(R.id.chest2);

        ch_abs=(CheckBox)findViewById(R.id.ch_abs);
        ch_arm=(CheckBox)findViewById(R.id.ch_arm);
        ch_leg=(CheckBox)findViewById(R.id.ch_leg);
        ch_chest=(CheckBox)findViewById(R.id.ch_chest);


        //RelativeLayout Event
        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boo_abs=true; boo_arm=false; boo_leg=false; boo_chest=false;
                b1=!b1;

                if(!b1){
                    t1.setTextColor(Color.parseColor("#818080"));
                    ab.setBackground(getResources().getDrawable(R.drawable.normal_back));
                    ch_abs.setChecked(false);
                    abs1.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    abs2.setBackground(getResources().getDrawable(R.drawable.line_normal));
                }
                else{
                    t1.setTextColor(Color.WHITE);
                    t2.setTextColor(Color.parseColor("#818080"));
                    t3.setTextColor(Color.parseColor("#818080"));
                    t4.setTextColor(Color.parseColor("#818080"));

                    ab.setBackground(getResources().getDrawable(R.drawable.text_back));
                    ar.setBackground(getResources().getDrawable(R.drawable.normal_back));
                    le.setBackground(getResources().getDrawable(R.drawable.normal_back));
                    che.setBackground(getResources().getDrawable(R.drawable.normal_back));

                    ch_abs.setChecked(true);
                    ch_arm.setChecked(false);
                    ch_leg.setChecked(false);
                    ch_chest.setChecked(false);

                    abs1.setBackground(getResources().getDrawable(R.drawable.text_back));
                    abs2.setBackground(getResources().getDrawable(R.drawable.text_back));
                    arm1.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    arm2.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    leg1.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    che1.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    che2.setBackground(getResources().getDrawable(R.drawable.line_normal));
                }
            }
        });

        //arm event
        ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boo_abs=false; boo_arm=true; boo_leg=false; boo_chest=false;
                b2=!b2;

                if(!b2){
                    t2.setTextColor(Color.parseColor("#818080"));
                    ar.setBackground(getResources().getDrawable(R.drawable.normal_back));
                    ch_arm.setChecked(false);
                    arm1.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    arm2.setBackground(getResources().getDrawable(R.drawable.line_normal));
                }
                else{
                    t2.setTextColor(Color.WHITE);
                    t1.setTextColor(Color.parseColor("#818080"));
                    t3.setTextColor(Color.parseColor("#818080"));
                    t4.setTextColor(Color.parseColor("#818080"));

                    ar.setBackground(getResources().getDrawable(R.drawable.text_back));
                    ab.setBackground(getResources().getDrawable(R.drawable.normal_back));
                    le.setBackground(getResources().getDrawable(R.drawable.normal_back));
                    che.setBackground(getResources().getDrawable(R.drawable.normal_back));

                    ch_arm.setChecked(true);
                    ch_abs.setChecked(false);
                    ch_leg.setChecked(false);
                    ch_chest.setChecked(false);

                    arm1.setBackground(getResources().getDrawable(R.drawable.text_back));
                    arm2.setBackground(getResources().getDrawable(R.drawable.text_back));
                    abs1.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    abs2.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    leg1.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    che1.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    che2.setBackground(getResources().getDrawable(R.drawable.line_normal));
                }
            }
        });

        //leg event
        le.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boo_abs=false; boo_arm=false; boo_leg=true; boo_chest=false;
                b3=!b3;

                if(!b3){
                    t3.setTextColor(Color.parseColor("#818080"));
                    le.setBackground(getResources().getDrawable(R.drawable.normal_back));
                    ch_leg.setChecked(false);
                    leg1.setBackground(getResources().getDrawable(R.drawable.line_normal));
                }
                else{
                    t3.setTextColor(Color.WHITE);
                    t1.setTextColor(Color.parseColor("#818080"));
                    t2.setTextColor(Color.parseColor("#818080"));
                    t4.setTextColor(Color.parseColor("#818080"));

                    le.setBackground(getResources().getDrawable(R.drawable.text_back));
                    ab.setBackground(getResources().getDrawable(R.drawable.normal_back));
                    ar.setBackground(getResources().getDrawable(R.drawable.normal_back));
                    che.setBackground(getResources().getDrawable(R.drawable.normal_back));

                    ch_leg.setChecked(true);
                    ch_abs.setChecked(false);
                    ch_arm.setChecked(false);
                    ch_chest.setChecked(false);

                    arm1.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    arm2.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    abs1.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    abs2.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    leg1.setBackground(getResources().getDrawable(R.drawable.text_back));
                    che1.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    che2.setBackground(getResources().getDrawable(R.drawable.line_normal));
                }
            }
        });

        //chest event
        che.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boo_abs=false; boo_arm=false; boo_leg=false; boo_chest=true;
                b4=!b4;

                if(!b4){
                    t4.setTextColor(Color.parseColor("#818080"));
                    che.setBackground(getResources().getDrawable(R.drawable.normal_back));
                    ch_chest.setChecked(false);
                    che1.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    che2.setBackground(getResources().getDrawable(R.drawable.line_normal));
                }
                else{
                    t4.setTextColor(Color.WHITE);
                    t1.setTextColor(Color.parseColor("#818080"));
                    t2.setTextColor(Color.parseColor("#818080"));
                    t3.setTextColor(Color.parseColor("#818080"));

                    che.setBackground(getResources().getDrawable(R.drawable.text_back));
                    ab.setBackground(getResources().getDrawable(R.drawable.normal_back));
                    le.setBackground(getResources().getDrawable(R.drawable.normal_back));
                    ar.setBackground(getResources().getDrawable(R.drawable.normal_back));

                    ch_chest.setChecked(true);
                    ch_abs.setChecked(false);
                    ch_leg.setChecked(false);
                    ch_arm.setChecked(false);

                    che1.setBackground(getResources().getDrawable(R.drawable.text_back));
                    che2.setBackground(getResources().getDrawable(R.drawable.text_back));
                    abs1.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    abs2.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    leg1.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    arm1.setBackground(getResources().getDrawable(R.drawable.line_normal));
                    arm2.setBackground(getResources().getDrawable(R.drawable.line_normal));
                }
            }
        });

        //button next
        Button b= (Button)findViewById(R.id.next);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t=new Intent(TroubleZoneActivity.this, DaysActivity.class);
                startActivity(t);
            }
        });
    }
}