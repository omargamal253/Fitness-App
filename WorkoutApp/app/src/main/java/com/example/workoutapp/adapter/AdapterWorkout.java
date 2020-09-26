package com.example.workoutapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.workoutapp.R;
import com.example.workoutapp.UI.ExDesActivity;
import com.example.workoutapp.UI.ExerciseActivity;
import com.example.workoutapp.data.ExData;
import com.example.workoutapp.model.Workout_Item;
import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.util.ArrayList;

public class AdapterWorkout extends RecyclerView.Adapter<AdapterWorkout.MyViewHolder> {
    private ArrayList<Workout_Item> data;
    private Context context;

    public AdapterWorkout(ArrayList<Workout_Item> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public AdapterWorkout.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.view_workout_item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        int top = (int) context.getResources().getDimension(R.dimen.margin8dp);
        int bottom = (int) context.getResources().getDimension(R.dimen.margin8dp);
        int left = (int) context.getResources().getDimension(R.dimen.marginSize);
        int right = (int) context.getResources().getDimension(R.dimen.marginSize);
        if (position == 0){
            top = 0;
        }else{
            top =  (int) context.getResources().getDimension(R.dimen.margin8dp);
        }

        if (position==data.size()-1){
            bottom= (int) context.getResources().getDimension(R.dimen.margin8dp);
        }

        holder.Type.setText(data.get(position).Type.toString());
        holder.Desc.setText(data.get(position).Desc.toString());
        Picasso.get().load(data.get(position).img).into(holder.img);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(holder.itemView.getLayoutParams());
        marginLayoutParams.setMargins(0,top,0,bottom);
        holder.itemView.setLayoutParams(marginLayoutParams);


        holder.instructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if(data.get(position).Type.equals("Classic")){
                 Intent intent = new Intent(context, ExDesActivity.class);
                 intent.putExtra("ExerciseName","Classic");
              //   intent.putExtra("ExerciseList", (Serializable) ExData.getInstance().getClassicExercises());
                 context.startActivity(intent);
             }
                if(data.get(position).Type.equals("Abs Workout")){
                    Intent intent = new Intent(context, ExDesActivity.class);
                    intent.putExtra("ExerciseName","Abs");
                    //   intent.putExtra("ExerciseList", (Serializable) ExData.getInstance().getClassicExercises());
                    context.startActivity(intent);
                }
                if(data.get(position).Type.equals("Butt Workout")){
                    Intent intent = new Intent(context, ExDesActivity.class);
                    intent.putExtra("ExerciseName","Butt");
                //    intent.putExtra("ExerciseList", (Serializable) ExData.getInstance().getButtExercises());
                    context.startActivity(intent);
                }
              else  if(data.get(position).Type.equals("Leg Workout")){
                    Intent intent = new Intent(context, ExDesActivity.class);
                    intent.putExtra("ExerciseName","Leg");
                //    intent.putExtra("ExerciseList", (Serializable) ExData.getInstance().getLegExercises());
                    context.startActivity(intent);
                }
                else  if(data.get(position).Type.equals("Arm Workout")){
                    Intent intent = new Intent(context, ExDesActivity.class);
                    intent.putExtra("ExerciseName","Arm");
                //    intent.putExtra("ExerciseList", (Serializable) ExData.getInstance().getArmExercises());
                    context.startActivity(intent);
                }
                else  if(data.get(position).Type.equals("Sleepy Time Stretch")){
                    Intent intent = new Intent(context, ExDesActivity.class);
                    intent.putExtra("ExerciseName","Sleepy");
                    //    intent.putExtra("ExerciseList", (Serializable) ExData.getInstance().getArmExercises());
                    context.startActivity(intent);
                }
            }
        });
        holder.Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data.get(position).Type.equals("Classic")){
                    Intent intent = new Intent(context, ExerciseActivity.class);
                    intent.putExtra("ExerciseName","Classic");
                   // intent.putExtra("ExerciseList", (Serializable) ExData.getInstance().getClassicExercises());
                    context.startActivity(intent);
                }
                if(data.get(position).Type.equals("Abs Workout")){
                    Intent intent = new Intent(context, ExerciseActivity.class);
                    intent.putExtra("ExerciseName","Abs");
                    // intent.putExtra("ExerciseList", (Serializable) ExData.getInstance().getClassicExercises());
                    context.startActivity(intent);
                }

                else  if(data.get(position).Type.equals("Butt Workout")){
                    Intent intent = new Intent(context, ExerciseActivity.class);
                    intent.putExtra("ExerciseName","Butt");
                  //  intent.putExtra("ExerciseList", (Serializable) ExData.getInstance().getButtExercises());
                    context.startActivity(intent);
                }
                else  if(data.get(position).Type.equals("Leg Workout")){
                    Intent intent = new Intent(context, ExerciseActivity.class);
                    intent.putExtra("ExerciseName","Leg");
               //     intent.putExtra("ExerciseList", (Serializable) ExData.getInstance().getLegExercises());
                    context.startActivity(intent);
                }
                else  if(data.get(position).Type.equals("Arm Workout")){
                    Intent intent = new Intent(context, ExerciseActivity.class);
                    intent.putExtra("ExerciseName","Arm");
               //     intent.putExtra("ExerciseList", (Serializable) ExData.getInstance().getArmExercises());
                    context.startActivity(intent);
                }
                else  if(data.get(position).Type.equals("Sleepy Time Stretch")){
                    Intent intent = new Intent(context, ExerciseActivity.class);
                    intent.putExtra("ExerciseName","Sleepy");
                    //     intent.putExtra("ExerciseList", (Serializable) ExData.getInstance().getArmExercises());
                    context.startActivity(intent);
                }

            }
        });


    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView img;
        public TextView Type;
        public TextView Desc;
        public  TextView instructions;
        public TextView Start;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.imgWorkout);
            Type=itemView.findViewById(R.id.Workout_Type);
            Desc=itemView.findViewById(R.id.Desc);
            instructions = itemView.findViewById(R.id.instructions);
            Start = itemView.findViewById(R.id.Start);
        }

    }
}
