package Gek.src;

import java.util.Scanner;

public class CurrentComputerTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số ngày cần tính: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println("Tháng " + month + " có 31 ngày ");      
                break;
            case 2: 
            System.out.println("Tháng " + month + " có 28 hoặc 29 ");   
            break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("Tháng " + month + " có 30 ngày ");      

            
            default:
            System.out.println("Vui lòng nhập số tháng từ 1 đến 12");3    

                break;
        }
    }
}
