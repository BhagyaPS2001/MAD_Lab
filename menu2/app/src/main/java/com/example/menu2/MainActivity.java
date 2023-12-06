package com.example.menu2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    Toolbar tool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Menu");
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.example_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }




    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.m1) {
            Intent i1=new Intent(this,section_one_activity.class);
            startActivity(i1);
            return true;
        } else if (id == R.id.m2) {
            Intent i2=new Intent(this,section_two_activity.class);
            startActivity(i2);
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }

    }
}