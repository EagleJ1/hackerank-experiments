package com.hackerrank.test.patterns.elemaninTeki.iterator_design_pattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jackalhan on 2/10/17.
 */
public class SongsOfThe70s implements SongIterator {

    ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s() {
        bestSongs = new ArrayList<SongInfo>();
        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);
    }

    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.add(songInfo);
    }

    // FOR TRADITIONAL WAY - NO NEED ANYMORE
    /*
    public ArrayList<SongInfo> getBestSongs() {
        return bestSongs;
    }
    */
    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
