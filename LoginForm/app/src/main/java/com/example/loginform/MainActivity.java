package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String userName = "Rohit";
    Integer pwd = 1234;
    EditText uname, pass;
    Button logBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logBtn = findViewById(R.id.login);
        uname = findViewById(R.id.username);
        pass = findViewById(R.id.password);

        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enterUsername = uname.getText().toString();
                String enterPassword = pass.getText().toString();

                if (enterUsername.equals(userName) && enterPassword.equals(pwd.toString())) {
                    Toast.makeText(MainActivity.this, "Logged in Successfully!!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
