import java.util.ArrayList;

public class Random {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>(15);
        java.util.Random r = new java.util.Random();
        for (int i = 0; i < 15; i++) {int randomNumber = r.nextInt(100);
            integerList.add(randomNumber);
        }
        System.out.println(integerList);

        int maxValue = max(integerList);
        System.out.println(maxValue);
        }

    public static int max(ArrayList<Integer> getallen) {
        int max = getallen.get(0);
        for (int i = 1; i < getallen.size(); i++) {
            if (getallen.get(i) > max) {
                max = getallen.get(i);
            }
        }
        return max;
    }
}