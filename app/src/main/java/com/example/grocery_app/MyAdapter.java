package com.example.grocery_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Myviewholder> {
    private ArrayList<Item> arrlst ;

    public MyAdapter(ArrayList<Item> arrlst) {
        this.arrlst = arrlst;
    }

    @NonNull
    @Override

    public MyAdapter.Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //used to create the view holder
        LayoutInflater ly = LayoutInflater.from(parent.getContext());
        View view =ly.inflate(R.layout.custom_item ,null);
        return new Myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.Myviewholder holder, int position) {
    // Used to send data from the Arraylist to the widgets
        Item model =arrlst.get(position);
        holder.image.setImageResource(model.img);
        holder.txt1.setText(""+model.text_1);
        holder.txt2.setText(""+model.text_2);
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "You clicked on "+holder.txt1.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrlst.size();
    }

    public static class Myviewholder extends RecyclerView.ViewHolder{
    ImageView image;
    TextView txt1,txt2;
        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            image =(ImageView) itemView.findViewById(R.id.img);
            txt1=(TextView) itemView.findViewById(R.id.txt1);
            txt2 =(TextView) itemView.findViewById(R.id.txt2);
        }
    }
}

