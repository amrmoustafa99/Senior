package com.example.senior;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CoffeeAdapter {

    ArrayList<CoffeeMoudel> coffeeProducts;
    //constracotr

    public CoffeeAdapter(ArrayList<CoffeeMoudel> coffeeProducts) {
        this.coffeeProducts = coffeeProducts;
    }

    //void coffeholder extend Recy

    class coffeholder extends RecyclerView.ViewHolder{
        ImageView imageViewcoffee ,imageViewplus, imageMinus;
        TextView textViewCoffeeName, textViewQuantity, textViewPrice;

        public coffeholder(@NonNull View itemView) {
            super(itemView);

            imageViewcoffee=itemView.findViewById(R.id.image1);
            imageViewplus=itemView.findViewById(R.id.image1);
            imageMinus=itemView.findViewById(R.id.image1);
            textViewCoffeeName=itemView.findViewById(R.id.coffeid);
        }
    }
}
