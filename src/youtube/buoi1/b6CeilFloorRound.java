package youtube.buoi1;

import java.util.Scanner;

public class b6CeilFloorRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextFloat();
        double result1 = Math.ceil(x);
        double result2 = Math.floor(x);
        double result3 = Math.round(x);

        System.out.println((int) result2);
        System.out.println((int) result1);
        System.out.println((int) result3);
    }
}
