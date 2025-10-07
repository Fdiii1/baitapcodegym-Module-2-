package Gek.src;

import java.util.Scanner;

public class PrimeNumber {
    private static final Scanner Scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao so ");
        int number =Scanner.nextInt();

        int cout =0;
        int N = 2;

        while (cout < number) {
              if (IsPrime(N)) {          
                System.out.print(N + " ");
                cout++;               
            }
            N++;
        }


    }

    public static boolean IsPrime(int num){
        if(num < 2 ){
            return false;
        }

        for(int i = 2;i< Math.sqrt(num);i++ ){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
