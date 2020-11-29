package Lessons.Java2;

public class Robot implements Acting{

    int jumpAv = 0;
    int runAv = 0;

    public Robot (){}

    public Robot (int jump, int run) {
        jumpAv = jump;
        runAv = run;


    }



    @Override
    public boolean jump (int prep) {

        if (this.jumpAv >= prep) {
            System.out.println("Робот перепрыгнул стену"); return true;
        }
        else {
            System.out.println("Робот не перепрыгнул стену"); return false;
        }
    }

    @Override
    public boolean run(int prep) {

        if (this.runAv >= prep) {
            System.out.println("Робот пробежал дорожку"); return true;
        } else
        {
            System.out.println("Робот не пробежал дорожку"); return false;
        }

    }
}
