package Gek.src;
import java.util.Scanner;

public class UseOperator {
    public static void main(String[] args) {
        float height;
        float weight;

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Nhap vao chieu cao: ");
        height = Scanner.nextFloat();

        System.out.println("Nhap vao chieu rong: ");
        weight = Scanner.nextFloat();

        float area = height *weight;
        System.out.println("ket qua : " + area);
    }
}
