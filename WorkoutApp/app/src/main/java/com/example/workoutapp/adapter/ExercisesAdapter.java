package com.example.workoutapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.workoutapp.R;
import com.example.workoutapp.model.Exercise;

import java.io.Serializable;
import java.util.List;

class exHolder extends  RecyclerView.ViewHolder  {

    ImageView gifImageView, TrainVideo;
    TextView ExName ,ExCount;
    TextView EXDes;
    public exHolder(@NonNull View itemView) {
        super(itemView);
        gifImageView = itemView.findViewById(R.id.gif);
        ExName = itemView.findViewById(R.id.trainName);
        ExCount = itemView.findViewById(R.id.Train_Count);
        EXDes = itemView.findViewById(R.id.trainDes);
        TrainVideo = itemView.findViewById(R.id.TrainVideo);
    }
}

public class ExercisesAdapter extends RecyclerView.Adapter<exHolder> implements Serializable {

    public List<Exercise> Exercises ;
    Context c;
    int mode ;
    public ExercisesAdapter(Context c , List<Exercise> Exercises, int mode){
   this.c =c ;
   this.Exercises =Exercises;
   this.mode =mode;
    }


    public void AddNewExercise(Exercise exercise){
        Exercises.add(exercise);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public exHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.train_item, null) ;

        if(mode==1)  return new exHolder(view) ;

        else if (mode==2) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.train_des_item, null) ;

            exHolder ex  =  new exHolder(view);
            return ex;
        }
        else return  null;

    }

    @Override
    public void onBindViewHolder(@NonNull exHolder holder, final int position) {

        holder.gifImageView.setImageResource(  Exercises.get(position).getResId());
       holder.ExName.setText( Exercises.get(position).getExName());

       if(mode==1)
        holder.ExCount.setText( Exercises.get(position).getExCount());

       if(mode==2) {
           holder.EXDes.setText(Exercises.get(position).exDes);
           holder.TrainVideo.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(Exercises.get(position).exUrl));

                 /*  Intent intent = new Intent(c, ExVideoActivity.class);
                   intent.putExtra("VideoUrl",Exercises.get(position).exUrl);*/
                   c.startActivity(intent);
               }
           });
       }


    }

    @Override
    public int getItemCount() {
        return Exercises.size();
    }
}
