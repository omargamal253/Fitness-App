package com.example.workoutapp.UI;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Tayba on 6/27/2020.
 */

public class ConnectDatabase {
    private static String Classes="net.sourceforge.jtds.jdbc.Driver";
    Connection connection=null;
    public Connection connectDB(){
        StrictMode.ThreadPolicy policy=new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        try{
            Class.forName(Classes);
            connection= DriverManager.getConnection("jdbc:jtds:sqlserver://sql5064.site4now.net;databaseName=DB_A67ABE_workout;user=DB_A67ABE_workout_admin;password=W123456789;");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

}
