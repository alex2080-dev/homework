package Lessons;

import java.util.*;


public class LessonThree {

    public Scanner scanner = new Scanner(System.in);

    public static int enterx()
    {

        Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();

            while (true) {
        if (x < 0) {
            System.out.println("Число меньше 0! Введите вновь");
            x = scanner.nextInt();
        }
        if (x > 9) {
            System.out.println("Число больше 9! Введите вновь");
            x = scanner.nextInt();
        }
        break;
    }
    return x;
    }


    public static void main(String[] args) {
     int userx, cont=1;

        while (cont == 1)
        {
            int x = (int) (Math.random() * 10);
            System.out.println(x);
            System.out.println("Введите число от 0 до 9");
            userx = enterx();



                if (userx > x) {
                    System.out.println("Ваше число больше загаданного! Повторите попытку");
                    System.out.println("Введите число от 0 до 9");
                    userx = enterx();
                }

                if (userx < x) {
                    System.out.println("Ваше число меньше загаданного! Повторите попытку");
                    System.out.println("Введите число от 0 до 9");
                    userx = enterx();

                }


            if (userx == x) {
                System.out.println("Угадали!!!");
                System.out.println("Повторить игру еще раз?");


                    System.out.println("Введите:  1 – да / 0 – нет");
                    cont = enterx();
                    if (cont == 0) {
                        System.out.println("Всего доброго!!!");
                    }


            }









        }


    }
}


