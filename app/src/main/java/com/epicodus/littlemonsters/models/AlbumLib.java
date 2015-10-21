package com.epicodus.littlemonsters.models;

import com.epicodus.littlemonsters.R;

import java.util.ArrayList;

/**
 * Created by Guest on 10/21/15.
 */
public class AlbumLib {

    public ArrayList<Album> getAlbums() {
        return mAlbums;
    }

    private ArrayList<Album> mAlbums;

    public AlbumLib() {
        setAlbums();
    }

    private void setAlbums() {
        mAlbums = new ArrayList<>();

        mAlbums.add(new Album(
                "Artpop",
                "2013",
                "Applause, Swine",
                R.drawable.artpop
        ));

        mAlbums.add(new Album(
                "Born This Way",
                "2011",
                "Born This Way, Marry The Night, Edge of Glory",
                R.drawable.born_this_way
        ));

        mAlbums.add(new Album (
                "Fame Monster",
                "2009",
                "Bad Romance, Telephone, Poker Face, I Like It Rough",
                R.drawable.fame_monster
        ));

        mAlbums.add(new Album(
                "The Fame",
                "2008",
                "Just Dance, Paparazzi",
                R.drawable.the_fame
        ));
    }

    public Album nextAlbum(Album currentAlbum) {
        int index = mAlbums.indexOf(currentAlbum);
        if(index == mAlbums.size() - 1){
            return mAlbums.get(0);
        } else {
            return mAlbums.get(index + 1);
        }
    }
}
