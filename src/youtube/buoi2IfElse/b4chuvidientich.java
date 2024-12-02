package youtube.buoi2IfElse;

import java.util.Scanner;

public class b4chuvidientich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double p = 2 * 3.14 * r;
        double s = 3.14 * r * r;

        System.out.printf("%.4f\n", p);
        System.out.printf("%.4f\n", s);

        sc.close();

    }

}

