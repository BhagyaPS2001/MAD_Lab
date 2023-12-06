package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Home_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView nameTextView, emailTextView,genderTextView,dateTextView,pwdTextView;
        SharedPreferencesManager sharedPreferencesManager;

        nameTextView = findViewById(R.id.nameTextView);
        emailTextView = findViewById(R.id.emailTextView);
        genderTextView=findViewById(R.id.gendertextView);
        dateTextView=findViewById(R.id.datetextView);
        pwdTextView=findViewById(R.id.passtextView);
        sharedPreferencesManager = new SharedPreferencesManager(this);

        String name = sharedPreferencesManager.getName();
        String email = sharedPreferencesManager.getEmail();
        String gender = sharedPreferencesManager.getGender();


        nameTextView.setText("Name: " + name);
        emailTextView.setText("Email: " + email);
    }
}