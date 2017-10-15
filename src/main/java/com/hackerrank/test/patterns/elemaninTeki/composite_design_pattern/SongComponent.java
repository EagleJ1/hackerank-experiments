package com.hackerrank.test.patterns.elemaninTeki.composite_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
// This acts as an interface for every Song (Leaf)
// and SongGroup (Composite) we create
public abstract class SongComponent {

    // We throw UnsupportedOperationException so that if
    // it doesn't make sense for a song, or song group
    // to inherit a method they can just inherit the
    // default implementation

    // This allows me to add components

    public void add(SongComponent newSongComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(SongComponent newSongComponent) {
        throw new UnsupportedOperationException();
    }

    public SongComponent getComponents(int componentIndex) {
        throw new UnsupportedOperationException();
    }

    public String getSongName() {
        throw new UnsupportedOperationException();
    }

    public String getBandName() {
        throw new UnsupportedOperationException();
    }

    public int getReleaseYear() {
        throw new UnsupportedOperationException();
    }

    // When this is called by a class object that extends
    // SongComponent it will print out information
    // specific to the Song or SongGroup

    public void displaySongInfo(){
        throw new UnsupportedOperationException();
    }
}
