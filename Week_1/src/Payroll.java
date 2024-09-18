public class Payroll {
    public static void main(String[] args) {
        long hoursWorked;
        double payRate, taxRate;
        hoursWorked = 40;
        payRate = 10.0;
        taxRate = 0.10;
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Pay amount; " + (hoursWorked * payRate));
        System.out.println("Tax amount: " +(hoursWorked * payRate * taxRate));
    }
}
