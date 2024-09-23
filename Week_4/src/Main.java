//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Time time = new Time();
//        System.out.println(time.getMinute());
        Participant deelnemer = new Participant("Jan","Visser","janvisser@hanze.nl");
        deelnemer.increaseParticipationCount();
        deelnemer.increaseParticipationCount();
        deelnemer.setFirstname("Dennis");
        System.out.println(deelnemer.toString());
        System.out.println(deelnemer.getFullName());

    }
}