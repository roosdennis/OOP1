package dieren;

public class Hond extends Dier implements Huisdier {

    public Hond(String naam) {
        super(naam);
    }

    public void blaf() {
        System.out.println(naam + " zegt WOEF!");
    }

    @Override
    public String toString() {
        return "[HOND]"+super.toString();
    }

    public void eet() {
        System.out.println("De hond schrokt zijn bak leeg");
    }



}
