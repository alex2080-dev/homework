package Lessons.Java2;


public class Lesson1 {

    public static void main(String[] args) {

        Acting[] acting = new Acting[5];
        Preps[] preps = new Preps[4];

        acting[0] = new Man(1, 165);
        acting[1] = new Robot(1, 1);
        acting[2] = new Cat(4, 55);
        acting[3] = new Robot();
        acting[4] = new Man(2, 76);

        preps[0] = new Wall(1);
        preps[1] = new Track(10);
        preps[2] = new Wall(2);
        preps[3] = new Track(70);

        int p = 0;
        boolean fin = true;

        for (int i = 0; i < acting.length; i++) {
            System.out.println("Игрок " + i + " вступил на полосу препятствий!");
            fin = true;
            for (int j = 0; j < preps.length; j++) {

                if (preps[j] instanceof Wall) {
                    if (!acting[i].jump(((Wall) preps[j]).getPrep())) {
                        System.out.println("Игрок " + i + " не прошел полосу препятствий!");
                        System.out.println();
                        fin = false;

                    }
                }


                    if (preps[j] instanceof Track) {

                        if (!acting[i].run(((Track) preps[j]).getPrep())) {
                            System.out.println("Игрок " + i + " не прошел полосу препятствий!");
                            System.out.println();
                            fin = false;


                        }
                    }


                if (fin == true) {
                    if (j == preps.length - 1) {

                        System.out.println("Ура! Игрок " + i + " прошел полосу препятствий!");
                    }} else j = preps.length;
                }



        }
    }}