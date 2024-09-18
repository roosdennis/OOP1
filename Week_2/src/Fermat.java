public class Fermat {
    public static int fermat(int a, int b, int c, int n){
        if ((Math.pow(a,n) + Math.pow(b,n)) == Math.pow(c,n)){
            System.out.println("Potverdorie, Fermat had geen gelijk!");
            return 0;
        } else{
            System.out.println("Nee, dat werkt niet");
            return 1;
        }
    }

    public static void main(String[] args) {
        fermat(3,4,5,3);
    }
}
