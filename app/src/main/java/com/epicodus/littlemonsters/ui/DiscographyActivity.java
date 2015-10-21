package com.epicodus.littlemonsters.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.littlemonsters.R;
import com.epicodus.littlemonsters.models.Album;
import com.epicodus.littlemonsters.models.AlbumLib;

import org.w3c.dom.Text;

public class DiscographyActivity extends AppCompatActivity {

    private TextView mTitleLabel;
    private TextView mYearLabel;
    private TextView mTracksLabel;
    private ImageView mAlbumImage;
    private Button mNextButton;

    private AlbumLib mAlbumLib;
    private Album mCurrentAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discography);

        mTitleLabel = (TextView) findViewById(R.id.titleLabel);
        mYearLabel = (TextView) findViewById(R.id.yearLabel);
        mTracksLabel = (TextView) findViewById(R.id.tracksLabel);
        mAlbumImage = (ImageView) findViewById(R.id.albumCover);
        mNextButton = (Button) findViewById(R.id.nextButton);
        mAlbumLib =  new AlbumLib();
        mCurrentAlbum = mAlbumLib.getAlbums().get(0);

        setLayoutContent();

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentAlbum = mAlbumLib.nextAlbum(mCurrentAlbum);
                setLayoutContent();
            }
        });
    }

    private void setLayoutContent() {
        mTitleLabel.setText(mCurrentAlbum.getTitle());
        mYearLabel.setText(mCurrentAlbum.getYear());
        mTracksLabel.setText(mCurrentAlbum.getTracks());
        mAlbumImage.setImageResource(mCurrentAlbum.getImage());
    }
}
