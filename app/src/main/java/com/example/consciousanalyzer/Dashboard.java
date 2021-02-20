package com.example.consciousanalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {

    //variable declaration//
    RatingBar ratingBar;
    Button submitButton;
    float numberRating;
    int numberStars;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        final RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        Button submitButton = (Button) findViewById(R.id.submitButton);

        ratingBar.setBackgroundColor(255);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int numberStars = ratingBar.getNumStars();
                float numberRating = ratingBar.getRating();
                String messageConfirmation = "You have given " + numberRating + " stars";
                    Toast.makeText(Dashboard.this, messageConfirmation, Toast.LENGTH_SHORT).show();
                }
        });

        }

    }
