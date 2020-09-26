package com.example.workoutapp.UI;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.workoutapp.R;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login_Activity extends AppCompatActivity {
    Button login, register;
    EditText username, password;
    CheckBox RememberMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        login=findViewById(R.id.button_login);
        register=findViewById(R.id.button_register);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        RememberMe=findViewById(R.id.rememberme);

        SharedPreferences pref=getSharedPreferences("MyLogin",MODE_PRIVATE);
        String UserName=pref.getString("UserName",null);
        String PassWord=pref.getString("PassWord",null);
        if(UserName !=null &&PassWord!=null){
            Intent m=new Intent(Login_Activity.this, MainActivity.class);
            startActivity(m);
            finish();
        }
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_Activity.this, register_activity.class));
                finish();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectDatabase db = new ConnectDatabase();
                java.sql.Connection con = db.connectDB();
                if (username.getText().toString().isEmpty()) {
                    username.setError("please Enter UserName");
                    username.requestFocus();
                } else if (password.getText().toString().isEmpty()) {
                    password.setError("please Enter PassWord");
                    password.requestFocus();
                    password.setError("Please Enter PassWord");
                }
                if (con == null) {
                    Toast.makeText(getApplication(), "Please Check Internet Access", Toast.LENGTH_LONG).show();
                }
             else{
                    try {
                        Statement stmt = con.createStatement();

                        ResultSet n = stmt.executeQuery("select * from Users where UserName='" + username.getText().toString() + "' and PassWord='" + password.getText().toString() + "'");

                        if (n.next() == true) {
                            Intent i=new Intent(Login_Activity.this, MainActivity.class);
                            startActivity(i);
                            finish();
                            if(RememberMe.isChecked()) {
                                getSharedPreferences("MyLogin",MODE_PRIVATE).edit()
                                        .putString("UserName",username.getText().toString())
                                        .putString("PassWord",password.getText().toString())
                                        .commit();
                            }

                        } else {
                            username.setText("");
                            password.setText("");
                            Toast.makeText(getApplication(), "UserName or PassWord is Not Valid", Toast.LENGTH_LONG).show();

                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }}
            }
        });
    }
}