//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Auteurs aanmaken
        Author auteur1 = new Author("bla", "bla");
        Author auteur2 = new Author(" Schijt", "bak");
        // Auteurs in een array plaatsen
        Author[] auteurs = {auteur1, auteur2};

        Book boek1 = new Book("blabla", auteurs, 2023, "2");

    }
}



//Artikel: "Bringing Java to the enterprise: Oracle on its Java server strategy", 1998, auteur D. Rosenberg
//Artikel: "Context-sensitive trace inlining for ", 2013, Christian Häubl, Christian Wimmer en Hanspeter Mössenböck
//Artikel: "ARJA: Automated Repair of Java Programs via Multi-Objective Genetic Programming", 2020, Yuan Yuan en Wolfgang Banzhaf
//Boek: "Head First Design Patterns", "Eric Freeman & Elisabeth Robson", 2020, 2e editie