package com.example.senior;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MacCoffeeActivity extends AppCompatActivity {
ArrayList<CoffeeMoudel> coffeeProducts=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mac_coffee);
    }

    private void preparedData(){

    }
}