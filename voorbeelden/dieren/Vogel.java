package dieren;

public class Vogel extends Dier implements KanVliegen {

    public Vogel(String naam) {

        super(naam);
    }

    public void vlieg() {
        System.out.println(getNaam() + " vliegt!");
    }

    @Override
    public String toString() {
        return "[VOGEL]"+super.toString();
    }

    public void eet() {
        System.out.println("De vogel vindt voedsel en eet het op");
    }


}
