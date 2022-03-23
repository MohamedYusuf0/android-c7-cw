package com.example.android.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle bundle = getIntent().getExtras();
        Items items = (Items) bundle.getSerializable("Items");

        ImageView itemImage = findViewById(R.id.itemImage);
        TextView itemName = findViewById(R.id.itemName);

        itemImage.setImageResource(items.getItemImage());
        itemName.setText(items.getItemName());

    }
}