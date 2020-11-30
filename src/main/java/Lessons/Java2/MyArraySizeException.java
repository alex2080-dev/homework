package Lessons.Java2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{


    public MyArraySizeException() {

        super("Размер переданного массива не 4х4");
        System.out.println();
        System.out.println("Размер переданного массива не 4х4");
        System.out.println();
    }
}
