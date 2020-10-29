package Lessons;

public class LessonOne {

    public static int abcd(int a, int b, int c, int d){
     return a*(b + (c/d));
    }

    public static boolean betweentenandtwenty(int a, int b) {
        return ((a + b) <= 20) & ((a + b) >= 10);
    }

    public static void plusli(int a){
        if (a >= 0) System.out.println("положтительное"); else System.out.println("отрицательное");
    }

    public static boolean minus(int a) {
      return a < 0;
    }

    public static void hello(String name ) {
        System.out.println("Привет, " + name);
    }

    public static void yearvisli(int year){
        int d400 = year% 400;
        int d100 = year% 100;
        int d4 = year% 4;
       if ((d4 == 0) & ((d100 != 0) | (d400 == 0))) System.out.println("високосный"); else System.out.println("обычный");
    }


    public static void main(String[] args) {

        System.out.println(abcd(3,6,4,8));
        System.out.println(betweentenandtwenty(5, 5));
        plusli(-6);
        System.out.println(minus(-5));
        hello("Alex");
        yearvisli(2200);


        byte b = 5;
        short s = 32000;
        int i = 5555222;
        long l = 90000000;

        char c = 'm';

        boolean b1 = true;

        float f = 11.6F;
        double d = 75474859875975.9;


        System.out.println("hello world");
    }



}