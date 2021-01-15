package com.pulkeet.myrestaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView cardStarters;
    CardView cardmaincourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardStarters = findViewById(R.id.cardview_starters);
        cardmaincourse = findViewById(R.id.cardview_maincourse);

        cardStarters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent starteractivity = new Intent(MainActivity.this, startersactivity.class);
                startActivity(starteractivity);
            }
        });
        cardmaincourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maincourseactivityintent = new Intent(MainActivity.this,maincourseactivity.class);
                startActivity(maincourseactivityintent);
            }
        });

    }
}