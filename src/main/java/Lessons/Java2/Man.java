package Lessons.Java2;

public class Man implements Acting {

    int jumpAv = 0;
    int runAv = 0;

    public Man (){}

    public Man (int jump, int run) {
        jumpAv = jump;
        runAv = run;


    }



    @Override
    public boolean jump (int prep) {

       if (this.jumpAv >= prep) {
           System.out.println("Человек перепрыгнул стену"); return true;
       }
       else {
           System.out.println("Человек не перепрыгнул стену"); return false;
       }
    }

    @Override
    public boolean run(int prep) {

        if (this.runAv >= prep) {
            System.out.println("Человек пробежал дорожку"); return true;
        } else
        {
            System.out.println("Человек не пробежал дорожку"); return false;
        }

    }
}
