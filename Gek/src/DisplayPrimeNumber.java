package Gek.src;

public class DisplayPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");

        // Duyệt các số từ 2 đến 99
        for (int number = 2; number < 100; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false; // Các số nhỏ hơn 2 không phải là số nguyên tố
        }

        // Kiểm tra chia hết từ 2 đến căn bậc hai của n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Nếu chia hết, không phải số nguyên tố
            }
        }

        return true; // Nếu không chia hết cho số nào, là số nguyên tố
    }
    
}
