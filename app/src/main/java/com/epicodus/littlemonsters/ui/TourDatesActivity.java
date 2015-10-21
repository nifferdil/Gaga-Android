package com.epicodus.littlemonsters.ui;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.epicodus.littlemonsters.R;

public class TourDatesActivity extends AppCompatActivity {

    private Button mTourButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_dates);

        mTourButton = (Button) findViewById(R.id.tourButton);

        mTourButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.ladygagaconcertschedule.com/"));
                startActivity(intent);
            }
        });

    }
}
