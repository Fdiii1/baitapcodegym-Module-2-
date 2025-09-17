package Gek.src;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants: ");
        Scanner Scanner = new Scanner(System.in);
        System.out.print("a : ");
        double a = Scanner.nextDouble();

        System.out.print("b : ");
        double b = Scanner.nextDouble();

        System.out.print("c : ");
        double c = Scanner.nextDouble();



        if (a != 0) {
        double answer = (c - b) / a;
        System.out.printf("Equation pass with x = %f!\n", answer);
    } else {
        if (b == c) {
            System.out.print("The solution is all x!");
        } else {
            System.out.print("No solution!");
        }
    }
    }
}