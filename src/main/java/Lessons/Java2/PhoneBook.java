package Lessons.Java2;

import java.util.HashMap;

    public class PhoneBook  {

    HashMap<String, String> pBook = new HashMap();

    public void print() {

        System.out.println(pBook);

    }


    public void add(String k, String v) {
        if (pBook.containsKey(k)) {

            String t = pBook.get(k) + " , " + v;

            pBook.put(k,t);
        } else

            pBook.put(k,v);

    }

    public void getPhone(String k) {

                System.out.println("Телефон(ы) " + k + " : " + this.pBook.get(k));}
    }


