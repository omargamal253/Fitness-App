package com.example.workoutapp.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.workoutapp.R;
import com.example.workoutapp.UI.fragments.WorkoutFragment;
import com.example.workoutapp.UI.fragments.calenderFragment;
import com.example.workoutapp.UI.fragments.mineFragment;
import com.example.workoutapp.UI.fragments.recipesFragment;

public class MainActivity extends AppCompatActivity {
    FrameLayout containe;
    RadioGroup radiogroup_home;
    RadioButton radiobutton_Wokout,radiobutton_Calender,radiobutton_recipes,radiobutton_mine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        containe = (FrameLayout)findViewById(R.id.container);
        radiogroup_home = (RadioGroup)findViewById(R.id.radiogroup_home);
        radiobutton_Wokout = (RadioButton)findViewById(R.id.radiobutton_Wokout);
        radiobutton_Calender = (RadioButton)findViewById(R.id.radiobutton_Calender);
        radiobutton_recipes = (RadioButton)findViewById(R.id.radiobutton_recipes);
        radiobutton_mine = (RadioButton)findViewById(R.id.radiobutton_mine);
        radiobutton_Wokout.setChecked(true);
        showFragment(new WorkoutFragment());

        radiogroup_home.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radiobutton_Wokout :
                        showFragment(new WorkoutFragment());
                        break;
                    case R.id.radiobutton_Calender :
                        showFragment(new calenderFragment());
                        break;
                    case R.id.radiobutton_recipes :
                        showFragment(new recipesFragment());
                        break;
                    case R.id.radiobutton_mine :
                        showFragment(new mineFragment());
                        break;

                }
            }
        });
    }
    private void showFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container,fragment);
        transaction.commit();
    }
}