public class Account {
    public static void main(String[] args) {
        double principal = 1000;
        double interestRate = 0.05;
        int years = 10;

        for (int i = 1; i <= years; i++) {
            double amount = principal * Math.pow(1 + interestRate, i);
            System.out.printf("Amount at the end of year %d: $%.2f%n", i, amount);
        }
    }
}
