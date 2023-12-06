package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Item> itemList = generateItemList(); // Replace with your data source

        ItemAdapter adapter = new ItemAdapter(this, itemList);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
    private List<Item> generateItemList() {

        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Monday"));
        itemList.add(new Item("Tuesday"));
        itemList.add(new Item("Wednesday"));
        itemList.add(new Item("Thursday"));
        itemList.add(new Item("Friday"));
        return itemList;
    }
}