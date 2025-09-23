package Gek.src;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0 - 999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else {
            System.out.println("In words: " + convert(number));
        }
    }

    public static String convert(int number) {
        if (number < 10) {
            return oneDigit(number);
        } else if (number < 20) {
            return teen(number);
        } else if (number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            return twoDigits(tens, ones);
        } else {
            int hundreds = number / 100;
            int remainder = number % 100;
            String result = oneDigit(hundreds) + " hundred";
            if (remainder != 0) {
                result += " and " + convert(remainder);
            }
            return result;
        }
    }

    // Step 2: đọc số 1 chữ số
    public static String oneDigit(int n) {
        switch (n) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    // Step 3: đọc số < 20
    public static String teen(int n) {
        switch (n) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }

    // Step 4: đọc số >= 20 và < 100
    public static String twoDigits(int tens, int ones) {
        String result = "";
        switch (tens) {
            case 2: result = "twenty"; break;
            case 3: result = "thirty"; break;
            case 4: result = "forty"; break;
            case 5: result = "fifty"; break;
            case 6: result = "sixty"; break;
            case 7: result = "seventy"; break;
            case 8: result = "eighty"; break;
            case 9: result = "ninety"; break;
        }
        if (ones != 0) {
            result += " " + oneDigit(ones);
        }
        return result;
    }
}
