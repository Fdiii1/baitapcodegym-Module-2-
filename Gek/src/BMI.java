package Gek.src;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    double weight, height, bmi;
    System.out.print("Your weight (in kilogram):");
    weight = scanner.nextDouble();

    System.out.print("Your height (in meter):");
    height = scanner.nextDouble();

    bmi = weight / Math.pow(height, 2);

    if (bmi <18.5) {
         System.out.println("Underweight");
    }else if (18.5 <= bmi && bmi <25.5){
         System.out.println("Noemal");
    }else if(25<= bmi && bmi < 30){
         System.out.println("Underweight");
    }else{
         System.out.println("Obese");
    }
    
    }
}
