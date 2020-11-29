package Lessons.Java2;

public class Cat implements Acting{

    int jumpAv = 0;
    int runAv = 0;

    public Cat (){}

    public Cat (int jump, int run) {
        jumpAv = jump;
        runAv = run;


    }



    @Override
    public boolean jump (int prep) {

        if (this.jumpAv >= prep) {
            System.out.println("Кот перепрыгнул стену"); return true;
        }
        else {
            System.out.println("Кот не перепрыгнул стену"); return false;
        }
    }

    @Override
    public boolean run(int prep) {

        if (this.runAv >= prep) {
            System.out.println("Кот пробежал дорожку"); return true;
        } else
        {
            System.out.println("Кот не пробежал дорожку"); return false;
        }

    }
}
