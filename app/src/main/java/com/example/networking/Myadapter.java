package com.example.networking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<Viewholder> {
    private List<Mountains> mountainsList;

    public MyAdapter(List<Mountains> mountainsList) {
     this.mountainsList = mountainsList;

    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_items, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.name.setText(mountainsList.get(position).getName());
        holder.size.setText(String.valueOf(mountainsList.get(position).getSize()));
    }



    @Override
    public int getItemCount() {

        return mountainsList.size();
    }
}
