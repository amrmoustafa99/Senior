package com.example.senior;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class ListView extends AppCompatActivity {
ArrayList<String> names=new ArrayList<>();

RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        recyclerView=findViewById(R.id.recyclerview);


        for(int i=0; i<66; i++){
            names.add("Name"+ i);
        }
        Adapter adapter=new Adapter(names);
        recyclerView.setAdapter(adapter);
    }
}