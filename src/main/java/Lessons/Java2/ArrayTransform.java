package Lessons.Java2;

import java.lang.reflect.Array;

public class ArrayTransform {

    public static void ArrayTransform(String[][] arr) {
     int sum = 0;

     if ((arr.length != 4) | (arr[0].length != 4)) throw new MyArraySizeException();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {


            try {
                sum += Integer.parseInt(arr[i][j],10);
                }

            catch (NumberFormatException e) {
                throw new MyArrayDataException(i,j);

            }

            }

            }

        System.out.println("Сумма переданных в массиве чисел = "+ sum);

    }

    public static void main(String[] args) {

      //  String[][] ar = {{"1","2","3","9"},{"1","6","3","4"},{"1","2","3","4"}};

     //   String[][] ar = {{"1","2","3","9"},{"1","л","3","4"},{"1","2","3","4"},{"1","2","3","4"}};

        String[][] ar = {{"1","2","3","9"},{"1","6","5","4"},{"1","2","3","4"},{"1","2","3","4"}};
        ArrayTransform(ar);
    }

}
