package com.example.networking;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {
    private RecyclerView recyclerView;
    private ListView listView;
    private MyAdapter adapter;
    private ArrayList<Mountains> items;
    private ArrayAdapter<Mountains> Myadapter;
    private final String JSON_URL = "HTTPS_URL_TO_JSON_DATA_CHANGE_THIS_URL";
    private final String JSON_FILE = "mountains.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new JsonFile(this, this).execute(JSON_FILE);
        items = new ArrayList<>();
        adapter = new MyAdapter(); // getData() is a method that returns your data list
       // adapter = new ArrayAdapter<>(this, R.layout.listView_item,items);
        listView = findViewById(R.id.listView);
        listView.setAdapter(Myadapter);


        recyclerView = findViewById(R.id.recyclerView);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(Myadapter);

    }


    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
    }

}
