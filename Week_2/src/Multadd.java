
public class Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum (double x) {
        return multadd((x * Math.exp(-x)), 1.0, (Math.sqrt(1-(Math.exp(-x)))));

    }

    public static void main(String[] args){
        // 1 x 2 + 3 (5)
        double result = multadd(1.0, 2.0,3.0);
        System.out.println("Het resultaat van 1.0, 2.0, 3.0 is " + result);
        //(sin(PI/4) x 1 + ((cos(PI/4)/2)
        double result2 = multadd(Math.sin(Math.PI / 4), 1, (Math.cos(Math.PI/4)/2));
        System.out.println("Resultaat van sin(π / 4) + cos(π / 4) / 2: " + result2);
        //log(10) x 1 + log(20)
        double result3 = multadd(Math.log(10), 1, Math.log(20));
        System.out.println("Resultaat van log(10) + log(20): " + result3);
        double result4 = expSum(2.0);
        System.out.println(result4);

    }
}
