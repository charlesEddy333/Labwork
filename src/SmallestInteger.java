import java.util.Scanner;
public class SmallestInteger{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();

        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num < smallest) {
                smallest = num;
            }
        }

      System.out.println("The smallest integer is: " + smallest);



    }
}