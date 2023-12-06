package com.example.exceptionhandling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ItemAdapter itemAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        try {
            // Create a list of items (replace this with your data source)
            List<Item> itemList = generateItemList();

            // Create the adapter and set it to the RecyclerView
            itemAdapter = new ItemAdapter(itemList);
            recyclerView.setAdapter(itemAdapter);
        } catch (Exception e) {
            // Handle the exception, e.g., display an error message to the user
            Toast.makeText(this, "Error loading data", Toast.LENGTH_SHORT).show();
            Log.e("MainActivity", "Error loading data", e);
        }

        // Create a list of items (replace this with your data source)
        List<Item> itemList = generateItemList();

        // Create the adapter and set it to the RecyclerView
        itemAdapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(itemAdapter);
    }
    private List<Item> generateItemList() {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Item 1"));
        itemList.add(new Item("Item 2"));
        // Add more items as needed
        return itemList;
    }
}