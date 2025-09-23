package Gek.src;

import java.util.Scanner;

public class CurrencyCoverApp {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the value of VND to convert to USD");
        double VNĐ = scanner.nextDouble();
        double USD ,md;
        md = 23000 /VNĐ ;

        System.out.println("Value when converted: " + md + "USD");

    }
}
