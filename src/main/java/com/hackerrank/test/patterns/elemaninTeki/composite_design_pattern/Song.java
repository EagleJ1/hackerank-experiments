package com.hackerrank.test.patterns.elemaninTeki.composite_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public class Song extends SongComponent {

    String songName;
    String bandName;
    int releaseYear;

    public Song(String newSongName, String newBandName, int newYearReleased) {
        songName = newSongName;
        bandName = newBandName;
        releaseYear = newYearReleased;
    }

    public String getSongName() {
        return songName;
    }

    public String getBandName() {
        return bandName;
    }

    public int getReleasedYear() {
        return releaseYear;
    }

    public void displaySongInfo(){
        System.out.println(getSongName() + " was recorded by " + getBandName() + " in " + getReleasedYear());
    }
}
