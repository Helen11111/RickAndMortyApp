package com.example.rickandmortyapp.view;

import android.support.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rickandmortyapp.R;
import com.example.rickandmortyapp.model.CharactarData;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    ArrayList<CharactarData> data;

    public MyAdapter(ArrayList<CharactarData> data) {
        this.data = data;
    }

    @NonNull
    @androidx.annotation.NonNull
    @Override
    public MyAdapter.MyHolder onCreateViewHolder(@NonNull @androidx.annotation.NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recycler, viewGroup, false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @androidx.annotation.NonNull MyHolder myHolder, int i) {
        CharactarData character = data.get(i);
        myHolder.name.setText(character.name);
        myHolder.status.setText(character.status);
        Picasso.get().load(character.image).into(myHolder.image);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView status;
        ImageView image;
        public MyHolder(@NonNull @androidx.annotation.NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            status = itemView.findViewById(R.id.status);
            image = itemView.findViewById(R.id.image);
        }
    }
}
