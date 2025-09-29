package Gek.src;

import java.util.Scanner;

public class Application {
    private static final   Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double money = 1.000 ;
        int month  = 1 ;
        double interestRate = 1.0;
        
        System.out.println("Enter investment amount: ");
        money =scanner.nextDouble();

        System.out.println("Enter number of month: ");
        month = scanner.nextInt();

        double totalInterest = 0;
        for (int i = 0; i < month ; i++){
            totalInterest += money *(interestRate /100)/12 *month;

        }

        System.out.println("Total of interest: " + totalInterest);
    }
    

    
}
