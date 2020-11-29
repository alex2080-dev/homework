package Lessons.Java2;

public class Wall implements Preps{

    int prep = 0;

    public Wall (int h) {
        this.prep = h;}

    public Wall () {
       }

    public int getPrep() {
        return prep;
    }
}
