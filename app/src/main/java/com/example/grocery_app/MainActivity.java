package com.example.grocery_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MotionEvent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Item> arr =new ArrayList<>();
    int[] imgs ={R.drawable.beverage ,R.drawable.bread,R.drawable.fruit,R.drawable.milk,
    R.drawable.vegitables,R.drawable.popcorn};
    String[] title ={"Beverage","Bread","Fruit","Milk","Vegetables","Popcorn"};
    String[] description ={"10","5","15","25","3","30"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0;i<6;i++){
            Item item =new Item(imgs[i],title[i],description[i]);
            arr.add(item);
        }
        MyAdapter adapter =new MyAdapter(arr);
        RecyclerView recycle =findViewById(R.id.recycle);
        recycle.setAdapter(adapter);
        LinearLayoutManager linlay =new LinearLayoutManager(this);
        recycle.setLayoutManager(linlay);
    }
}