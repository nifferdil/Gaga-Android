package com.epicodus.littlemonsters.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.epicodus.littlemonsters.R;

public class MainActivity extends AppCompatActivity {

    private Button mArtistBioButton;
    private Button mDiscographyButton;
    private Button mTourDatesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArtistBioButton = (Button) findViewById(R.id.artistBioButton);
        mDiscographyButton = (Button) findViewById(R.id.discographyButton);
        mTourDatesButton = (Button) findViewById(R.id.tourDatesButton);

        mArtistBioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ArtistBioActivity.class);
                startActivity(intent);
            }
        });

        mDiscographyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DiscographyActivity.class);
                startActivity(intent);
            }
        });


        mTourDatesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TourDatesActivity.class);
                startActivity(intent);
            }
        });

    }
}
