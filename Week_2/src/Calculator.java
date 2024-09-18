import java.util.Scanner;

public class Calculator {

    public static int getMenuOption()
    {
        return 0;

    }

    public static double getOperand(String prompt){
        return 0;
    }

    public static double[] getPair(){
        return null;
    }

    public static double add(double[] values){
        return 0;
    }

    public static double subtract(double[] values){
        return 0;
    }

    public static double multiply(double[] values){
        return 0;
    }

    public static double divide(double[] values){
        return 0;
    }

    public static double random(double[] values){
        return 0;
    }

    public static double distance(double[] start, double[] stop){
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1 Optellen");
        System.out.println("2 Aftrekken");
        System.out.println("3 Vermenigvuldigen");
        System.out.println("4 Delen");
        System.out.println("5 Genereer een random getal");
        System.out.println("7 Bereken afstand");
        System.out.println("Wat zou je willen doen?");
        String keuze = in.nextLine();
        //System.out.println(keuze);



    }
}
