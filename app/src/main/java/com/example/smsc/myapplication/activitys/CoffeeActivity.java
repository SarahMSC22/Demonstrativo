package com.example.smsc.myapplication.activitys;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.smsc.myapplication.lists.ListCoffe;
import com.example.smsc.myapplication.R;

public class CoffeeActivity extends AppCompatActivity{
    private ImageView principalImage;
    private ImageView topImage;
    private TextView titleText;
    private TextView descriptionText;
    private TextView nameBarText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        ListCoffe packCoffee = (ListCoffe) getIntent().getBundleExtra("pacote1").getSerializable("item");

        nameBarText = (TextView) findViewById(R.id.nameBar);
        descriptionText = (TextView) findViewById(R.id.descriptionCoffee);
        titleText = (TextView) findViewById(R.id.titleCoffee);
        topImage = (ImageView) findViewById(R.id.topBar);
        principalImage = (ImageView) findViewById(R.id.imageCoffe);

        nameBarText.setText(packCoffee.getTitle());
        principalImage.setImageResource(packCoffee.getImgId());
        descriptionText.setText(packCoffee.getDescription());
        topImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }
}
