package com.example.explicitintent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callSecondActivity(View view){
        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
        i.putExtra("Value1", "Java");
        i.putExtra("Value2", "Python");
        startActivity(i);
    }
}