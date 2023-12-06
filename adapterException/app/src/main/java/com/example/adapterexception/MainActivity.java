package com.example.adapterexception;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {



    // array objects
    String monthList[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.itemText, monthList);
        recyclerView.setAdapter(arrayAdapter);




    }

}