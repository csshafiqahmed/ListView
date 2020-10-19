package com.codestown.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //list view initialization
        ListView myListView = findViewById(R.id.myListView);
        //array creation
//        ArrayList<String> myFamily = new ArrayList<String>();
//        myFamily.add("kashif");
//        myFamily.add("Ahmed");
//        myFamily.add("Ali");
//        myFamily.add("Usama");
        ArrayList<String> myFamily = new ArrayList<String>(asList("kashif","ali","ahsan"));


        //creation and setting of adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myFamily);
        myListView.setAdapter(arrayAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, myFamily.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}