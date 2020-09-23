package com.example.workoutapp.UI.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.workoutapp.R;
import com.example.workoutapp.adapter.RecipeAdapter;
import com.example.workoutapp.model.RecipeModel;

import java.util.ArrayList;

public class recipesFragment extends Fragment {

    public recipesFragment() {
        // Required empty public constructor
    }

    RecyclerView rec_viwe ;
    RecipeAdapter myAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recipes,container,false);

        rec_viwe = v.findViewById(R.id.rec_view);
        rec_viwe.setLayoutManager(new LinearLayoutManager(getContext()));

        myAdapter = new RecipeAdapter(getmylist());
        rec_viwe.setAdapter(myAdapter);

        return v;
    }
    private ArrayList<RecipeModel> getmylist()
    {
        ArrayList<RecipeModel> mylist = new ArrayList<>();
        RecipeModel m = new RecipeModel();
        m.setTitle("Breakfast");
        m.setDescription1("1 cup of tea or black coffee without sugar and milk");
        m.setDescription2("eats with fat-free milk (oatmeal, cracked wheat or barley) ");
        m.setImg(R.drawable.ic_breakfast);
        mylist.add(m);


        m = new RecipeModel();
        m.setTitle("Snack");
        m.setDescription1("Any no-salted nuts");
        m.setDescription2("1 piece of cheese (salty or low-fat if better) ");
        m.setImg(R.drawable.ic_cinema);
        mylist.add(m);


        m = new RecipeModel();
        m.setTitle("Lunch");
        m.setDescription1("2 pieces of whole-grain toast with vegetables (onions, tomato, lettuce, etc.)");
        m.setDescription2("Any grilled or boiled lean meats (beef, chicken breast, lamb, flank, steak, etc.) ");
        m.setImg(R.drawable.ic_boiled);
        mylist.add(m);

        m = new RecipeModel();
        m.setTitle("Dinner");
        m.setDescription1("Chicken salad (chicken breast, grilled or boiled with some fruits or vegetables)");
        m.setDescription2("Oats with fat-free milk (oatmeal, cracked wheat or barley) ");
        m.setImg(R.drawable.ic_food_serving);

        mylist.add(m);

        return mylist;



    }
}