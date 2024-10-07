public class Notering {
    private int positie;
    private int jaartal;
    private String artiest;
    private String titel;

    public Notering(int positie, int jaartal, String artiest, String titel) {
        this.positie = positie;
        this.jaartal = jaartal;
        this.artiest = artiest;
        this.titel = titel;
    }

    public int getPositie() {
        return positie;
    }

    public int getJaartal() {
        return jaartal;
    }

    public String getArtiest() {
        return artiest;
    }

    public String getTitel() {
        return titel;
    }

    @Override
    public String toString() {
        return positie + " | " + jaartal + " | " + artiest + " - " + titel;
    }
}
