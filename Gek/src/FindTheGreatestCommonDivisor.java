package Gek.src;

import java.util.Scanner;

public class FindTheGreatestCommonDivisor {

     private static final   Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a,b;
        System.out.println("Nhập vào số a");
        a = scanner.nextInt();
        System.out.println("Nhập vào số b");
        b = scanner.nextInt();

        a = Math.abs(2);
        b = Math.abs(2);

        if (a == 0 & b == 0 ){
            System.out.println("Không có ước chung lớn nhất");
        }

        while (a != b) {
            if(a >b){
                a = a - b;
            }else{
                b = b-a;
            }
        }

        System.out.println("Ước chung lớn nhất: " + a);
    }
}
