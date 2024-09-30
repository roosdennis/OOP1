public class Source {
    //fields
    protected String titel;
    protected Author[] auteurs;
    protected int jaartal;

    //constructor

    public Source(String titel, Author[] auteurs, int jaartal) {
        this.titel = titel;
        this.auteurs = auteurs;
        this.jaartal = jaartal;
    }
    //getters

    public String getTitel() {
        return titel;
    }

    public Author[] getAuteur() {
        return auteurs;
    }

    public int getJaartal() {
        return jaartal;
    }

    //methods

    @Override
    public String toString() {
        return super.toString();
    }


}
