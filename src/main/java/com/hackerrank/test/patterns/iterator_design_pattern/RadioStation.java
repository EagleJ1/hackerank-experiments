package com.hackerrank.test.patterns.iterator_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public class RadioStation {
    public static void main(String[] args) {
        /*
        * TRADITIONAL WAY SEEMS OKAY, BUT IT HAS BETTER WAY TO DO IT
        * LIKE A GREAT PROGRAMMER VS OK PROGRAMMER :)
        * */
        SongsOfThe70s songs70s = new SongsOfThe70s();
        SongsOfThe80s songs80s = new SongsOfThe80s();
        SongsOfThe90s songs90s = new SongsOfThe90s();
        DiscJockey discJockey = new DiscJockey(songs70s, songs80s, songs90s);
        discJockey.listTheSongs();
    }
}
