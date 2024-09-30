import dieren.*;

import point.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {


    // Voorbeeld overerving
    public static void voorbeeld1() {
        // type[] naam = new type[aantal]
        Dier[] dieren = new Dier[5];
        dieren[0] = new Kat("Poes");
        dieren[1] = new Kat("Boris");
        dieren[2] = new Hond("Hector");
        dieren[3] = new Vogel("Tweet");
        dieren[4] = new Fruitvlieg("Kees");

        for(Dier dier : dieren) {
            System.out.println(dier);
            dier.eet();
            if (dier instanceof Hond) {
                ((Hond) dier).blaf();
            }
            if (dier instanceof KanVliegen) {
                KanVliegen kv = ((KanVliegen) dier);
                kv.vlieg();
            }
        }

        Persoon persoon1 = new Persoon("Erik", new Kat("Mies"));
        //Persoon persoon1 = new Persoon("Erik", new Fruitvlieg("Mies"));


    }


    // Voorbeeld Point als interface
    public static void voorbeeld2() {

        Point[] points = new Point[2];
        points[0] = new PointMutable(2, 3);
        points[1] = new PointImmutable(4, 3);
        for(Point point : points) {
            System.out.println(point);
        }


    }

    // Array en ArrayList
    public static void voorbeeld3() {


        // Array maken met 5 getallen
        int[] getallen = new int[5];
        getallen[0] = 4;
        getallen[1] = 2;
        getallen[2] = 10;
        getallen[3] = -4;
        getallen[4] = 14;
        System.out.println("Eerste element: " + getallen[0]);

        for(int getal : getallen) {
            System.out.println(getal);
        }

        // ArrayList
        System.out.println("ArrayList");
        List<Integer> getallen2 = new ArrayList<>();
        getallen2.add(Integer.valueOf(4));
        getallen2.add(14);
        getallen2.add(-14);
        getallen2.add(66);
        //getallen2.add("Hoi");

        getallen2.remove(2);

        System.out.println("Eerste element: " + getallen2.get(0));

        for(Integer getal: getallen2) {
            int i = getal + 2;
            System.out.println(i);
        }




    }

    public static void main(String[] args) {

        voorbeeld1();
        // voorbeeld2();
        // voorbeeld3();



    }
}