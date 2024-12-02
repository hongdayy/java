package youtube.buoi1;

import java.util.Scanner;

public class b8epkieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int thuong1 = a / b;
        float thuong2 = (float) a / b;

        System.out.println(thuong1);
        System.out.printf("%.2f", thuong2);
    }
}
