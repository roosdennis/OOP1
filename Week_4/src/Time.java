public class Time {

    //Fields (variabelen)
    // <access-modifier> <datatype> <naam> = <initialisatie>

    private int minute;
    private int second;

    //Constructors
    public Time() {
        System.out.println("Dit is de constructor");
    }
    //Methods
    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }


}