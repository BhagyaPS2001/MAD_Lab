package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,email;
    Button logBtn;
    SharedPreferencesManager sharedPreferencesManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.user);
        email=findViewById(R.id.em);
        logBtn=findViewById(R.id.login);
        sharedPreferencesManager = new SharedPreferencesManager(this);

        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=username.getText().toString();
                String emailId=email.getText().toString();

                sharedPreferencesManager.saveUser(name, emailId);

                Intent intent = new Intent(MainActivity.this, Home_Activity.class);
                startActivity(intent);

            }
        });


    }
}