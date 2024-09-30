public class Author {
    //fields

    private String initialen ;
    private String achternaam;

    //constructor

    public Author(String initialen, String achternaam) {
        this.initialen = initialen;
        this.achternaam = achternaam;
    }

    //getters & Setters

    public String getInitialen() {
        return initialen;
    }

    public void setInitialen(String initialen) {
        this.initialen = initialen;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }
}
