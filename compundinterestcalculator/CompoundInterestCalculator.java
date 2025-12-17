import java.util.Scanner;

public class CompoundInterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        int time;
        int n; // number of times interest is compounded per year
        double amount;

        System.out.print("Enter principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        rate = sc.nextDouble();

        System.out.print("Enter time (in years): ");
        time = sc.nextInt();

        System.out.print("Enter number of times interest is compounded per year: ");
        n = sc.nextInt();

        // Compound Interest Formula
        amount = principal * Math.pow(1 + (rate / 100) / n, n * time);

        System.out.printf("Final Amount: INR %.2f%n", amount);

        sc.close();
    }
}
