package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClick{

    RecyclerView recyclerView;
     List<ModelClass> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recylerview);

        list=new ArrayList<>();

        list.add(new ModelClass(R.drawable.vegitables, "Beverage", "Fresh vegatables from the Garden"));
        list.add(new ModelClass(R.drawable.fruit, "Fruits", "Fresh and Delicious fruits"));
        list.add(new ModelClass(R.drawable.bread, "Bread", "Breads, wheat and Beans"));
        list.add(new ModelClass(R.drawable.milk, "Milks", "Milks , shakes and Yogurt"));
        list.add(new ModelClass(R.drawable.fruit, "Fruits", "Fresh and Delicious fruits"));
        list.add(new ModelClass(R.drawable.beverage, "Bevarage", "Coffe , Tea, Juice and Soda"));
        list.add(new ModelClass(R.drawable.popcorn, "Snacks", "Popcorn , Donut and Drink"));

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        Adater adater=new Adater(list, this,this);
        recyclerView.setAdapter(adater);

        

    }

    @Override
    public void onItemClickListener(ModelClass modelClass) {
        Toast.makeText(this, modelClass.getName(), Toast.LENGTH_SHORT).show();
    }
}