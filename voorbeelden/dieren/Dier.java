package dieren;

public abstract class Dier {

    protected final String naam;

    public abstract void eet();

    public Dier(String naam) {
        this.naam = naam;
    }


    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return naam;
    }
}
