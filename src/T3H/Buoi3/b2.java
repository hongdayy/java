package T3H.Buoi3;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("Số nhị phân của " + n + " là: 0");
        } else {
            StringBuilder binaryString = new StringBuilder();
            for (int temp = n; temp > 0; temp /= 2) {
                binaryString.insert(0, temp % 2);
            }
            System.out.println("Số nhị phân của " + n + " là: " + binaryString.toString());
        }
    }
}
