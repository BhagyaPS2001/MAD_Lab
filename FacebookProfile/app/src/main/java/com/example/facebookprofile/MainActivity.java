package com.example.facebookprofile;

import static com.example.facebookprofile.R.id.logBtn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginButton,signupButton;
    EditText userEmail,userPass;
    SharedPreferencesManager sharedPreferencesManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton=findViewById(R.id.logBtn);
        signupButton=findViewById(R.id.SignupBtn);
        userEmail=findViewById(R.id.userTxt);
        userPass=findViewById(R.id.pwdTxt);

        sharedPreferencesManager = new SharedPreferencesManager(this);
        String email = sharedPreferencesManager.getEmail();
        String pass = sharedPreferencesManager.getPass();

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this, SignUp.class);
                startActivity(intent1);
            }
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredEmail = userEmail.getText().toString();
                String enteredPassword = userPass.getText().toString();

                if(enteredEmail.isEmpty() || enteredPassword.isEmpty() ){
                    Toast.makeText(MainActivity.this, "Please fill the fields", Toast.LENGTH_LONG).show();
                }
                else if(email.equals(enteredEmail) && pass.equals(enteredPassword)){
                    Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                    Intent intent1=new Intent(MainActivity.this,Home.class);
                    startActivity(intent1);
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}