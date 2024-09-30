package dieren;

public class Kat extends Dier implements Huisdier {

    public Kat(String naam) {
        super(naam);
    }

    @Override
    public String toString() {
        return "[KAT]"+super.toString();
    }

    public void eet() {
        System.out.println("De kat rooft een stuk leeg");
    }


}
