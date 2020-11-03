package Lessons;

import java.util.Arrays;

public class lessontwo {


    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    public static void arrchange() {
    int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < 10; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
          System.out.println(arr[i]);
        }



    }

    /**\
     * 2. Задать пустой целочисленный массив размером 8.
     * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    public static void fullfillarr() {
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = i * 3;
            System.out.println(arr[i]);
        }
    }

    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */

    public static void minarrtwice() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < 12; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;

             System.out.println(arr[i]);
        }
    }


    /**\
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
     *  и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    public static void diagarrone() {
        int[] [] arr = new int[8] [8];
        for (int i = 0; i < 8; i++) {
            arr[i] [i] = 1;
           System.out.println(arr[i][i]);
        }
    }


    /**\
     * 5. ** Задать одномерный массив и найти в нем минимальный и
     *  максимальный элементы (без помощи интернета);
     */
    public static void maxminarr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

            System.out.println("минимальный элемент " + Arrays.stream(arr).min().getAsInt());
            System.out.println("максимальный элемент " + Arrays.stream(arr).max().getAsInt());

    }

    /**\
     * 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
     *  метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     */
    public static boolean checkBalance(int[] arr) {

        int sumleft = 0;
        int sumright = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <= i; j++) {
                sumleft = sumleft + arr[j];
            }

            for (int k = i+1; k < arr.length ; k++) {
                sumright = sumright + arr[k];
            }

            if (sumleft == sumright) {
                return true;} else {sumleft = 0; sumright = 0;}

            }
        return false;

    }

    public static void moveOrder(int[] arr, int x) {
    int y,next=0;
// абсолютное количество сдвижений
            for (int i = 0; i < Math.abs(x); i++) {
// если положительный сдвиг
            if (x > 0) { y = arr[0]; arr[0] = arr[arr.length - 1];
                for (int j = 0; j < arr.length-1; j++) {
                   next = arr[j+1]; arr[j+1] = y; y = next;
                }
            }
            // если отицательный сдвиг
                if (x < 0) { y = arr[arr.length - 1]; arr[arr.length - 1] = arr[0];
                    for (int k = arr.length-1; k > 0; k--) {
                     next = arr[k-1];  arr[k-1] = y; y = next;
                    }
                }

            }
            // демонстрация
        for (int l = 0; l < arr.length; l++) {
            System.out.println(arr[l]);
        }
    }

    public static void main(String[] args) {
        arrchange();
        fullfillarr();
        minarrtwice();
        diagarrone();
        maxminarr();
        System.out.println(checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println(checkBalance(new int[]{2, 2, 2, 1, 2, 7, 10, 1}));
        moveOrder(new int[]{1,2,3,4,5,6}, 2);
        moveOrder(new int[]{5,6,7}, -5);
    }

}