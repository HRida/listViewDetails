package com.example.lab605b.listviewdetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class carDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details);

        TextView txtCar = (TextView) findViewById(R.id.text);
        TextView txtDet = (TextView) findViewById(R.id.text2);

        Intent i = getIntent();

        // Getting attached intent data
        String car = i.getStringExtra("CAR");
        String det = i.getStringExtra("DETAIL");

        // Displaying selected product name
        txtCar.setText(car);
        txtDet.setText(det);
    }
}
