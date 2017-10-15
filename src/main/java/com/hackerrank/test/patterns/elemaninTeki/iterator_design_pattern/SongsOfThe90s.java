package com.hackerrank.test.patterns.elemaninTeki.iterator_design_pattern;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by jackalhan on 2/11/17.
 */
public class SongsOfThe90s implements SongIterator{
    Hashtable<Integer, SongInfo> bestSongs;
    int hashKey = 0;

    public SongsOfThe90s() {
        bestSongs = new Hashtable<Integer, SongInfo>();
        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad The Wet Sprocket", 1991);
    }

    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.put(hashKey, songInfo);
        hashKey++;
    }


    // FOR TRADITIONAL WAY - NO NEED ANYMORE
    /*
    public Hashtable<Integer, SongInfo> getBestSongs() {
        return bestSongs;
    }
    */

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
