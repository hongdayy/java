package youtube.buoi2IfElse;

import java.util.Scanner;

public class nhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double f = ((double) c * 9 / 5) + 32;
        System.out.printf("%.2f", f);
    }
}
