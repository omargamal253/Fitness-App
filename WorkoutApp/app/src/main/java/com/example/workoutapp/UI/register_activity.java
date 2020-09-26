package com.example.workoutapp.UI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.workoutapp.R;

public class register_activity extends AppCompatActivity {
    Button button_Register;
    EditText username,email,password,retypepassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_activity);
        button_Register=findViewById(R.id.button_Register);
        username=findViewById(R.id.username);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        retypepassword=findViewById(R.id.retypepassword);
        button_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(password.getText().toString().equals(retypepassword.getText().toString())) {
                    AddUser newuser= new AddUser(getApplication(),username.getText().toString(),email.getText().toString(),password.getText().toString(),username);
                    if(newuser.Add()) {
                        startActivity(new Intent(register_activity.this, Login_Activity.class));
                        finish();
                    }
                }
                else{
                    password.setText("");
                    retypepassword.setText("");
                    Toast.makeText(getApplication(),"Two Password Not Identicle",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}