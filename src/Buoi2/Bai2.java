package Buoi2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("cạnh a: ");
        int a = scanner.nextInt();

        System.out.print("cạnh b: ");
        int b = scanner.nextInt();

        System.out.print("cạnh c: ");
        int c = scanner.nextInt();


        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều.");
            } else if (a == b || b == c || a == c) {
                if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                    System.out.println("Đây là tam giác vuông cân.");
                } else {
                    System.out.println("Đây là tam giác cân.");
                }
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Đây là tam giác vuông.");
            } else {
                System.out.println("Đây là tam giác thường.");
            }
        } else {
            System.out.println("Đây không là tam giác.");
        }

        scanner.close();
    }
}
