package com.example.workoutapp.UI;

import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddUser extends AppCompatActivity {
    private String UserName, Email, PassWord;
    Context context;
    EditText txtUsername;
    public AddUser(Context context,String UserName, String Email, String PassWord,EditText txtUsername) {
        this.UserName = UserName;
        this.Email = Email;
        this.PassWord = PassWord;
        this.context=context;
        this.txtUsername=txtUsername;
    }

    public boolean Add() {
        ConnectDatabase db = new ConnectDatabase();
        java.sql.Connection con = db.connectDB();
        if (con == null) {
            Toast.makeText(context, "Please Check Internet Access", Toast.LENGTH_LONG).show();
        } else {
            try {

                Statement stmt = con.createStatement();
                ResultSet n=stmt.executeQuery("select * from Users where UserName='"+UserName+"'");
                if(n.next()==true) {
                    txtUsername.setError("Not Valid");
                    txtUsername.requestFocus();
                    Toast.makeText(context, "This UserName is already Exist Try Again!! :(", Toast.LENGTH_LONG).show();
                }
                else {
                    String nul = "empty";
                    int x = stmt.executeUpdate("insert into Users values('" + UserName + "','" + PassWord + "','" + Email + "')");
                    if (x == 0) {
                        Toast.makeText(context, "Sorry Try again", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(context, "User has been created succed", Toast.LENGTH_LONG).show();
                        return true;
                    }
                }
            } catch (SQLException e) {
                Toast.makeText(context, "Sorry Error" + e.getMessage() + e.getErrorCode(), Toast.LENGTH_LONG).show();
            }
        }
        return false;
    }
}


