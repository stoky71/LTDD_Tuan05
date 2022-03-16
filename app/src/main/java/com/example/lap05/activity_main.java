package com.example.lap05;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class activity_main extends AppCompatActivity {
    private List<Food> listFoods;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        listFoods = new ArrayList<>();
        listFoods.add(new Food(1,"Tasty Donut","Spicy tasty donut family","$10.00",R.drawable.tastydount));
        listFoods.add(new Food(2,"Pink Donut","Spicy tasty donut family","$20.00",R.drawable.pinkdonut));
        listFoods.add(new Food(3,"Floating Donut","Spicy tasty donut family","$10.00",R.drawable.floattingdonut));
        listFoods.add(new Food(4,"Tasty Donut","Spicy tasty donut family","$10.00",R.drawable.donut));

        FoodAdapter adapter =new FoodAdapter(this, R.layout.activity_main_custom_listview, listFoods);
        listView.setAdapter(adapter);
    }
}
