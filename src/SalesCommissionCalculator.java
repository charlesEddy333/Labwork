
import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items sold: ");
        int numberOfItems = scanner.nextInt();


        double[] itemValues = new double[numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print("Enter the value of item " + (i + 1) + ": $");
            itemValues[i] = scanner.nextDouble();
        }

        double grossSales = 0;
        for (double value : itemValues) {
            grossSales += value;
        }

        double commissionRate = 0.09;
        double commission = grossSales * commissionRate;


        double totalEarnings = 200 + commission;


        System.out.println("Total earnings: $" + totalEarnings);

        scanner.close();
    }
}
