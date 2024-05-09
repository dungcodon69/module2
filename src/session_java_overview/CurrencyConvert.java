package session_java_overview;

import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        double rate = 23000;
        System.out.println("Enter USD: ");
        Scanner scanner = new Scanner(System.in);
        double usd = scanner.nextDouble();
        double vnd = usd * rate;
        System.out.println(usd + " USD convert to VND: " + vnd);
    }
}
