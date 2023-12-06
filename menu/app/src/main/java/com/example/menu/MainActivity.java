package com.example.menu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar tool;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDefaultDisplayHomeAsUpEnabled(true);
        tool=findViewById(R.id.bar);
        setSupportActionBar(tool);
    }

    private void setSupportActionBar(Toolbar tool) {
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.m1){
            Toast.makeText(this, "item1", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.m2) {
            Toast.makeText(this, "item2", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);

    }
}