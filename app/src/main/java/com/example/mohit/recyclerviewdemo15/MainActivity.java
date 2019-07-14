package com.example.mohit.recyclerviewdemo15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcycle;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<SingleRow> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcycle = findViewById(R.id.rcyv);

        layoutManager = new LinearLayoutManager(this);
        rcycle.setLayoutManager(layoutManager);

        String [] name= {"Mohit", "Ekansh", "Rahul", "Ritik", "Raman","Mohit", "Ekansh", "Rahul", "Ritik", "Raman"};
        String [] desig={"Developer", "Developer2", "HR", "Programmer", "Manager", "Developer", "Developer", "HR", "Programmer", "Manager"};
        int [] image= {R.drawable.user,R.drawable.user,R.drawable.user,R.drawable.user,R.drawable.user,R.drawable.user,R.drawable.user,R.drawable.user,R.drawable.user,R.drawable.user};

        arrayList = new ArrayList<>();
        for(int i=0;i<name.length;i++){
            arrayList.add(new SingleRow(name[i], desig[i], image[i]));
        }

        MyAdapter mdp = new MyAdapter(this, arrayList);
        rcycle.setAdapter(mdp);


    }
}
