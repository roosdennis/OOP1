import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String txt = "top2000.txt";
        String[] delen = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(txt))) {
            String regel;
            while ((regel = reader.readLine()) != null) {
                regel = regel.trim();
                if (!regel.isEmpty()) {
                    delen = regel.split("\t", 5);
                    int positie = Integer.parseInt(delen[0]);
                    String artiest = delen[1];
                    String titel = delen[2];
                    int jaar = Integer.parseInt(delen[3]);
                    Notering notering = new Notering(positie, jaar, artiest, titel);
                    System.out.println(notering);
                }
            }
        } catch (IOException e) {
            System.out.println("Fout bij lezen top200.txt");
        }
    }
}
