package com.example.lap05;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class FoodAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Food> listFood;
    private int positionSelect = -1;

    public FoodAdapter(Context context, int idLayout, List<Food> listFood) {
        this.context = context;
        this.idLayout = idLayout;
        this.listFood = listFood;
    }
    @Override
    public int getCount(){
        if(listFood.size() != 0 && !listFood.isEmpty())
            return listFood.size();
        return 0;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }

        TextView tvFoodName = (TextView) convertView.findViewById(R.id.tvName),
                tvFoodReview = convertView.findViewById(R.id.tvReview),
                tvFoodPrice = convertView.findViewById(R.id.tvPrice);
        ImageView imgFoods = (ImageView) convertView.findViewById(R.id.imageView);
        final LinearLayout linearLayout = (LinearLayout) convertView.findViewById(R.id.idLinearLayout);
        final Food foods = listFood.get(position);

        if (listFood != null && !listFood.isEmpty()) {
            tvFoodName.setText(foods.getName());
            tvFoodReview.setText(foods.getReview());
            tvFoodPrice.setText(foods.getPrice());
            imgFoods.setImageResource(foods.getImgFood());
            int idImgFoods = foods.getId();
            switch (idImgFoods) {
                case 1:
                    imgFoods.setImageResource(R.drawable.tastydount);
                    break;
                case 2:
                    imgFoods.setImageResource(R.drawable.pinkdonut);
                    break;
                case 3:
                    imgFoods.setImageResource(R.drawable.donut);
                    break;
                case 4:
                    imgFoods.setImageResource(R.drawable.floattingdonut);
                    break;
                default:
                    break;
            }
        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, foods.getName(), Toast.LENGTH_LONG).show();
                positionSelect = position;
                notifyDataSetChanged();
            }
        });

        if (positionSelect == position) {
            linearLayout.setBackgroundColor(Color.WHITE);
        } else {
            linearLayout.setBackgroundColor(Color.LTGRAY);
        }
        return convertView;
    }
}
