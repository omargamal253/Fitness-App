package com.example.workoutapp.UI.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.workoutapp.R;
import com.example.workoutapp.model.perfectWeight;

public class calenderFragment extends Fragment {
    public calenderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View v = inflater.inflate(R.layout.fragment_calender, container, false);

        final perfectWeight pw = new perfectWeight();
        final EditText etxt_weight = (EditText) v.findViewById(R.id.et_weight);
        final EditText etxt_height = (EditText) v.findViewById(R.id.et_height);
        final TextView textView = (TextView) v.findViewById(R.id.txt_viwe);

        Button btn_calc = (Button) v.findViewById(R.id.btn_calc);

        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!(etxt_height.getText().toString().equals("")||etxt_weight.getText().toString().equals("")))
                {
                    float height = Float.parseFloat(etxt_height.getText().toString());
                    float weight = Float.parseFloat(etxt_weight.getText().toString());
                    pw.setWeight(weight);
                    pw.setHeight(height);
                    float perf_weight = pw.calc_weight(height);
                    textView.setText(String.valueOf(perf_weight + "  (kg) "));
                    etxt_height.setText("");
                    etxt_weight.setText("");
                }
                else
                    Toast.makeText(getActivity()," Please enter your Weight and Height ",Toast.LENGTH_LONG ).show();



            }
        });


        return v;

    }
}