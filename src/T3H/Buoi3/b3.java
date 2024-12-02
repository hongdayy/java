package T3H.Buoi3;

import java.util.Scanner;

public class b3 {

    // Kiểm tra số hoàn hảo
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    // Kiểm tra số Armstrong
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }

    // Kiểm tra số đối xứng
    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        return original == reversed;
    }

    // Tính tổng các chữ số
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào dãy số nguyên dương (cách nhau bằng dấu cách): ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            if (isPerfect(num)) {
                System.out.println(num + " là số hoàn hảo.");
            } else {
                System.out.println(num + " không phải là số hoàn hảo.");
            }

            if (isArmstrong(num)) {
                System.out.println(num + " là số Armstrong.");
            } else {
                System.out.println(num + " không phải là số Armstrong.");
            }

            if (isPalindrome(num)) {
                System.out.println(num + " là số đối xứng.");
            } else {
                System.out.println(num + " không phải là số đối xứng.");
            }

            System.out.println("Tổng các chữ số của " + num + " là: " + sumOfDigits(num));
            System.out.println();
        }
    }
}
