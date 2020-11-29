package Lessons.Java2;

public class Track implements Preps{

    int prep = 0;

    public Track(int lenTrack) {
        this.prep = lenTrack;
    }

    public Track() {
    }

    public int getPrep() {
        return prep;
    }
}
