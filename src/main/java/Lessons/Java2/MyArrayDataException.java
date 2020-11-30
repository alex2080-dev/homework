package Lessons.Java2;

public class MyArrayDataException extends NumberFormatException{

    public MyArrayDataException(int x, int y) {
super("Ошибка типа данных [" + x + "," + y + "] ячейки массива.");
        System.out.println();
        System.out.println("Ошибка типа данных [" + x + "," + y + "] ячейки массива.");
        System.out.println();
    }
}
