package youtube.buoi5Function;

import java.util.Scanner;

public class b1 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = sc.nextInt();

        if(isPrime(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
