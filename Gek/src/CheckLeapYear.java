package Gek.src;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số năm cần tính: ");
        int year = scanner.nextInt();

        if(year % 4 ==0){
            if(year %100 ==0){
                if ( year % 400 == 0) {
                    System.out.println("Năm " +year + " đó là năm thuận");
                }else{
                    System.out.println("Năm " + year + " không phải là năm nhuận");
                }
            }else{
                                     System.out.println("Năm " +year + " đó là năm thuận");


            }
        }   else{
                                       System.out.println("Năm " + year + " không phải là năm nhuận");


        }
    }
}
