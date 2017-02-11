package com.hackerrank.test.patterns.iterator_design_pattern;

import java.util.Iterator;

/**
 * Created by jackalhan on 2/11/17.
 */
public class DiscJockey {

    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;

    public DiscJockey(SongIterator newIter70sSongs,
                      SongIterator newIter80sSongs,
                      SongIterator newIter90sSongs) {
        this.iter70sSongs = newIter70sSongs;
        this.iter80sSongs = newIter80sSongs;
        this.iter90sSongs = newIter90sSongs;

    }

    public void listTheSongs() {
        Iterator song70s = iter70sSongs.createIterator();
        Iterator song80s = iter80sSongs.createIterator();
        Iterator song90s = iter90sSongs.createIterator();
        System.out.println("Songs of the 70s \n");
        printTheSongs(song70s);
        System.out.println("Songs of the 80s \n");
        printTheSongs(song80s);
        System.out.println("Songs of the 90s \n");
        printTheSongs(song90s);
    }

    private void printTheSongs(Iterator iterator) {
        while (iterator.hasNext()) {
            SongInfo songInfo = (SongInfo) iterator.next();
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());
        }
    }

    /*
    SongsOfThe70s songs70s;
    SongsOfThe80s songs80s;
    SongsOfThe90s songs90s;
    */

    //TRADITIONAL WAY
    /*
    public DiscJockey(SongsOfThe70s newSongs70s,
                      SongsOfThe80s newSongs80s,
                      SongsOfThe90s newSongs90s) {
        this.songs70s = newSongs70s;
        this.songs80s = newSongs80s;
        this.songs90s = newSongs90s;
    }

    //TRADITIONAL WAY
    public void showTheSongs(){

        // Because the SongInfo Objects are stored in different
        // collections everything must be handled on an individual
        // basis. This is BAD!

        ArrayList aL70sSongs = songs70s.getBestSongs();

        System.out.println("Songs of the 70s\n");

        for(int i=0; i < aL70sSongs.size(); i++){

            SongInfo bestSongs = (SongInfo) aL70sSongs.get(i);

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased() + "\n");

        }

        SongInfo[] array80sSongs = songs80s.getBestSongs();

        System.out.println("Songs of the 80s\n");

        for(int j=0; j < array80sSongs.length; j++){

            SongInfo bestSongs = array80sSongs[j];

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased() + "\n");

        }

        Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs();

        System.out.println("Songs of the 90s\n");

        for (Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();)
        {
            SongInfo bestSongs = ht90sSongs.get(e.nextElement());

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased() + "\n");

        }
    }
    */
}
