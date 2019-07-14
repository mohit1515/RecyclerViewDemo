package com.example.mohit.recyclerviewdemo15;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    Context context;
    ArrayList<SingleRow> arr;

    public MyAdapter(Context context, ArrayList<SingleRow> arr) {
        this.context = context;
        this.arr = arr;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_row, viewGroup, false);
        MyViewHolder mvh = new MyViewHolder(view);
        return mvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        SingleRow s= arr.get(i);
        String name = s.getName();
        String designation = s.getDesig();
        int image = s.getImage();

        myViewHolder.tname.setText(name);
        myViewHolder.tdesig.setText(designation);
        myViewHolder.imagev.setImageResource(image);
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tname,tdesig;
        ImageView imagev;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tname = itemView.findViewById(R.id.txtname);
            imagev = itemView.findViewById(R.id.imgview);
            tdesig = itemView.findViewById(R.id.txtdesig);
        }
    }
}
