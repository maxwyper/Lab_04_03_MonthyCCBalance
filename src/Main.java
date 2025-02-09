public class Main {
    public static void main(String[] args) {
        double balance = 5000.00;

        double annualInterestRate = 0.17;

        double monthlyRate = annualInterestRate / 12;

        double interestMonth1 = balance * monthlyRate;
        System.out.println("Interest due after 1 month: $" + String.format("%.2f", interestMonth1));

        balance += interestMonth1;

        double interestMonth2 = balance * monthlyRate;
        System.out.println("Interest due after 2 months: $" + String.format("%.2f", interestMonth2));
    }
}