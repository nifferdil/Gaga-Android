package com.epicodus.littlemonsters.models;

/**
 * Created by Guest on 10/21/15.
 */
public class Album {

    private String mTitle;
    private String mYear;
    private String mTracks;
    private int mImage;

    public Album(String title, String year, String tracks, int image){
        mTitle = title;
        mYear = year;
        mTracks = tracks;
        mImage = image;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getYear() {
        return mYear;
    }

    public void setYear(String year) {
        mYear = year;
    }

    public String getTracks() {
        return mTracks;
    }

    public void setTracks(String tracks) {
        mTracks = tracks;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }
}
