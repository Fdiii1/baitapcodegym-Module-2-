package Gek.src;

import java.util.Scanner;

public class ShowType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice ;

        do{
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter choice ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    rectangle(3, 7);
                    break;
                case 2:
                    printSquareTriangles(3);
                    break;
                case 3:
                    printSquareTriangles(4);
                    break;
                case 0:
                      System.out.println("Exiting...");
                    break;
            
                default:
                System.out.println("Invalid choice! Please try again.");
            }

        }while(choice != 0);

       
    }

    public static void  rectangle(int row ,int cols){
        for(int i = 0;i < row;i++){
            for(int j = 0; j < cols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangles(int size){
        System.out.println("Bottom-left ");
        for(int i = 1 ;i<=size;i++){
            for(int j = 1 ;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Top-left");
        for(int i =size;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        
        System.out.println("Bottom-right:");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j <= size - i) System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Top-right:");
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= size; j++) {
                if (j <= size - i) System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }

  
    public static void printIsoscelesTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    
    }
}
