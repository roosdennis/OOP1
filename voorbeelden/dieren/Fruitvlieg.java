package dieren;

import java.util.Iterator;

public class Fruitvlieg extends Dier implements KanVliegen {

    public Fruitvlieg(String naam) {
        super(naam);
    }

    public void vlieg() {
        System.out.println(getNaam() + " vliegt!");
    }

    @Override
    public void eet() {
        System.out.println("Fruitvlieg eet");
    }
}
