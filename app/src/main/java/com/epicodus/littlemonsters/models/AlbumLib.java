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
                "Aura \nVenus \nG.U.Y. \nSexxx Dreams \nJewels N Drugs \nMANiCURE \nDo What U Want \nArtpop \nSwine \nDonatella \nFashion! \nMary Jane Holland \nDope \nGypsy \nApplause",
                R.drawable.artpop
        ));

        mAlbums.add(new Album(
                "Born This Way",
                "2011",
                "Marry The Night \nBorn This Way \nGovernment Hooker \nJudas \nAmericano \nHair \nScheiße \nBloody Mary \nBad Kids \nHighway Unicorn \nElectric Chapel \nYou and I \nEdge of Glory",
                R.drawable.born_this_way
        ));

        mAlbums.add(new Album (
                "Fame Monster",
                "2009",
                "Bad Romance \nAlejandro \nMonster \nSpeechless \nDance in the Dark \nTelephone \nSo Happy I Could Die \nTeeth",
                R.drawable.fame_monster
        ));

        mAlbums.add(new Album(
                "The Fame",
                "2008",
                "Just Dance \nLove Game \nPaparazzi \nPoker Face \nEh,Eh \nBeautiful, Dirty, Rich \nThe Fame \nMoney Honey \nStarstruck \nBoys Boys Boys \nProper Gangsta \nBrown Eyes \nI like It Rough \nSummerboy",
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
