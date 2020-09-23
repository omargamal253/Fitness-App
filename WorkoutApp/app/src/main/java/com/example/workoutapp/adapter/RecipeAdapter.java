package com.example.workoutapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.workoutapp.R;
import com.example.workoutapp.model.RecipeModel;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.holder>
{

    ArrayList<RecipeModel> recipeModels;

    public RecipeAdapter(ArrayList<RecipeModel> recipeModels) {

        this.recipeModels = recipeModels;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_card, parent , false);

        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

        holder.imageView.setImageResource(recipeModels.get(position).getImg());
        holder.title.setText(recipeModels.get(position).getTitle());
        holder.des1.setText(recipeModels.get(position).getDescription1());
        holder.des2.setText(recipeModels.get(position).getDescription2());


    }

    @Override
    public int getItemCount() {
        return recipeModels.size();
    }

    class holder extends RecyclerView.ViewHolder
    {

        ImageView imageView;
        TextView des1 , des2 , title;

        public holder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.img_view);
            this.des1 = itemView.findViewById(R.id.txt1);
            this.des2 = itemView.findViewById(R.id.txt2);
            this.title = itemView.findViewById(R.id.title_view);
        }
    }
}
