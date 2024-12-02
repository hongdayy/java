package youtube.buoi3Loop;

import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += (double) 1/i;

        }
        System.out.printf("%.3f", tong);
    }
}
