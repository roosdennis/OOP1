public class Participant {

    //FIELDS
    private String firstname;
    private String lastname;
    private String email;
    private int participationCount;

    //CONSTRUCTORS
    Participant(String firstname, String lastname, String email){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email =email;
        participationCount = 0 ;
    }

    //METHODS

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public int getParticipationCount() {
        return participationCount;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getFullName(){
        return firstname + " " + lastname;

    }
    public void increaseParticipationCount(){
        participationCount ++;
    }
    @Override
    public String toString() {
        return String.format("%s, %s (%dx)", this.lastname, this.firstname, this.participationCount);
    }
}
