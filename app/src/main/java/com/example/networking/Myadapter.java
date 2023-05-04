package com.example.networking;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter {
    private ArrayList<Mountains> mountainsList;

    public MyAdapter(ArrayList<Mountains> mountainsList) {
     /*
     private listView<Mountains> listOfMountains;
     private MyAdapter(listView < Mountains > mountainsList);{
            this.mountainsList = mountainsList;
        }
      */
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
