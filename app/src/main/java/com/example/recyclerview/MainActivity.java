package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Model> arrayList= new ArrayList<>();
        arrayList.add(new Model(R.drawable.ic));
        arrayList.add(new Model(R.drawable.ic));
        arrayList.add(new Model(R.drawable.ic));
        arrayList.add(new Model(R.drawable.ic));
        arrayList.add(new Model(R.drawable.ic));
        arrayList.add(new Model(R.drawable.ic));
        arrayList.add(new Model(R.drawable.ic));
        arrayList.add(new Model(R.drawable.ic));
        arrayList.add(new Model(R.drawable.ic));




        recyclerView = findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
       MyAdapter adapter= new MyAdapter(arrayList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);



    }
}
