package com.example.fragment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new FragmentA())
                    .commit();
        }
    }

    public void navigateToFragmentB() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new FragmentB())
                .addToBackStack(null)
                .commit();
    }
}