import dieren.Dier;
import dieren.Huisdier;

public class Persoon {

    private String naam;
    private Huisdier huisdier;

    // Interface Huisdier als datatype gebruiken..
    public Persoon(String naam, Huisdier huisdier) {
        this.naam = naam;
        this.huisdier = huisdier;
    }
}
