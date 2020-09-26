package com.example.workoutapp.UI.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.workoutapp.R;
import com.example.workoutapp.UI.DaysActivity;
import com.example.workoutapp.UI.LevelActivity;
import com.example.workoutapp.UI.Login_Activity;
import com.example.workoutapp.UI.MainActivity;
import com.example.workoutapp.UI.TroubleZoneActivity;

public class mineFragment extends Fragment {
    public mineFragment( ) {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_mine, container, false);

        final FragmentActivity c =getActivity();


        LinearLayout line=(LinearLayout)view.findViewById(R.id.layout4);

        LinearLayout training=(LinearLayout)view.findViewById(R.id.layout3);

        LinearLayout zone=(LinearLayout)view.findViewById(R.id.layout2);

        zone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t=new Intent(c, TroubleZoneActivity.class);
                startActivity(t);
            }
        });

        line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t=new Intent(c, LevelActivity.class);
                startActivity(t);
            }
        });

        training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t=new Intent(c, DaysActivity.class);
                startActivity(t);
            }
        });

        LinearLayout logout=(LinearLayout)view.findViewById(R.id.layout10);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.getSharedPreferences("MyLogin",c.MODE_PRIVATE)
                        .edit()
                        .clear()
                        .commit();
                startActivity(new Intent(getContext(),Login_Activity.class));
                MainActivity.fa.finish();

            }
        });


        return view;
    }
}