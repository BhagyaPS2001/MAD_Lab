package com.example.login2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String userName="bhagya";
    String pwd="1234";
    EditText uname,pass;
    Button logBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logBtn=findViewById(R.id.login);
        uname=findViewById(R.id.username);
        pass=findViewById(R.id.password);

        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String enteredUsername = uname.getText().toString();
                String enteredPassword = pass.getText().toString();

                if(enteredUsername.isEmpty() || enteredPassword.isEmpty() ){
                    Toast.makeText(MainActivity.this, "Please fill the fields", Toast.LENGTH_LONG).show();
                }
                else if(uname.equals(userName) && pass.equals(pwd)){
                    Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}