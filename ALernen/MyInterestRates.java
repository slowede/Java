package ALernen;

public class MyInterestRates {
    public static void main(String[] args) {
        System.out.println("Kapital?");
        double capital = new java.util.Scanner(System.in).nextDouble();

        System.out.println("Zinssatz?");
        double interestRate = new java.util.Scanner(System.in).nextDouble();

        System.out.println("Anlagedauer in Monaten?");
        int month = new java.util.Scanner(System.in).nextInt();

        double totalInterestRate = capital * interestRate * month / (12 * 100);
        System.out.printf("Zinsen: %g € %n", totalInterestRate);
    }
}
