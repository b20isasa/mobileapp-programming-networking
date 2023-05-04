package com.example.networking;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {
    private RecyclerView recyclerView;
    private ListView listView;
    private MyAdapter adapter;
    private Viewholder  viewHolder;
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
    private ArrayList<Mountains> mountainsList = new ArrayList<>();
    private ArrayAdapter<Mountains> Myadapter;
    private final String JSON_FILE = "mountains.json";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
       // adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager((new LinearLayoutManager(this)));
        setContentView(R.layout.activity_main);
        new JsonTask(this).execute(JSON_URL);
        new JsonFile(this, this).execute(JSON_FILE);
        mountainsList = new ArrayList<Mountains>();
        adapter = new MyAdapter(mountainsList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
        /*
        getJson();
        Gson gson = new Gson();
        ArrayList<Mountains> mountainsList = gson.Json(json, type);
        listOfMountains.addAll(mountainsList);
       adapter.notifyDataSetChanged();
       */

    }

}
