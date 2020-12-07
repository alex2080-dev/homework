package Lessons.Java2;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;

public class Lesson3 {

    public static void main(String[] args) {


    // Задание 1

        String[] array = new String[15];
        array[0] = "мой";
        array[1] = "дядя";
        array[2] = "самых";
        array[3] = "честных";
        array[4] = "правил";
        array[5] = "когда";
        array[6] = "шутку";
        array[7] = "занемог";
        array[8] = "уважать";
        array[9] = "себя";
        array[10] = "заставил";
        array[11] = "лучше";
        array[12] = "выдумать";
        array[13] = "мой";
        array[14] = "дядя";

        int k = 0;
        HashSet<String> set = new HashSet();

        for (int i = 0; i < array.length; i++) {
         set.add(array[i]);
        }
        System.out.println("Список слов без дубликатов:");
        System.out.println(set);

        System.out.println();

        for (String i : set) {
            for (String j : array) {
                if (i == j) k = k + 1;
                }
                System.out.println("Слово "+ i + " повторяется " + k + " раз"); k = 0;

        }

        // Задание 2

             PhoneBook phoneBook = new PhoneBook()              ;
             phoneBook.add("Ivanov", "89131231212");
             phoneBook.add("Petrov", "89141341313");
             phoneBook.add("Kirienko", "89232461427");
             phoneBook.add("Chub", "89232461212");
             phoneBook.add("Kirienko", "89232461414");
             phoneBook.add("Kirichenko", "89131427122");
             phoneBook.add("Put", "89099991427");


        System.out.println();
        System.out.println("Телефонная книга:");
        phoneBook.print();
        System.out.println();
        System.out.println("Запросы по фамилии:");
        phoneBook.getPhone ("Kirienko");
        phoneBook.getPhone("Chub");


    }




}
