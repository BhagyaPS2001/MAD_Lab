package com.example.adaptersample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    ListView simpleListView;

    // array objects
    String monthList[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleListView = (ListView) findViewById(R.id.simpleListView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.item_view, R.id.itemTextView, monthList);
        simpleListView.setAdapter(arrayAdapter);
    }
}