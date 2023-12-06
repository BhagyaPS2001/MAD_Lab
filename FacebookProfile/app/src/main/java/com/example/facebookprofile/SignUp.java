package com.example.facebookprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    Button loginBtn2,createAcc;
    EditText fname,lname,email,birthdate,gender,password;

    SharedPreferencesManager sharedPreferencesManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        loginBtn2=findViewById(R.id.logBtn2);
        createAcc=findViewById(R.id.regBtn);
        fname=findViewById(R.id.fn);
        lname=findViewById(R.id.ln);
        email=findViewById(R.id.em);
        birthdate=findViewById(R.id.dob);
        gender=findViewById(R.id.gen);
        password=findViewById(R.id.pwd);

        sharedPreferencesManager = new SharedPreferencesManager(this);

        createAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=fname.getText().toString();
                String emailId=email.getText().toString();
                String gen=gender.getText().toString();
                String birth=birthdate.getText().toString();
                String pwd=password.getText().toString();


                sharedPreferencesManager.saveUser(name,emailId,gen,birth,pwd);
                Toast.makeText(SignUp.this, "Account creates successfully", Toast.LENGTH_LONG).show();
            }
        });
        loginBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUp.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}