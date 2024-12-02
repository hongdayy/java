package youtube.buoi1;

import java.util.Scanner;

public class b5SqrtCbrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double result = Math.sqrt(n);
        double result1 = Math.cbrt(n);

        System.out.printf("%.2f\n", result);
        System.out.printf("%.3f\n", result1);

    }
}
