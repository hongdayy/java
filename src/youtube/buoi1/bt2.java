package youtube.buoi1;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long y = sc.nextLong();
        sc.nextLine();
        char c = sc.nextLine().charAt(0);
        float f = sc.nextFloat();
        double d = sc.nextDouble();

        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
        System.out.printf("%.2f", f);
        System.out.printf("%.9f", d);

    }
}
