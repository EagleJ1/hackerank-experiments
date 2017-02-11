package com.hackerrank.test.patterns.composite_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public class DiscJockey {
    SongComponent songList;

    // newSongList contains every Song, SongGroup,
    // and any Songs saved in SongGroups

    public DiscJockey(SongComponent newSongList) {
        songList = newSongList;
    }

    // Calls the displaySongInfo() on every Song
    // or SongGroup stored in songList

    public void getSongList() {
        songList.displaySongInfo();
    }
}
