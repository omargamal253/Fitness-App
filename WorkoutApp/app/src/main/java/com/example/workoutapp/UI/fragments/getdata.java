package com.example.workoutapp.UI.fragments;

import android.content.Context;
import android.widget.Toast;

import com.example.workoutapp.UI.ConnectDatabase;
import com.example.workoutapp.model.Workout_Item;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class getdata {
    private ConnectDatabase   db = new ConnectDatabase();
    private java.sql.Connection con ;
    private ArrayList<Workout_Item> workouts;
    private Context context;
    public getdata(Context context){

        con = db.connectDB();
        this.context=context;

    }
     public ArrayList<Workout_Item>getAllWourkout(){
         workouts=new ArrayList<Workout_Item>();
         if(con==null){
             Toast.makeText(context,"Check Internet",Toast.LENGTH_LONG).show();
         }
         else {
             try {

                 Statement stmt = con.createStatement();
                 ResultSet n = stmt.executeQuery("select * from Workouts");
                 n.next();
                 do {
                     Workout_Item item = new Workout_Item(n.getString(3), n.getString(2), n.getString(1));
                     workouts.add(item);
                 } while (n.next());
             } catch (SQLException e) {
                 e.printStackTrace();
                 Toast.makeText(context,e.getMessage().toString()+"",Toast.LENGTH_LONG).show();
             }
         }
         return workouts;
     }
}
